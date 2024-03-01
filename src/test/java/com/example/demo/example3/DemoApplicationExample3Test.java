package com.example.demo.example3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Component 어노테이션으로 등록한 빈 확인해보기
 *  myComponent, myComponentHelloSpring(빈 이름을 따로 지정)
 */
class DemoApplicationExample3Test {
    @Test
    public void scanTest() {

        ApplicationContext ac = new AnnotationConfigApplicationContext(DemoApplicationExample3.class);
        Arrays.stream(ac.getBeanDefinitionNames())
                .filter(bean -> !bean.contains("org.springframework") && !bean.contains("componentScanAnnotationFilterApp"))
                .sorted()
                .forEach(System.out::println);
    }

}