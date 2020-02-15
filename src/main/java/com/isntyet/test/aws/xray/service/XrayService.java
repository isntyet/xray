package com.isntyet.test.aws.xray.service;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import org.springframework.stereotype.Service;

@Service
@XRayEnabled
public class XrayService {

    public String testStr(){
        return "test1";
    }
}
