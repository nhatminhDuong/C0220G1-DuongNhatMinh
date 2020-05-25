package com.codegym.services.impl;

import com.codegym.services.TimeGenerationService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TimeGenerationServiceImpl implements TimeGenerationService {
    @Override
    public String autoGenerate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }
}
