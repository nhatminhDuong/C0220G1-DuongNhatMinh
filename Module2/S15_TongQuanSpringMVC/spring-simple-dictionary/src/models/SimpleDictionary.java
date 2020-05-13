package models;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


public class SimpleDictionary {
    private static Map<String, String> simpleDictionary = new HashMap<>();
    static {
        simpleDictionary.put("hello", "xin chào");
        simpleDictionary.put("you", "bạn");
        simpleDictionary.put("book", "quyển sách");
        simpleDictionary.put("pen", "cái bút");
        simpleDictionary.put("bye", "tạm biệt");
    }

    public static Map<String, String> getSimpleDictionary() {
        return simpleDictionary;
    }
}
