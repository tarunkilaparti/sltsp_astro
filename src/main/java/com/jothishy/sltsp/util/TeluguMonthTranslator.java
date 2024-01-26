package com.jothishy.sltsp.util;

import java.util.HashMap;
import java.util.Map;

public class TeluguMonthTranslator {
    private static final Map<String, String> TELUGU_MONTH_MAP = new HashMap<>();

    static {
        TELUGU_MONTH_MAP.put("JANUARY", "జనవరి");
        TELUGU_MONTH_MAP.put("FEBRUARY", "ఫిబ్రవరి");
        TELUGU_MONTH_MAP.put("MARCH", "మార్చి");
        TELUGU_MONTH_MAP.put("APRIL", "ఏప్రిల్");
        TELUGU_MONTH_MAP.put("MAY", "మే");
        TELUGU_MONTH_MAP.put("JUNE", "జూన్");
        TELUGU_MONTH_MAP.put("JULY", "జులై");
        TELUGU_MONTH_MAP.put("AUGUST", "ఆగస్టు");
        TELUGU_MONTH_MAP.put("SEPTEMBER", "సెప్టెంబర్");
        TELUGU_MONTH_MAP.put("OCTOBER", "అక్టోబర్");
        TELUGU_MONTH_MAP.put("NOVEMBER", "నవంబర్");
        TELUGU_MONTH_MAP.put("DECEMBER", "డిసెంబర్");
    }

    public static String translateToTeluguMonth(String month) {
        return TELUGU_MONTH_MAP.getOrDefault(month, month);
    }
}
