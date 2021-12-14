# 지하철 노선도 미션

## 초기 설정

- [ ] 지하철역으로 교대역, 강남역, 역삼역, 남부터미널역, 양재역, 양재시민의숲역, 매봉역이 등록되어 있다.
- [ ] 지하철 노선으로 2호선, 3호선, 신분당선이 등록되어 있다.
- 노선에 역은 아래와 같이 등록되어 있다.(왼쪽 끝이 상행 종점, 오른쪽 끝이 하행 종점)
  - [ ] 2호선: 교대역 - 강남역 - 역삼역
  - [ ] 3호선: 교대역 - 남부터미널역 - 양재역 - 매봉역
  - [ ] 신분당선: 강남역 - 양재역 - 양재시민의숲역

## 구현할 기능 목록

- [x] 메인 화면에서 어떠한 기능을 실행하고 싶은지 선택할 수 있다.
  - [ ] 메인 화면에서 1,2,3,4,Q 이외의 값을 입력하면 예외로 간주한다.
- [x] 메인 화면에서 Q를 입력하면 프로그램을 종료할 수 있다.

### 지하철 역 관리 기능
- [x] 메인 화면에서 1을 입력하면 역 관리 화면으로 이동한다.
- [x] 역 관리 화면에서는 역 이름을 받아 새로운 역 정보로 등록할 수 있다.
  - [ ] 이미 등록된 역 이름과 동일한 역 이름을 등록하려는 경우 예외로 간주한다.
  - [ ] 등록하려는 역 이름이 2글자 이상이 아닌 경우 경우 예외로 간주한다.
- [x] 역 관리 화면에서는 역 이름을 받아 기존 역 정보를 삭제할 수 있다.
  - [ ] 노선에 등록된 역을 삭제하려는 경우 예외로 간주한다.
  - [ ] 등록되지 않은 역을 삭제하려는 경우 예외로 간주한다. 
- [ ] 역 관리 화면에서는 모든 역 정보들의 목록을 조회할 수 있다.
- [x] 특정 기능이 실행 완료된 경우 메인 화면으로 돌아간다.
- [x] 역 관리 화면에서 B를 입력하면 메인 화면으로 돌아간다.

### 지하철 노선 관리 기능
- [ ] 메인 화면에서 2번을 선택하면 노선 관리를 할 수 있다.
- [ ] 노선 관리 화면에서는 노선 이름, 상행 종점역, 하행 종점역을 입력 받아 새로운 노선 정보로 등록할 수 있다.
  - [ ] 이미 등록된 노선 이름과 동일한 노선 이름을 등록하려는 경우 예외로 간주한다.
  - [ ] 등록하려는 노선 이름이 2글자 이상이 아닌 경우 경우 예외로 간주한다.
  - [ ] 상행 종점역, 하행 종점역 정보가 존재하지 않는 경우 예외로 간주한다.
- [ ] 노선 관리 화면에서는 기존 노선 정보를 삭제할 수 있다.
  - [ ] 등록되지 않은 노선을 삭제하려는 경우 예외로 간주한다.
- [ ] 노선 관리 화면에서는 모든 노선 정보들의 목록을 조회할 수 있다.
- [ ] 특정 기능이 실행 완료된 경우 메인 화면으로 돌아간다.

### 지하철 구간 관리 기능
- [ ] 메인 화면에서 3번을 선택하면 구간 관리를 할 수 있다.
- [ ] 구간 관리 화면에서는 노선, 역, 순서 정보를 받아 노선에 지하철 역을 추가할 수 있다.
  - [ ] 노선 정보, 역 정보가 존재하지 않는 경우 예외로 간주한다.
  - 노선 내의 각 역의 순서는 1부터 시작한다.  
  - 하나의 역은 여러개의 노선에 추가될 수 있다.
  - 역과 역 사이에 새로운 역이 추가 될 수 있다.
  - 노선에서 갈래길은 생길 수 없다.
- [ ] 구간 관리 화면에서는 노선과 역 정보를 받아 노선에서 지하철 역을 삭제할 수 있다.
  - 종점을 제거할 경우 다음 역이 종점이 된다.
  - [ ] 노선 정보, 역 정보가 존재하지 않는 경우 예외로 간주한다.
  - [ ] 노선에 등록되지 않은 역을 구간에서 제외시키려는 경우 예외로 간주한다.
  - [ ] 노선에 포함된 역이 두개 이하일 때 역을 제거하려고 하면 예외로 간주한다.
- [ ] 특정 기능이 실행 완료된 경우 메인 화면으로 돌아간다.

### 지하철 노선에 등록된 역 조회 기능

- [ ] 모든 노선에 대해 노선의 상행 종점부터 하행 종점까지 연결된 순서대로 역 목록을 조회할 수 있다.
- [ ] 해당 기능이 실행 완료된 경우 메인 화면으로 돌아간다.

## 입출력 형식 및 예외 처리

- 기대하는 출력 결과는 `[INFO]`를 붙여서 출력한다. (출력값의 형식은 예시와 동일하게 한다.)
- 에러 발생 시 `[ERROR]`를 붙여서 출력하고, 같은 화면에서 원하는 기능을 입력받는다.

## 📝 License

This project is [MIT](https://github.com/woowacourse/java-subway-map-precourse/blob/master/LICENSE.md) licensed.
