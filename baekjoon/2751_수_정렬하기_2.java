// 📌 문제: https://www.acmicpc.net/problem/2751
// ✅ 제목: 수 정렬하기 2 (실버5)
// ✅ 핵심: 최대 1,000,000개 숫자를 정렬해야 하므로, 빠른 입출력 + 효율적인 정렬 필요

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 속도 향상을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자의 개수 입력 받기
        int N = Integer.parseInt(br.readLine());

        // 정수를 저장할 리스트 생성
        List<Integer> list = new ArrayList<>();

        // N개의 정수를 입력받아 리스트에 추가
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        // 자바 기본 정렬 알고리즘 사용 (Timsort 기반, O(NlogN))
        Collections.sort(list);

        // 출력 성능 향상을 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : list) {
            bw.write(num + "\n");
        }

        // 버퍼 비우기
        bw.flush();
        bw.close();
    }
}
