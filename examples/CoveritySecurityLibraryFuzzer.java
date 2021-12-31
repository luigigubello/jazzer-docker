package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.coverity.security.Escape;

public class CoveritySecurityLibraryFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    String input = data.consumeRemainingAsString();
    String htmlText;
    htmlText = Escape.html(input);
  }
}
