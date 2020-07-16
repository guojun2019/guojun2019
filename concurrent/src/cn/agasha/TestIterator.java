package cn.agasha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(3);
        arrList.add(4);
        arrList.add(8);
//        integers.remove(1);//Arrays.asList生成的List不能remove
//        arrList.remove((Integer) 4);
//        System.out.println(arrList);
        //不能用for循环来删除元素
//        for (int i = 0; i < arrList.size(); i++) {
//            System.out.println(arrList.get(i));
//            arrList.remove(i);
//        }
        //不能用增强for遍历删除元素
//       for (Integer temp : arrList) {
//            System.out.println(temp);
//            arrList.remove(temp);
//        }
        Iterator<Integer> iterator = arrList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
            if (next == 3) {
//                arrList.remove(next);//ConcurrentModificationException 报错
                iterator.remove();//必须使用迭代器删除
            }
        }
//        System.out.println(integers);
        System.out.println(arrList);
    }
}
