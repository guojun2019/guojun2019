package cn.agasha;


public class TestInnerClass {
    public static void main(String[] args) {

    }

    /**
     * 内部类不能继承 但内部接口可以多实现
     */
    class TestInnerclass1 extends Cat implements Interface88, Interface88.Interface77 {

    }
    class TestInnerclass2 extends Cat {}

}
interface Interface88 {
    interface Interface77 {

    }
}
class Cat {
    class Dog {}
}
