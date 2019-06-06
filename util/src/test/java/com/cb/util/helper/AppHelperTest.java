package com.cb.util.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppHelperTest {

    AppHelper appHelper;

    @BeforeEach
    public void setup() {
        this.appHelper = new AppHelper();
    }

    @Test
    public void toUpperTest() {
        assertEquals("HELLO", this.appHelper.toUpper("hello"));
    }
}
