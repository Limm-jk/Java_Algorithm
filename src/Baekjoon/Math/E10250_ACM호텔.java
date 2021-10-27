package Baekjoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E10250_ACM호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int h,w,m,floor,room;
        String line;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            floor = m % h;
            room = m / h;

            floor = floor == 0 ? h : floor;
            room = floor == h ? room : room + 1;

            System.out.println(floor + String.format("%02d", room));
        }
    }
}
