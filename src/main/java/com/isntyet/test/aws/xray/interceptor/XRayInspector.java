package com.isntyet.test.aws.xray.interceptor;

import com.amazonaws.xray.entities.Subsegment;
import com.amazonaws.xray.spring.aop.AbstractXRayInterceptor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
public class XRayInspector extends AbstractXRayInterceptor {
    @Override
    protected Map<String, Map<String, Object>> generateMetadata(ProceedingJoinPoint proceedingJoinPoint, Subsegment subsegment) {
        return super.generateMetadata(proceedingJoinPoint, subsegment);
    }

    @Override
//    @Pointcut("@within(com.amazonaws.xray.spring.aop.XRayEnabled) && bean(*Controller)")
    @Pointcut("within(com.isntyet.test.aws.xray.controller.XrayController)")
    public void xrayEnabledClasses() {}

}
