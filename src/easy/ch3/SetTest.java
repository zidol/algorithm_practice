package easy.ch3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Member implements Comparable<Member> {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        return o.getName().compareTo(getName());
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SetTest {
    public static void main(String[] args) {
        Set set = new TreeSet();

        Member member = null;
        for (int i = 0; i < 5; i++) {
            member = new Member();
            member.setId(i);
            member.setName("Name" + i);
            set.add(member);
        }



        System.out.println(set.toString());

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
