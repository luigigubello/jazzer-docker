package com.example;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class JavaJwtFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    String token = data.consumeRemainingAsString();
    try {
      DecodedJWT jwt = JWT.decode(token);
    } catch (JWTDecodeException ignored) {
   }
  }
}
