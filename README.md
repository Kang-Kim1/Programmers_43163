# Programmers_43163
## 프로그래머스 - 단어 변환(https://programmers.co.kr/learn/courses/30/lessons/43163)
프로그래머스 [깊이/너비 우선탐색] 카테고리에 있던 문제,,  
처음 문제를 접하고 살짝 복잡하게 풀어나가려다가,,,  
다행히 정신차리고 Helper 메소드 1개와 DFS를 활용하여 쉽게 풀 수 있었다.  

실행 순서는 다음과 같다 :   
1. 방문 기록 Array 생성
2. answer 변수에 Integer Max값 입력
3. DFS 메소드 실행
5. Input array 각 문자열로의 변환 가능 여부 & 방문 기록 확인 후, Count 값 증가하여 재귀 호출
6. target과 동일한 문자열 확인 시, answer 변수 업데이트(Math.min(answer,count))
7. answer 변수 반환. answer 값이 Integer Max값일 경우에는 0 반환


