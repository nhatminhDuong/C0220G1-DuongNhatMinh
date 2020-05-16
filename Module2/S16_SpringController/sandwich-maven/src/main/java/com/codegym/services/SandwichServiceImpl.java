package com.codegym.services;

import com.codegym.model.Sandwich;
import org.springframework.stereotype.Service;

@Service
public class SandwichServiceImpl implements SandwichService{
    public String showAddedCondiments(Sandwich sandwich) {
        String addedCondiments = "";
        if (sandwich.isLettuceTicked()) {
            addedCondiments += ", Lettuce";
        }
        if (sandwich.isTomatoTicked()) {
            addedCondiments += ", Tomato";
        }
        if (sandwich.isMustardTicked()) {
            addedCondiments += ", Mustard";
        }
        if (sandwich.isSproutsTicked()) {
            addedCondiments += ", Sprouts";
        }
        if (!addedCondiments.equals("")) {
            addedCondiments += ".";
            addedCondiments = addedCondiments.substring(1);
            addedCondiments = "<h3 style='color: green'>" + addedCondiments + "</h3>";
        } else {
            addedCondiments = "<h3 style='color: orange'>No condiment added.</h3>";
        }
        return addedCondiments;
    }
}
