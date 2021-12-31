#!/bin/bash
cp -r /var/fuzzer/examples/* /root/jazzer/examples/src/main/java/com/example/
cp /var/fuzzer/maven.bzl /root/jazzer/
cp /var/fuzzer/BUILD.bazel /root/jazzer/examples/
cd /root/jazzer
REPIN=1 bazel run @unpinned_maven//:pin
./bazelisk-linux-amd64 run //examples:$1
#$@
