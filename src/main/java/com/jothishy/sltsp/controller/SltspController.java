package com.jothishy.sltsp.controller;

import com.jothishy.sltsp.model.InfoModel;
import com.jothishy.sltsp.service.AstroService;
import com.jothishy.sltsp.util.TeluguMonthTranslator;
import com.jothishy.sltsp.util.TeluguNakshatraTranslator;
import com.jothishy.sltsp.util.TeluguRaashiTranslator;
import com.jothishy.sltsp.util.TeluguWeekdayTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SltspController {

    private final AstroService astroService;

    @Autowired
    public SltspController(AstroService astroService) {
        this.astroService = astroService;
    }

    @GetMapping("/infoForm")
    public String displayForm() {
        return "infoForm";
    }

    @PostMapping("/astro-details")
    public String getAstroDetails(InfoModel infoModel, Model model) {
        String raashi = astroService.calcRaashi(infoModel.getDateOfBirth());
        String nakshatra = astroService.calcNakshatra(infoModel.getHours(), infoModel.getMinutes());
        int paadam = astroService.calcPaada(infoModel.getHours(), infoModel.getMinutes());

        model.addAttribute("name", infoModel.getFullName());
        model.addAttribute("dob", infoModel.getDateOfBirth());
        model.addAttribute("month", TeluguMonthTranslator.translateToTeluguMonth(infoModel.getDateOfBirth().getMonth().toString()));
        model.addAttribute("weekDay", TeluguWeekdayTranslator.translateToTeluguWeekDay(infoModel.getDateOfBirth().getDayOfWeek().toString()));
        model.addAttribute("raashi", TeluguRaashiTranslator.translateToTeluguRaashi(raashi));
        model.addAttribute("nakshatra", TeluguNakshatraTranslator.translateToTeluguNakshatra(nakshatra));
        model.addAttribute("paadam", paadam);

        return "astroResponse";
    }
}
