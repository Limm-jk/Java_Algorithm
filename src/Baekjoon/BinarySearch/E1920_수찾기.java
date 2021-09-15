package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class E1920_수찾기 {
    static ArrayList<Integer> nArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nCount = Integer.parseInt(br.readLine());
        nArr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < nCount; i++) {
            nArr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nArr);

        int mCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int val = 0;

        for (int i = 0; i < mCount; i++) {
            val = Integer.parseInt(st.nextToken());

            if(binarySearch(val)) System.out.println(1);
            else System.out.println(0);
        }
    }

    static boolean binarySearch(int v) {
        int low, high, mid;

        low = 0;
        high = nArr.size() - 1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (v < nArr.get(mid))
                high = mid - 1;
            else if (v > nArr.get(mid))
                low = mid + 1;
            else
                return true;
        }

        return false;
    }
}
