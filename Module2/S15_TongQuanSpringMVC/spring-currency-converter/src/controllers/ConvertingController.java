package controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.CurrencyConverter;

@Controller
public class ConvertingController {

    @Autowired
    CurrencyConverter currencyConverter;

    @GetMapping("/convert")
    public String convertFormPage() {
        return "convert";
    }

    @PostMapping("/convert")
    public String convertValue(@RequestParam(name = "rate", required = false) Integer rate,
                               @RequestParam(name = "usd", required = false) Float usd, Model model) {
        if (rate == null || usd == null) {
            model.addAttribute("message", currencyConverter.getMessageError());
            return "convert";
        } else {
            model.addAttribute("rate", rate);
            model.addAttribute("usd", usd);
            model.addAttribute("vnd", currencyConverter.convert(rate, usd));
            return "result";
        }
    }

    int a;
    int c;
    int b;
//    @PostMapping("/convert")
//    public ModelAndView convertValue(@RequestParam float rate, @RequestParam float usd) {
//        ModelAndView resultModelAndView = new ModelAndView("result");
//        float vnd = rate * usd;
//        resultModelAndView.addObject("rate", rate);
//        resultModelAndView.addObject("usd", usd);
//        resultModelAndView.addObject("vnd", vnd);
//        return resultModelAndView;
//    }
}
