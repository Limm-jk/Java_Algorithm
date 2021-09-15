package Baekjoon.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E11720_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String input = br.readLine();
        int res = 0;

        for(String s : input.split("")) {
            res += Integer.parseInt(s);
        }

        System.out.println(res);
    }
}
