package JavaPractice;

public class TestModifier {
    boolean a= true , b= false;
    private boolean b1(){
        return a;
    }
    public boolean b2() {
        return b;
    }

    public static void main(String[] args) {
        TestModifier t = new TestModifier();
        System.out.println(" " +t.a);
        System.out.println((" " +t.b));
    }
}
