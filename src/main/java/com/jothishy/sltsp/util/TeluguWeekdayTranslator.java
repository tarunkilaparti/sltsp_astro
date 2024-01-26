package com.jothishy.sltsp.util;

import java.util.HashMap;
import java.util.Map;

public class TeluguWeekdayTranslator {
    private static final Map<String, String> TELUGU_WEEK_MAP = new HashMap<>();

    static {
        TELUGU_WEEK_MAP.put("SUNDAY", "ఆదివారం");
        TELUGU_WEEK_MAP.put("MONDAY", "సోమవారం");
        TELUGU_WEEK_MAP.put("TUESDAY", "మంగళవారం");
        TELUGU_WEEK_MAP.put("WEDNESDAY", "బుధవారం");
        TELUGU_WEEK_MAP.put("THURSDAY", "గురువారం");
        TELUGU_WEEK_MAP.put("FRIDAY", "శుక్రవారం");
        TELUGU_WEEK_MAP.put("SATURDAY", "శనివారం");
    }

    public static String translateToTeluguWeekDay(String weekDay) {
        return TELUGU_WEEK_MAP.getOrDefault(weekDay, weekDay);
    }
}
