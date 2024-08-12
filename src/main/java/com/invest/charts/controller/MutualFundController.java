package com.invest.charts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class MutualFundController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/navdata")
    public Map<String, Object> getNavData() {
        String url = "https://api.mfapi.in/mf/118989";
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);
        return response;
    }
}
