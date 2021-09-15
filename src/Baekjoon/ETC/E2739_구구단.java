package Baekjoon.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E2739_구구단 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        print99(input);
    }

    static void print99(int n) {
        for (int i = 0; i < 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i + 1, n * (i + 1));
        }
    }
}
