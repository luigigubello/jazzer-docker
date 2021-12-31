FROM ubuntu:20.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt update && apt upgrade -y && \
    apt install -y git python3 python-is-python3 openjdk-11-jdk-headless lld clang zip nano curl gnupg

WORKDIR /root

RUN git clone --depth=1 https://github.com/CodeIntelligenceTesting/jazzer.git && \
    cd jazzer && \
    # The LLVM toolchain requires ld and ld.gold to exist, but does not use them.
    touch /usr/bin/ld && \
    touch /usr/bin/ld.gold && \
    BAZEL_DO_NOT_DETECT_CPP_TOOLCHAIN=1 \
    ./bazelisk-linux-amd64 build --config=toolchain --extra_toolchains=@llvm_toolchain//:cc-toolchain-x86_64-linux \
      //agent:jazzer_agent_deploy.jar //driver:jazzer_driver
      
RUN cd /root/jazzer && curl -fsSL https://bazel.build/bazel-release.pub.gpg | gpg --dearmor > bazel.gpg && \
    mv bazel.gpg /etc/apt/trusted.gpg.d/ && \
    echo "deb [arch=amd64] https://storage.googleapis.com/bazel-apt stable jdk1.8" | tee /etc/apt/sources.list.d/bazel.list && \
    apt update && apt install -y bazel
    
COPY entrypoint.sh .

ENTRYPOINT ["/root/entrypoint.sh"]

CMD ["ExampleFuzzer"]

# ./bazelisk-linux-amd64 run //examples:
