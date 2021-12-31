package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;

public class GwtFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    String input = data.consumeRemainingAsString();
    String xmlText;
    xmlText = SafeHtmlUtils.htmlEscape(input);
  }
}
