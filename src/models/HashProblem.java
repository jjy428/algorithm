import java.util.HashSet;
import java.util.*;

class Solution {
    public int[] solution(int[] card) {
        Set<Integer>set = new HashSet<Integer>();
        for (int c : card){
            if (!set.contains(c)){
                set.add(c);
            }
            else{
                set.remove(c);
            }
        }
        int answer[] = new int[2];
        int i = 0;
        for (int c : set){
            answer[i] = c;
            i++;
        }
        Arrays.sort(answer);
        return answer;            
    }   
}