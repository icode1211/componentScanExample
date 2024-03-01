package com.example.demo.example2;

import com.example.demo.example2.annotation.MyAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
		basePackages = "com.example.demo.example2",		// 이부분을 따로 설정하지 않아도 default base package
		includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyAnnotation.class), // 커스텀 어노테이션인 MyAnnotation이 빈으로 등록됨
		excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Test")  //myComponentTest가 빈으로 등록되지 않음
)
@SpringBootApplication
public class DemoApplicationExample2 {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationExample2.class, args);
	}
}
