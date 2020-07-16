package cn.agasha;

import java.util.*;

public class TestHashCode {
    public static void main(String[] args) {
        Person p1 = new Person(12, "张三");
        Person p2 = new Person(12, "张三");
        Person p3 = new Person(12, "张三");
        int hashCode = System.identityHashCode(p1);
        //不重写hashCode方法时两个值相等 重写后就不相等
        System.out.println("p1:"+hashCode);
        System.out.println(p1.hashCode());
        System.out.println(p1.equals(p2));
        HashSet<Person> hashSet1 = new HashSet<>();
        hashSet1.add(p1);
        hashSet1.add(p2);
        //必须同时重写内部的equals和hashCode方法 才能确保hashset集合内不重
        hashSet1.iterator().forEachRemaining(System.out::println);
        System.out.println(hashSet1.size());
        HashSet<Person> hashSet2 = new HashSet<>();
        hashSet2.add(p1);
        hashSet2.add(p3);
        System.out.println(hashSet1.equals(hashSet2));
        System.out.println("-----------------");
        setName(p1);
        System.out.println(p1);

    }
    private static void setName(Person p) {
        Person person = p;
        person.name = "武松";
        System.out.println("person:"+person);
    }

}
class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}