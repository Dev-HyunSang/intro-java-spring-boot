# intro-java-spring-boot
코프레스의 Spring Boot를 활용한 웹 개발 입문을 듣고 Spring Boot를 공부합니다.

## 수강한 강의
- 섹션4: Web의 기초 개념과 HTML의 활용
  - 8. Web과 HTTP의 개념 - 2023.11.20 수강 완료.
  - 9. IP와 Port의 개념 - 2023.11.20 수강 완료.
  - 10. HTML 의 이해 - 2023.11.20 수강 완료.
  - 11. HTML 의 기초 Tag (1) - 2023.11.20 수강 완료.
  - 12. HTML 의 기초 Tag (2) - 2023.11.20 수강 완료.
  - 13. HTML Table Tag 의 이해와 활용 - 2023.11.20 수강 완료.
  - 14. HTML List Tag 의 이해와 활용 - 2023.11.20 수강 완료.
  - 15. HTML Form Tag 의 이해와 활용 - 2023.11.21 수강 완료,
  - 16. CSS 기초 개념 - 2023.11.21 수강 완료.
  - 17. CSS 기초 개념 - id 와 class 의 이해와 활용 - 2023.11.21 수강 완료.
- 섹션5: Spring Boot 컨트롤러와 REST API
  - 18. 계층형 아키텍처의 이해 - 2023.11.21 수강 완료.
  - 19. 컨트롤러의 구현 문법 - 2023.11.21 수강 완료.
  - 20. 컨트롤러의 구현 실습 - 2023.11.21 수강 완료.

## 강의 메모

### 스프링과 스프링 부트는 무엇인가?
- [Rod Johnson](https://twitter.com/springrod)에 의해 개발 되었고, 2004년 1.0 버전이 출시됨.
- 2017년에 Spring Framework 5.0 출시.
- 2014년에 Spring Boot 1.0이 출시 되었고, 2020 기준 Spring Boot 2.x
- Spring Boot makes it **easy**i to create stand-alone, production-grade Spring based Applications that you **"just run"**. - Offical Intro

### Spring Boot의 활용 사례
- Spring Framework은 웹 개발만을 위한 Framework는 아니지만, 주로 웹 애플리케이션 개발을 위해 활용됨.
- 작은 게시판과 같은 웹 애플리케이션부터 Netflix 수준의 대규모 애플리케이션을 개발하는데 적용 가능.
- 국내외 많은 기업들이 Spring Framework을 핵심 기술로 활용 중.

### Spring Framework의 장점
- 경령화 된 Java Framework
- POJO의 사용으로 재사용 가능한 코드 개발 가능
- DI와 AOP의 적용
- Transaction 관리의 편리성
- MVC 아키텍처의 지원
- 테스트가 용이함
- 높은 보안성

### SW 아키텍처
- 건축을 할 때 설계도를 그려서 건물이 어떻게 지어질지 구상.
- SW도 실제 코드 개발 전에 최종 SW가 되어야 할 모습을 설계함.
- SW 아키텍처란, SW의 구조를 정의한 것으로 SW를 구상하는 주요 요소들과 요소들의 관계를 정의한 것.

### SW 아키텍처/디자인 패턴
- **패턴: 되풀이되는 사건이나 물체의 형태로, 예측 가능한 방식으로 되풀이 됨.**
- **우리가 만드는 SW도 이전의 수많은 사람들도 만들고 고민했던 유형일 가능성 높음.**
- **특정한 상황의 문제를 해결하기 위한 일반화 된 솔루션**
  - 카카오톡과 같은 메신저 서비스를 개발을 위한 패턴
  - 웹 서비스 개발을 위한 패턴
  - 데이터 분석 시스템 개발을 위한 패턴

### 계층형 아키텍처 패턴
- **웹 서비 개발에 주로 사용되는 패턴.**
- **SW를 서로 다른 역할을 하는 3~4 계층으로 구분**
  - Presentation Layer - `Client`로부터 요청을 받아 `Application Layer`에 처리를 위임. / `Application Layer`의 결과를 최종 `Client`로 전달. 
  - Application Layer - 특정 목적을 위한 다양한 비즈니스 로직을 처리.
  - Business Layer 
  - Data Access Layer - DB에 접근하여 데이터를 저장하거나 조회하는 역할.
- 계층 간에 호출을 하고 데이터를 주고 받으며 협력하며 전체 웹 서비를 구성.
- Client  ↔ Presentation Layer `@Contoller`  ↔  Application Layer `@Service`  ↔  Data Access Layer `@Repository` ↔ DataBase

#### Spring Controller
- 계층형 아키텍처의 Presentation Layer에 해당.
- Client(웹 브라우저, 모바일 앱)의 요청을 받고
- Application Layer에 요청에 대한 처리를 위임하여
- Client에 최종 응답을 하는 역할
  - `view`: Client가 요청에 대한 응답의 결로 보게 되는 페이지
  - `data`: Client가 요청에 대한 응답으로 받는 데이터

## 공부하면서 함께 보면 좋은 자료들
- **아키텍처:**
  - [SW 아키텍처 스타일](https://mydream72.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%B3%B4%EB%8B%88-SW-%EC%95%84%ED%82%A4%ED%85%8D%EC%B2%98-%EC%8A%A4%ED%83%80%EC%9D%BC)
  - [소프트웨어 공학의 모든 것 7 - 아키텍처 설계와 패턴](https://mini-noriter.tistory.com/27)
  - [계층화 아키텍쳐(Layered Architecture)의 구성요소](https://walbatrossw.github.io/etc/2018/02/26/etc-layered-architecture.html)
- **디자인 패턴:**
  - [[Design Pattern] 디자인 패턴 종류](https://gmlwjd9405.github.io/2018/07/06/design-pattern.html)
  - [소프트웨어 아키텍쳐, 디자인 패턴의 개념과 차이점](https://velog.io/@toma/%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4-%EC%95%84%ED%82%A4%ED%85%8D%EC%B3%90%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4%EC%9D%98-%EA%B0%9C%EB%85%90%EA%B3%BC-%EC%B0%A8%EC%9D%B4%EC%A0%90)
  - [[Design Pattern] 디자인 패턴 정의와 종류에 대하여](https://coding-factory.tistory.com/708)
