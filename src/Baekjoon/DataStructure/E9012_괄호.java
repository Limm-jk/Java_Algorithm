package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int open;

        for (int i = 0; i < n; i++) {
            open = 0;
            String[] buckets = br.readLine().split("");
            for(String bucket : buckets) {
                if(bucket.equals("(")) open ++;
                else {
                    open --;
                    if (open < 0) break;
                }
            }

            if(open == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
