package com.example.SubwayApi.controller;

import com.example.SubwayApi.service.commonSubwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
    @Autowired
    private commonSubwayService commonSubwayService;

    @GetMapping("/location") // 현재 가장 최근 위치를 불러온다, 어느 역인지, 몇호선인지
    public String getLocation(
            @RequestParam String station,@RequestParam String trainNumber
    ){
      return commonSubwayService.getLocation(station, trainNumber);

    }
}
