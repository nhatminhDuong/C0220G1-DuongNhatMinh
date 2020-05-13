package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.SearchingWord;

@Controller
public class DictionaryController {
    @Autowired
    SearchingWord searchingWord;

    @GetMapping("/search")
    String search(@RequestParam(name = "e-word") String englishWord, Model model) {
        String vietnameseWord = searchingWord.getVietnameseWord(englishWord);
        model.addAttribute("englishWord", englishWord);
        model.addAttribute("vietnameseWord", vietnameseWord);
        return "index";
    }
}
