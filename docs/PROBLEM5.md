## 🚀 기능 요구 사항

계좌에 들어있는 돈 일부를 은행에서 출금하고자 한다. 돈 담을 지갑이 최대한 가볍도록 큰 금액의 화폐 위주로 받는다.

돈의 액수 money가 매개변수로 주어질 때, 오만 원권, 만 원권, 오천 원권, 천 원권, 오백원 동전, 백원 동전, 오십원 동전, 십원 동전, 일원 동전 각 몇 개로 변환되는지 금액이 큰 순서대로 리스트/배열에 담아 return 하도록 solution 메서드를 완성하라.

### 제한사항

- money는 1 이상 1,000,000 이하인 자연수이다.

### 실행 결과 예시

| money | result |
| --- | --- |
| 50237	| [1, 0, 0, 0, 0, 2, 0, 3, 7] |
| 15000	| [0, 1, 1, 0, 0, 0, 0, 0, 0] |


# 🚀 Problem5

# ✅ 알고리즘 로직 순서

- 아래서부터 차례로 로직 구현

1. 오만, 만원, 오천 ... 이거 크기 배열을 만들어 준다
2. 정답 배열을 리스트가 아닌 int 배열로 만든다 (1번 배열의 같은 인덱스 활용을 위해)
3. 순회는 money 가 0이 될 때까지 순회


# 📈 기능 목록

## 구현 기능 목록

### ✅ 코인 유닛 배열과 money 비교하는 기능

- [X] 코인 유닛 배열 순회함면서 money와 비교
    - money 가 순회된 코인 유닛 배열보다 크거나 작으면 같으면 포문 break


### ✅ 코인 유닛 배열 생성

- [X] 오만 원권, 만 원권, 오천 원권, 천 원권, 오백원 동전, 백원 동전, 오십원 동전, 십원 동전, 일원 동전순 int[] 생성







