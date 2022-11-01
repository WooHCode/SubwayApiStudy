package com.example.SubwayApi.service;

import com.example.SubwayApi.feign.SeouldaeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeouldaeSubwayService implements SubwayService{

    @Autowired
    SeouldaeFeignClient seouldaeFeignClient;
    public String getCurrentLocation(String trainNumber) {
        return "123.2";
    }
}
