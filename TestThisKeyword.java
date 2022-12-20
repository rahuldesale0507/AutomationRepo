package JavaPractice;

public class TestThisKeyword {
    public boolean a;
    public TestThisKeyword(boolean a)
    {
    this.a=a;
    }

    public static void main(String[] args) {
        TestThisKeyword b1 = new TestThisKeyword(true);
        System.out.println(b1.a);
    }
}
