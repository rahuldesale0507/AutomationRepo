package JavaPractice;

public class TestLocal {
    char a='r';
    static int b=20;
    public static int b1(){
       int f=20;                //f is local variable;
       return  b=b+f;
    }
    public char b2(){
        return a;
    }

    public static void main(String[] args) {
        TestLocal t = new TestLocal();
      //  System.out.println(f); // here we got an error because  f is local variable;
        System.out.println(b);
        System.out.println(t.a);
    }
}

