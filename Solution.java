class Solution {
    int answer = 0;
    public int solution(String begin, String target, String[] words) {
        int len = words.length;
        
        // 방문 기록 Array
        boolean[] visited = new boolean[len];
        
        // 최소값을 Count하기 위해 MAX값으로 초기화
        answer = Integer.MAX_VALUE;
        
        // DFS 실행
        dfs(begin, target, visited, words, 0);
        
        // answer값 업데이트되지 않았을 경우 0 반환 == 변환할 수 없는 Case
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    // DFS Method
    public void dfs(String begin, String target, boolean[] visited, String[] words, int count) {
        
        // target과 동일한 문자 확인 시,
        if(target.equals(begin)) {
            answer = Math.min(answer, count);
            return;
        }

        for(int i = 0; i < words.length; i++) {
            String curr = words[i];
            
            // 중복 문자열이 아님 && 변환 가능한 문자열 && 방문기록 없을 경우
            if(!begin.equals(curr) && isConvertible(begin, curr) && !visited[i]) {
                visited[i] = true;
                // 재귀 호출
                dfs(words[i], target, visited, words, count + 1);
                visited[i] = false;
            }
        }     
    }

    // 변환 가능 여부 확인 Method
    boolean isConvertible(String src, String toCheck) {
        int cnt = 0;
        for(int i = 0; i < src.length(); i++) {
            if(src.charAt(i) != toCheck.charAt(i)) 
                cnt++;
        }
        return cnt == 1;
    }
}
