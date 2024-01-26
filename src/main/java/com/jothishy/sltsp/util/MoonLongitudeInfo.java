package com.jothishy.sltsp.util;

import java.util.HashMap;
import java.util.Map;

public class MoonLongitudeInfo {
    private static final Map<String, Double> NAKSHATRA_START_LONGITUDES = new HashMap<>();

    static {
        NAKSHATRA_START_LONGITUDES.put("Ashwini", 0.0);
        NAKSHATRA_START_LONGITUDES.put("Bharani", 13.20);
        NAKSHATRA_START_LONGITUDES.put("Krittika", 26.40);
        NAKSHATRA_START_LONGITUDES.put("Rohini", 40.00);
        NAKSHATRA_START_LONGITUDES.put("Mrigashira", 53.20);
        NAKSHATRA_START_LONGITUDES.put("Ardra", 66.40);
        NAKSHATRA_START_LONGITUDES.put("Punarvasu", 80.00);
        NAKSHATRA_START_LONGITUDES.put("Pushya", 93.20);
        NAKSHATRA_START_LONGITUDES.put("Ashlesha", 106.40);
        NAKSHATRA_START_LONGITUDES.put("Magha", 120.00);
        NAKSHATRA_START_LONGITUDES.put("Purva Phalguni", 133.20);
        NAKSHATRA_START_LONGITUDES.put("Uttara Phalguni", 146.40);
        NAKSHATRA_START_LONGITUDES.put("Hasta", 160.00);
        NAKSHATRA_START_LONGITUDES.put("Chitra", 173.20);
        NAKSHATRA_START_LONGITUDES.put("Swati", 186.40);
        NAKSHATRA_START_LONGITUDES.put("Vishakha", 200.00);
        NAKSHATRA_START_LONGITUDES.put("Anuradha", 213.20);
        NAKSHATRA_START_LONGITUDES.put("Jyeshtha", 226.40);
        NAKSHATRA_START_LONGITUDES.put("Mula", 240.00);
        NAKSHATRA_START_LONGITUDES.put("Purva Ashadha", 253.20);
        NAKSHATRA_START_LONGITUDES.put("Uttara Ashadha", 266.40);
        NAKSHATRA_START_LONGITUDES.put("Shravana", 280.00);
        NAKSHATRA_START_LONGITUDES.put("Dhanishta", 293.20);
        NAKSHATRA_START_LONGITUDES.put("Shatabhisha", 306.40);
        NAKSHATRA_START_LONGITUDES.put("Purva Bhadrapada", 320.00);
        NAKSHATRA_START_LONGITUDES.put("Uttara Bhadrapada", 333.20);
        NAKSHATRA_START_LONGITUDES.put("Revati", 346.40);
    }

    public static double getMoonLongitude(String nakshatraName) {
        return NAKSHATRA_START_LONGITUDES.getOrDefault(nakshatraName, -1.0);
    }
}
