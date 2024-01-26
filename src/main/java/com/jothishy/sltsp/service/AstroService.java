package com.jothishy.sltsp.service;

import com.jothishy.sltsp.util.MoonLongitudeInfo;
import com.jothishy.sltsp.util.NakshatraQuarter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class AstroService {

    public String calcRaashi(LocalDate dob) {
        Month month = dob.getMonth();
        int day = dob.getDayOfMonth();

        if ((month == Month.MARCH && day >= 21) || (month == Month.APRIL && day <= 19)) {
            return "Aries";
        } else if ((month == Month.APRIL && day >= 20) || (month == Month.MAY && day <= 20)) {
            return "Taurus";
        } else if ((month == Month.MAY && day >= 21) || (month == Month.JUNE && day <= 20)) {
            return "Gemini";
        } else if ((month == Month.JUNE && day >= 21) || (month == Month.JULY && day <= 22)) {
            return "Cancer";
        } else if ((month == Month.JULY && day >= 23) || (month == Month.AUGUST && day <= 22)) {
            return "Leo";
        } else if ((month == Month.AUGUST && day >= 23) || (month == Month.SEPTEMBER && day <= 22)) {
            return "Virgo";
        } else if ((month == Month.SEPTEMBER && day >= 23) || (month == Month.OCTOBER && day <= 22)) {
            return "Libra";
        } else if ((month == Month.OCTOBER && day >= 23) || (month == Month.NOVEMBER && day <= 21)) {
            return "Scorpio";
        } else if ((month == Month.NOVEMBER && day >= 22) || (month == Month.DECEMBER && day <= 21)) {
            return "Sagittarius";
        } else if ((month == Month.DECEMBER && day >= 22) || (month == Month.JANUARY && day <= 19)) {
            return "Capricorn";
        } else if ((month == Month.JANUARY && day >= 20) || (month == Month.FEBRUARY && day <= 18)) {
            return "Aquarius";
        } else {
            return "Pisces";
        }
    }

    public String calcNakshatra(int hrs, int mins) {
        int minutes = hrs * 60 + mins;

        if (inRangeOf(minutes, 0, 53)) {
            return "Ashwini";
        } else if (inRangeOf(minutes, 54, 106)) {
            return "Bharani";
        } else if (inRangeOf(minutes, 107, 160)) {
            return "Krittika";
        } else if (inRangeOf(minutes, 161, 213)) {
            return "Rohini";
        } else if (inRangeOf(minutes, 214, 266)) {
            return "Mrigashira";
        } else if (inRangeOf(minutes, 267, 320)) {
            return "Ardra";
        } else if (inRangeOf(minutes, 321, 373)) {
            return "Punarvasu";
        } else if (inRangeOf(minutes, 374, 426)) {
            return "Pushya";
        } else if (inRangeOf(minutes, 427, 480)) {
            return "Ashlesha";
        } else if (inRangeOf(minutes, 481, 533)) {
            return "Magha";
        } else if (inRangeOf(minutes, 534, 586)) {
            return "Purva Phalguni";
        } else if (inRangeOf(minutes, 587, 640)) {
            return "Uttara Phalguni";
        } else if (inRangeOf(minutes, 641, 693)) {
            return "Hasta";
        } else if (inRangeOf(minutes, 694, 746)) {
            return "Chitra";
        } else if (inRangeOf(minutes, 747, 800)) {
            return "Swati";
        } else if (inRangeOf(minutes, 801, 853)) {
            return "Vishakha";
        } else if (inRangeOf(minutes, 854, 906)) {
            return "Anuradha";
        } else if (inRangeOf(minutes, 907, 960)) {
            return "Jyeshtha";
        } else if (inRangeOf(minutes, 961, 1013)) {
            return "Mula";
        } else if (inRangeOf(minutes, 1014, 1066)) {
            return "Purva Ashadha";
        } else if (inRangeOf(minutes, 1067, 1120)) {
            return "Uttara Ashadha";
        } else if (inRangeOf(minutes, 1121, 1173)) {
            return "Shravana";
        } else if (inRangeOf(minutes, 1174, 1226)) {
            return "Dhanishta";
        } else if (inRangeOf(minutes, 1227, 1280)) {
            return "Shatabhisha";
        } else if (inRangeOf(minutes, 1281, 1333)) {
            return "Purva Bhadrapada";
        } else if (inRangeOf(minutes, 1334, 1386)) {
            return "Uttara Bhadrapada";
        } else if (inRangeOf(minutes, 1387, 1440)) {
            return "Revati";
        } else {
            return "Invalid Time";
        }
    }

    private static boolean inRangeOf(int mins, int start, int end) {
        return mins >= start && mins <= end;
    }

    public int calcPaada(int hrs, int mins) {
        return NakshatraQuarter.calculateNakshatraPada(MoonLongitudeInfo.getMoonLongitude(calcNakshatra(hrs, mins)));
    }

    public int calcThithi () {
        return 1;
    }
}
