package cn.agasha;

/**
 * 接口可以多继承、抽象类只能单继承
 * 抽象类可以继承具体类也可以继承抽象类
 * 抽象类和接口都不能实例化
 * 接口成员变量只能是公共的静态常量 抽象类的成员变量既可以是静态变量也可以是普通变量
 * 抽象类可以没有抽象方法
 * 抽象方法必须是public 不能是private也不能是static
 */
public interface TestInterface extends Interface1, Interface2{
    int age = 0;
    static void test01() {};
//    private void test02() {};
    void test03();
}
interface Interface1 {
    void test99();
}
interface Interface2 {
    void test98();
}
abstract class TestAbstract extends TestClass implements TestInterface {
    static int age ;
    abstract void test01();
    public synchronized void test02() {};
}
class TestClass {
}

class test01 {
    public static void main(String[] args) {
//        TestInterface testInterface = new TestAbstract();
    }
}

