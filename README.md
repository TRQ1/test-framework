### Framework 의 시작
* Properties
* Reflection
* Servelt
* Filter
위 기술들을 이용하여 최근 사용되고 있는 프레임워크들을 흉내내 볼 수 있는 기반 기술을 학습해보자.


### Sample Properties
* TestProperties.java
  - java main 파일로 작성하여 바로 실행 할 수 있도록 작성
  - java.util.Properties 를 활용하여 config.properteis 를 load한다.
  - Properties properties = new Properties();
* config.properties
  - user.id=dk
  - user.name=디케이
  - company.name=op
  - company.address=뚝섬
* properties 설정 파일은 표준 인코딩은 ISO-8859-1 이다. 표준 준수(한글에 대한 고민)
  - System.out.println("user.id: " + properties.getProperty("user.id"));
    > dk
  - System.out.println("user.name: " + properties.getProperty("user.name"));
    > 디케이
  - System.out.println("company.name: " + properties.getProperty("company.name"));
    > op
  - System.out.println("company.address: " + properties.getProperty("company.address"));
    > 뚝섬
    
### Sample Reflection    
* TestReflection.java
  - java main 파일로 작성하여 바로 실행 할 수 있도록 작성
* PrintLog.java
  - 아래 두 메소드 작성
   ```
    puglic void debug(String val) {
        System.out.println("=== [DEBUG] " + val);
    }
    puglic void error(String val) {
        System.out.println("=== [ERROR] " + val);
    }
    ```    

* 아래와 같이 출력될 수 있도록 TestReflection.java 구현
  - if..else 로 하지 않고 두번째 파라미터인 "debug", "error" String 변수를 활용하여 동적으로 호출 될 수 있도록 한다.
  - java TestReflection debug "하이~"
    > === [DEBUG] 하이~
  - java TestReflection error "헉~"
    > === [ERROR] 헉~      

### Sample Servlet
* web.xml
* TestServlet.java
  - HttpServelt 상속
  - RequestDispatcher 을 통해 jsp View
* test.jsp
1. 브라우저 "http://localhost:8080/testServlet.do" 를 호출
2. TestServlet 에서는 "test print out" 라는 Console 로그로 출력
3. "test Hello" 라는 화면을 브라우저에 출력    

### Sample Filter
* web.xml
* TestFilter.java

1. 모든 요청의 맨 앞에 "START CALL" 이라는 Console log 출력
2. 모든 요청의 맨 뒤에 "END CALL" 이라는 Console log 출력
3. 앞서 서블릿 요청을 했을 경우 Console log는 아래와 같다

- START CALL
- test print out
- END CALL