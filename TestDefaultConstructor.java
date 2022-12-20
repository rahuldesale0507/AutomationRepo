package JavaPractice;

public class TestDefaultConstructor {
  static  int a;
    boolean b;
    //public  TestDefaultConstructor()
    public  int m1()
    {
        return a;
    }
    public boolean m2()     // for data type boolean, default constructor output is false.
    {
        return b;
    }
    public static void main(String[] args) {
        TestDefaultConstructor b1= new TestDefaultConstructor();
        System.out.println(b1.a);       // here we get output :- 0
        System.out.println(b1.b);       // here we get output :- false
    }
}
