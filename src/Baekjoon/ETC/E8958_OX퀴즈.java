package Baekjoon.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E8958_OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st;
        int inputCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputCount; i++) {
            int count = 0;
            int streak = 1;
            st = br.readLine().split("");

            for(String t : st) {
                if (t.equals("O")) {
                    count += streak;
                    streak ++;
                } else {
                    streak = 1;
                }
            }

            System.out.println(count);
        }
    }
}
