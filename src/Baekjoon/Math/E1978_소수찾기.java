package Baekjoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E1978_소수찾기 {
    static int[] prime = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nCount = Integer.parseInt(br.readLine());
        int v, answer = 0;
        getPrime();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < nCount; i++) {
            v = Integer.parseInt(st.nextToken());
            if (prime[v] == 0) answer ++;
        }

        System.out.println(answer);
    }

    static void getPrime() {
        prime[0] = -1; prime[1] = -1;
        int v;

        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == 0) {
                v = 1;
                while (i * ++v < prime.length) {
                    prime[i * v] = -1;
                }
            }
        }
    }
}
