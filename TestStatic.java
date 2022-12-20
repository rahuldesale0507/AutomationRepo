package JavaPractice;

public class TestStatic {
   static int a=20;
   static boolean b=true;
    static int c=30;
    public  int b1()
    {
        return a=a+c;

    }
    public int b2()
    {
        int z=20;
        return a=z+a;
    }
    public static void main(String[] args){
        TestStatic t = new TestStatic();
        int g= t.b1();
        System.out.println(a);
        System.out.println(t.a);
        int k= t.b2();
        System.out.println(k);


    }
}
