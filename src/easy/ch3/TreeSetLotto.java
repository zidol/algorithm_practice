package easy.ch3;

import java.util.*;

public class TreeSetLotto {
    public static void main(String[] args) {
        //TreeSet은 저장할 때 이미 정렬하기 때문에 읽어올떄 따로 정렬할 필요가 없음
        Set set = new TreeSet();
        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random()  * 45) +1;
            set.add(num);
            System.out.println(set);
        }
        System.out.println("---------------------------");

        Set hashSet = new HashSet();
        for (int i = 0; hashSet.size() < 6; i++) {
            int num = (int)(Math.random()  * 45) +1;
            hashSet.add(new Integer(num));
        }
        List list = new LinkedList(hashSet);
        Collections.sort(list);
        System.out.println(list);
    }
}
