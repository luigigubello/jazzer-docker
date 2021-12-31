package com.example;

import org.jsoup.Jsoup;
import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class JSoupFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    try {
      Jsoup.parse(data.consumeRemainingAsString());
    } catch (IllegalArgumentException ignored) {
    }
  }
}
