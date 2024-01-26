package com.jothishy.sltsp.util;

import java.util.HashMap;
import java.util.Map;

public class TeluguRaashiTranslator {
    private static final Map<String, String> TELUGU_RAASHI_MAP = new HashMap<>();
    
    static {
        TELUGU_RAASHI_MAP.put("Aries", "మేషం");
        TELUGU_RAASHI_MAP.put("Taurus", "వృషభం");
        TELUGU_RAASHI_MAP.put("Gemini", "మిథునం");
        TELUGU_RAASHI_MAP.put("Cancer", "కర్కాటకం");
        TELUGU_RAASHI_MAP.put("Leo", "సింహం");
        TELUGU_RAASHI_MAP.put("Virgo", "కన్య");
        TELUGU_RAASHI_MAP.put("Libra", "తులా");
        TELUGU_RAASHI_MAP.put("Scorpio", "వృశ్చికం");
        TELUGU_RAASHI_MAP.put("Sagittarius", "ధనురాసి");
        TELUGU_RAASHI_MAP.put("Capricorn", "మకరరాశి");
        TELUGU_RAASHI_MAP.put("Aquarius", "కుంభరాశి");
        TELUGU_RAASHI_MAP.put("Pisces", "మీనరాశి");
    }

    public static String translateToTeluguRaashi(String raashi) {
        return TELUGU_RAASHI_MAP.getOrDefault(raashi, raashi);
    }
}
