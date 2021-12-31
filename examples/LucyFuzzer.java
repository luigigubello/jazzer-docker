package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.nhncorp.lucy.security.xss.XssPreventer;

public class LucyFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    String input = data.consumeRemainingAsString();
    String htmlText;
    htmlText = XssPreventer.escape(input);
  }
}
