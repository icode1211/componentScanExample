package com.example.demo.example1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Component (@Controller, @Service, @Repository) 어노테이션으로 등록한 빈 확인해보기
 *  myComponent1, myComponent2, myComponent3, myComponent4
 */
class DemoApplicationExample1Test {
    @Test
    public void scanTest() {
        // myComponent1, myComponent2, myComponent3, myComponent4 빈 확인
        ApplicationContext ac = new AnnotationConfigApplicationContext(DemoApplicationExample1.class);
        Arrays.stream(ac.getBeanDefinitionNames())
                .filter(bean -> !bean.contains("org.springframework") && !bean.contains("componentScanAnnotationFilterApp"))
                .sorted()
                .forEach(System.out::println);
    }
}