## 🚀 기능 요구 사항

어느 연못에 엄마 말씀을 좀처럼 듣지 않는 청개구리가 살고 있었다. 청개구리는 엄마가 하는 말은 무엇이든 반대로 말하였다.

엄마 말씀 word가 매개변수로 주어질 때, 아래 청개구리 사전을 참고해 반대로 변환하여 return 하도록 solution 메서드를 완성하라.

| A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Z | Y | X | W | V | U | T | S | R | Q | P | O | N | M | L | K | J | I | H | G | F | E | D | C | B | A |

### 제한사항

- word는 길이가 1 이상 1,000 이하인 문자열이다.
- 알파벳 외의 문자는 변환하지 않는다.
- 알파벳 대문자는 알파벳 대문자로, 알파벳 소문자는 알파벳 소문자로 변환한다.

### 실행 결과 예시

| word | result |
| --- | --- |
| "I love you" | "R olev blf" |



# 🚀 Problem4

# ✅ 알고리즘 로직 순서

- 아래서부터 차례로 로직 구현

1. word 를 char 단위로 순회
- 만약 순회한 char 이 알파벳이 아니면, 반환할 문자열(정답 문자열)에 더하기
- 만약 순회한 char 이 알파벳이고 요구사항대로 변화해주면, 이 또한 반환할 문자열(정답 문자열)에 더하기
2. 반환할 문자열(정답 문자열)에 반환하기

# 📈 기능 목록

## 구현 기능 목록

### ✅ 문자 변환기능

- [X] 알파벳 대문자는 알파벳 대문자로, 알파벳 소문자는 알파벳 소문자로 사전과 반대로 변환한다




