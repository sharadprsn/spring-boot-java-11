package com.cb.app.controller;

import com.cb.util.helper.AppHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    AppHelper appHelper;

    @GetMapping("/health")
    public String getStatus() {
        return appHelper.toUpper("Hello");
    }
}
