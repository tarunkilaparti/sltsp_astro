package com.jothishy.sltsp.util;

public class NakshatraQuarter {
    private static final double[] NAKSHATRA_START_LONGITUDES = {
            0.0, 13.20, 26.40, 40.00, 53.20, 66.40, 80.00, 93.20, 106.40, 120.00,
            133.20, 146.40, 160.00, 173.20, 186.40, 200.00, 213.20, 226.40, 240.00,
            253.20, 266.40, 280.00, 293.20, 306.40, 320.00, 333.20, 346.40, 360.00
    };

    public static int calculateNakshatraPada(double moonLongitude) {
        int nakshatra = -1;
        for (int i = 0; i < NAKSHATRA_START_LONGITUDES.length; i++) {
            if (moonLongitude < NAKSHATRA_START_LONGITUDES[i]) {
                nakshatra = i;
                break;
            }
        }

        if (nakshatra != -1) {
            double nakshatraStart = NAKSHATRA_START_LONGITUDES[nakshatra - 1];
            double pada = (moonLongitude - nakshatraStart) / 3.33 + 1;

            return (int) Math.floor(pada);
        }
        return -1;
    }
}
