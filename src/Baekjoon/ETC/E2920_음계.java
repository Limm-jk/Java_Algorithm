package Baekjoon.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E2920_음계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        boolean asc = true;
        int v = 0;
        int newV = 0;

        switch (v = Integer.parseInt(st.nextToken())) {
            case 1:
                break;
            case 8:
                asc = false;
                break;
            default:
                System.out.println("mixed");
                return;
        }

        for (int i = 0; i < 7; i++) {
            newV = Integer.parseInt(st.nextToken());

            if (asc) {
                if(newV - 1 != v){
                    System.out.println("mixed");
                    return;
                }
            }
            else {
                if(newV + 1 != v){
                    System.out.println("mixed");
                    return;
                }
            }

            v = newV;
        }

        if(asc)
            System.out.println("ascending");
        else
            System.out.println("descending");
    }
}
