package cn.agasha;

public class TestOverride {
    //被final修饰的成员变量必须显示地赋值
//    private static final String name;
    public static void main(String[] args) {
        char c = 'a';
        System.out.println(c+56);
        Parent p = new Son();
        Son son = new Son();
        son.test01();
        String str = "java参数传递";
        p.test01(str);//调用的是父类方法 必须传参数
        System.out.println(str);
    }
}
class Parent {
    protected void test01(String str) {
        str = "hahahahah";
        System.out.println(str);
    }
}
class Son extends Parent {
    //重载
    protected int test01() {
        System.out.println("hah");
        return -1;
    }
    //重写 报错
    //返回值范围必须小于等于父类 抛出异常范围必须小于等于父类 访问修饰符必须小于等于父类
    //父类修饰符为private时 实际上就是写了一个新方法
//    protected int test01(String str) {
//        System.out.println("hah"+str);
//        return -1;
//    }

}
