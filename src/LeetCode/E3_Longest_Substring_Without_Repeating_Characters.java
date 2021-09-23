package LeetCode;

public class E3_Longest_Substring_Without_Repeating_Characters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            String ss = "", word;
            int answer = 0;
            int count;

            if (s.length() == 1) answer = 1;

            for (int i = 0; i < s.length(); i ++) {
                count = 0;

                for (int j = i + 1; j <= s.length(); j ++) {
                    ss = s.substring(i,j - 1);
                    word = s.substring(j - 1, j);

                    if (ss.contains(word)) {
                        System.out.println(ss);
                        break;
                    }

                    count = ss.length() + 1;
                }
                answer = Math.max(answer, count);
            }

            return answer;
        }
    }
}
