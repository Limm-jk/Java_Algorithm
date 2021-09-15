package Baekjoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E10950_A더하기B3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        int a,b;

        for (int i = 0; i < inputCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            System.out.println(a+b);
        }


    }
}
