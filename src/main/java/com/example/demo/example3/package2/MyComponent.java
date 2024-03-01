package com.example.demo.example3.package2;

import org.springframework.stereotype.Component;

/*
 * 만약 빈 이름을 지정하지 않는다면, myComponent라는 동일한 빈이 있기 때문에 에러 발생!
 * (아래 에러 메시지 참고)
 *  Caused by: org.springframework.context.annotation.ConflictingBeanDefinitionException: Annotation-specified bean name 'myComponent' for bean class [com.example.demo.example3.package2.MyComponent] conflicts with existing, non-compatible bean definition of same name and class [com.example.demo.example3.package1.MyComponent]
 */
@Component("myComponentHelloSpring") // 빈 이름을 지정
public class MyComponent {
}
