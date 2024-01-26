package com.jothishy.sltsp.util;

import java.util.HashMap;
import java.util.Map;

public class TeluguNakshatraTranslator {
    private static final Map<String, String> TELUGU_NAKSHATRA_MAP = new HashMap<>();

    static {
        TELUGU_NAKSHATRA_MAP.put("Ashwini", "అశ్వయుజ");
        TELUGU_NAKSHATRA_MAP.put("Bharani", "భారణి");
        TELUGU_NAKSHATRA_MAP.put("Krittika", "కృత్తిక");
        TELUGU_NAKSHATRA_MAP.put("Rohini", "రోహిణి");
        TELUGU_NAKSHATRA_MAP.put("Mrigashira", "మృగశిర");
        TELUGU_NAKSHATRA_MAP.put("Ardra", "ఆర్ద్ర");
        TELUGU_NAKSHATRA_MAP.put("Punarvasu", "పునర్వసు");
        TELUGU_NAKSHATRA_MAP.put("Pushya", "పుష్య");
        TELUGU_NAKSHATRA_MAP.put("Ashlesha", "ఆశ్లేష");
        TELUGU_NAKSHATRA_MAP.put("Magha", "మఘ");
        TELUGU_NAKSHATRA_MAP.put("Purva Phalguni", "పూర్వ ఫాల్గుణి");
        TELUGU_NAKSHATRA_MAP.put("Uttara Phalguni", "ఉత్తర ఫాల్గుణి");
        TELUGU_NAKSHATRA_MAP.put("Hasta", "హస్త");
        TELUGU_NAKSHATRA_MAP.put("Chitra", "చిత్ర");
        TELUGU_NAKSHATRA_MAP.put("Swati", "స్వాతి");
        TELUGU_NAKSHATRA_MAP.put("Vishakha", "విశాఖ");
        TELUGU_NAKSHATRA_MAP.put("Anuradha", "అనురాధ");
        TELUGU_NAKSHATRA_MAP.put("Jyeshtha", "జ్యేష్ఠ");
        TELUGU_NAKSHATRA_MAP.put("Mula", "మూల");
        TELUGU_NAKSHATRA_MAP.put("Purva Ashadha", "పూర్వ ఆషాఢ");
        TELUGU_NAKSHATRA_MAP.put("Uttara Ashadha", "ఉత్తర ఆషాఢ");
        TELUGU_NAKSHATRA_MAP.put("Shravana", "శ్రావణ");
        TELUGU_NAKSHATRA_MAP.put("Dhanishta", "ధనిష్ఠ");
        TELUGU_NAKSHATRA_MAP.put("Shatabhisha", "శతభిష");
        TELUGU_NAKSHATRA_MAP.put("Purva Bhadrapada", "పూర్వ భాద్రపద");
        TELUGU_NAKSHATRA_MAP.put("Uttara Bhadrapada", "ఉత్తర భాద్రపద");
        TELUGU_NAKSHATRA_MAP.put("Revati", "రేవతి");
    }

    public static String translateToTeluguNakshatra(String nakshatra) {
        return TELUGU_NAKSHATRA_MAP.getOrDefault(nakshatra, nakshatra);
    }
}
