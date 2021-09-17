package Baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class E2798_블랙잭 {
    static int max = 0;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

//        getCard(arr, 0, new int[]{-1, -1, -1});

        System.out.println(getCard(arr));
    }

//    static void getCard(int[] arr, int depth, int[] num) {
//        if (depth == 3) {
//            int sum = IntStream.of(num).map(i -> arr[i]).sum();
//            if (sum <= m) max = Math.max(max, sum);
//            return;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            int finalI = i;
//            if(IntStream.of(num).noneMatch(x -> x == finalI)) {
//                num[depth] = i;
//                getCard(arr, depth + 1, num);
//            }
//        }
//    }

    static int getCard(int[] arr) {
        int sum, max = 0;

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (m >=  sum) max = Math.max(max, sum);
                }
            }
        }

        return max;
    }
}
