package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class CommonMarkFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    String input = data.consumeRemainingAsString();
    String htmlText;
    try {
      Parser parser = Parser.builder().build();
      Node document = parser.parse(input);
      HtmlRenderer renderer = HtmlRenderer.builder().escapeHtml(true).build();
      htmlText = renderer.render(document);
    } catch (ClassCastException ignored) {
    }
  }
}
