package easy.ch4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<String>(); // 값 추가
        que.add("Hello");
        que.add("World");
        que.add("Hello");
        que.add("Hello");
        que.add("World");

        System.out.println(que); // 결과 출력 -> [Hello, World, Hello, Hello, World]

        que.poll(); // 맨 앞의 값 삭제
        System.out.println(que); // 결과 출력 -> [World, Hello, Hello, World]

        que.remove(); // 맨 앞의 값 삭제
        System.out.println(que); // 결과 출력 -> [Hello, Hello, World]

        que.remove("Hello"); // 해당하는 값 삭제
        System.out.println(que); // 결과 출력 -> [Hello, World]

        que.clear(); // Index의 값 삭제
        System.out.println(que); // 결과 출력 -> []
    }
}
