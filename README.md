## Component Scan 동작 확인해보기
### DemoApplicationExample1
* @Component (@Controller, @Service, @Repository) 어노테이션으로 등록한 빈 확인해보기 <br>
  * DemoApplicationExample1Test 테스트 코드에서 확인 가능

### DemoApplicationExample2
* 커스텀하게 만든 어노테이션(@MyAnnotation) 으로 빈 등록한 myCustom 확인해보기
* ComponentScan 의 excludes 옵션으로 필터링한 myComponentTest 빈이 등록되지 않은 것 확인해보기
  * DemoApplicationExample2Test 테스트 코드에서 확인 가능

### DemoApplicationExample3
* @Component 어노테이션으로 등록한 빈 확인해보기 <br>
  * 동일한 타입이지만 빈 이름을 따로 지정하여 각각의 빈으로 등록된 myComponent, myComponentHelloSpring 확인해보기
  * DemoApplicationExample3Test 테스트 코드에서 확인 가능
