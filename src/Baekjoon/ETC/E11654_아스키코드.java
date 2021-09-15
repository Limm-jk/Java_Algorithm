package Baekjoon.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E11654_아스키코드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inp = br.readLine();

        int a = inp.charAt(0);

        System.out.println(a);
    }
}
