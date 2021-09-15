package Baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int range, last;

        while(!(line = br.readLine()).equals("0")) {
            range = line.length() / 2;
            last = line.length() - 1;
            boolean pal = true;

            for (int i = 0; i < range; i++) {
                if (line.charAt(i) != line.charAt(last - i)) {
                    pal = false;
                    break;
                }
            }

            if (pal) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
