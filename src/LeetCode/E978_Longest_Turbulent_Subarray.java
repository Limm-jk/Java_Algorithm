package LeetCode;

public class E978_Longest_Turbulent_Subarray {
    class Solution {
        public int maxTurbulenceSize(int[] arr) {
            int answer = 1;
            boolean flip;
            int v;

            for (int i = 0; i < arr.length - 1; i ++) {
                flip = arr[i] > arr[i+1];
                v = turbulent(arr, i, flip);
                answer = Math.max(answer, v);
            }

            return answer;
        }

        private int turbulent(int[] arr, int start, boolean flip) {
            // flip이 true라면 왼쪽이 더 커야함.
            // 최초에 숫자 하나는 가지고 시작하니까 1로 시작.
            int answer = 1;
            int index = start;
            int last = arr[start];
            int current;

            while(++index < arr.length) {
                current = arr[index];

                if (flip) {
                    if(last > current) answer ++;
                    else break;
                }
                else {
                    if(last < current) answer ++;
                    else break;
                }

                last = current;
                flip = !flip;
            }
            // System.out.println(answer);

            return answer;
        }
    }
}
