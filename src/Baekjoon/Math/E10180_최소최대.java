package Baekjoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E10180_최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String input = br.readLine();
        int v = 0;
        int max = -1000000;
        int min = 1000000;

        StringTokenizer st = new StringTokenizer(input, " ");

        while(st.hasMoreTokens()) {
            v = Integer.parseInt(st.nextToken());
            if (v > max) max = v;
            if (v < min) min = v;
        }

        System.out.printf("%d %d", min, max);
    }
}
