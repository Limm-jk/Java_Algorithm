package Baekjoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class E4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line = br.readLine()).equals("0 0 0")) {
            String[] num = line.split(" ");
            double[] arr = Arrays.stream(num).mapToDouble(i -> Math.pow(Double.parseDouble(i), 2.0)).sorted().toArray();
            if(arr[2] == arr[1] + arr[0]) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
