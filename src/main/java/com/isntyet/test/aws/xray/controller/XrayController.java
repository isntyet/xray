package com.isntyet.test.aws.xray.controller;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.isntyet.test.aws.xray.service.XrayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@XRayEnabled
public class XrayController {

    private XrayService xrayService;

    public XrayController(XrayService xrayService){
        this.xrayService = xrayService;
    }


    @GetMapping("/test")
    public String test(){
        String testStr = xrayService.testStr();
        System.out.println(testStr);

        return testStr;
    }
}
