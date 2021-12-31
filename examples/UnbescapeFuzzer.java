package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import org.unbescape.xml.XmlEscape;

public class UnbescapeFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    String input = data.consumeRemainingAsString();
    String xmlText;
    xmlText = XmlEscape.escapeXml11(input);
  }
}
