package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class E10816_숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer, Integer> hs = new HashMap<>();

        int v;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            v = Integer.parseInt(st.nextToken());
            hs.put(v, hs.getOrDefault(v, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 0; i < m; i++) {
            v = Integer.parseInt(st.nextToken());
            sj.add(Integer.toString(hs.getOrDefault(v, 0)));
        }

        System.out.println(sj.toString());
    }
}
