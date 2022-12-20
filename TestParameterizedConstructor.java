package JavaPractice;

public class TestParameterizedConstructor {
    public int n, m;
      public String a,b;

    public TestParameterizedConstructor(int n , int m)
    {
        System.out.println(n +" " +m);
    }
    public TestParameterizedConstructor(String a, String b){
        System.out.println(a + " " +b);
    }
    public static void main(String[] args) {
        TestParameterizedConstructor t= new TestParameterizedConstructor( 30 , 40);
        TestParameterizedConstructor r= new TestParameterizedConstructor("rahul", "sumit");
    }
}
