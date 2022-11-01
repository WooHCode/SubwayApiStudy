package com.example.SubwayApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class commonSubwayService {
    @Autowired
    Map<String,SubwayService> subwayServices;



    public String getLocation(String station, String trainNumber){
        SubwayService subwayService = null;

        for (String key : subwayServices.keySet()){
            if(key.substring(0,station.length()).equals(station.toLowerCase())){
                subwayService = subwayServices.get(key);
                break;
            }
        }
        return subwayService.getCurrentLocation(trainNumber);

//        if (station.equals("건대입구")){
//            return kundaeSubwayService.getCurrentLocation(trainNumber);
//        } else if (station.equals("서울대입구")){
//            return seouldaeSubwayService.getCurrentLocation(trainNumber);
//        }
//        return "123.3";
    }
}
