package com.qishon.zuul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * portal controller
 *
 * @author linux_china
 */
@RestController
public class PortalController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String index() {
        ResponseEntity<String> entity = restTemplate.getForEntity("http://demo/welcome", String.class);
        return entity.getBody() + " Jacky";
    }
}
