package services;

import models.SimpleDictionary;
import org.springframework.stereotype.Service;

@Service
public class SearchingWordImpl implements SearchingWord {
    @Override
    public String getVietnameseWord(String englishWord) {
        String foundWord = SimpleDictionary.getSimpleDictionary().get(englishWord);
        if (foundWord == null) {
            foundWord = "Không tìm thấy từ phù hợp";
        }
        return foundWord;
    }
}
