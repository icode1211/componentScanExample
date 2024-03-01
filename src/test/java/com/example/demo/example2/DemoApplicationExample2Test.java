package com.example.demo.example2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 커스텀하게 만든 어노테이션(@MyAnnotation) 으로 빈 등록한 myCustom 확인해보기
 * myComponentTest가 빈으로 등록되지 않은 것 확인!
 */
class DemoApplicationExample2Test {
    @Test
    public void scanTest() {
        /*
         * myCustom이 빈으로 등록
         * myComponentTest가 빈으로 등록되지 않은 것 확인!
         */
        ApplicationContext ac = new AnnotationConfigApplicationContext(DemoApplicationExample2.class);
        Arrays.stream(ac.getBeanDefinitionNames())
                .filter(bean -> !bean.contains("org.springframework") && !bean.contains("componentScanAnnotationFilterApp"))
                .sorted()
                .forEach(System.out::println);

        /*
         * ComponentScan의 더 자세한 옵션은 아래 페이지 참고
         * https://www.baeldung.com/spring-componentscan-filter-type
         */
    }

}