package Baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1018_체스판다시칠하기 {
    static String[] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = br.readLine().split(" ");

        int n = Integer.parseInt(inp[0]);
        int m = Integer.parseInt(inp[1]);
        int answer = 65;
        int val;

        board = new String[n];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine();
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                val = search(i, j);
                if (val < answer) answer = val;
            }
        }

        System.out.println(answer);
    }

    static int search(int n, int m) {
        boolean tile = true;
        tile = checkTile(n, m);
        tile = !tile;
        int count = 0;

        for (int i = n; i < n + 8; i++) {
            for (int j = m; j < m + 8; j++) {
                if(tile != checkTile(i, j)) count ++;
                tile = !tile;
            }
            tile = !tile;
        }

        return 32 > count ? count : 64 - count;
    }

    static boolean checkTile(int n, int m) {
        char tile = board[n].charAt(m);

        return tile == 'W';
    }
}
