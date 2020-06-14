package com.shelton.cloud.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoTest {

    private String demoStr;

    public String getDemoStr() {
        return demoStr;
    }
}
