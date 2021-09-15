package Baekjoon.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E2675_문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        int count = 0;
        String str = "";

        for (int i = 0; i < inputCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            count = Integer.parseInt(st.nextToken());
            str = st.nextToken();

            printString(count, str);
        }


    }

    static void printString(int count, String str) {
        StringBuilder sb = new StringBuilder();

        for(String s : str.split("")) {
            sb.append(String.valueOf(s).repeat(count));
        }

        System.out.println(sb.toString());
    }
}
