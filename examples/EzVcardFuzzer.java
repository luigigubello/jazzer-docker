package com.example;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class EzVcardFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
      VCard vcard = Ezvcard.parse(data.consumeRemainingAsString()).first(); 
  }
}
