package JavaPractice;

public class TestMulInhe2 extends TestMulInhe {

    int total;

    public void info()
    {
        System.out.println("Semester Result");
        roll_no=78;math=56;english=89; science=89;
        total= math+english+science;
        System.out.println("Total Marks = " +total);
        per=total/3;
        System.out.println("Percentage = "+per);
        if(per>35)
        {
            System.out.println("Result = Pass");
        }
        else
        {
            System.out.println("Result = Fail");
        }

    }
}
