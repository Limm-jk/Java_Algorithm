package Baekjoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1008_A나누기B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] inputSplit = input.split(" ");

        double answer = Double.parseDouble(inputSplit[0]) / Double.parseDouble(inputSplit[1]);

        System.out.println(answer);
    }
}
