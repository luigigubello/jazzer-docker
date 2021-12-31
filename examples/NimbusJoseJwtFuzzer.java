package com.example;

import com.nimbusds.jose.*;
import com.nimbusds.jwt.*;
import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class NimbusJoseJwtFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    String token = data.consumeRemainingAsString();
    SignedJWT signedJWT;
    try {
      signedJWT = SignedJWT.parse(token);
    } catch (java.text.ParseException ignored) {
    }
  }
}
