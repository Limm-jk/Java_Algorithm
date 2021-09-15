package Baekjoon.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class E1181_단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hs = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            hs.add(br.readLine());
        }

        ArrayList<String> ar = new ArrayList<>(hs);

        ar.sort((o1, o2) -> {
            if (o1.length() != o2.length()) return o1.length() - o2.length();
            else return o1.compareTo(o2);
        });

        for(String str : ar) {
            System.out.println(str);
        }
    }
}
