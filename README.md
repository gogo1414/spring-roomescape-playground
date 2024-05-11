1단계 - 홈 화면
- 요구 사항 테스트 : 메인 화면 띄우기
- gradle 의존성 추가
  - `implementation 'org.springframework.boot:spring-boot-starter-web'`
    `implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'`

2단계 - 예약 조회
- Reservation 객체 생성
  - `id`, `name`, `date`, `time`로 구성되어 있다.
- ReservationController 구성
  - `/reservation`, `/reservations` 두 가지의 매핑 구현.