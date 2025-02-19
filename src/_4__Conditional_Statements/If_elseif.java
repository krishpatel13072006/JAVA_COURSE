package _4__Conditional_Statements;

public class If_elseif {

    public static void main(String[] args) {

        int marks=90;
        String grade="";

        if(marks>90 && marks==100)
        {
            grade="A+";
        } else if (marks>80 && marks<=90)
        {
            grade="B+";
        } else if (marks>70 && marks<=80)
        {
           grade="B";
        } else if (marks>60 && marks<=70)
        {
        grade="C";
        } else if (marks>33 && marks<=50) {
            grade="D";
        } else if (marks<=33)
        {
            grade="FAIL";
        }
        System.out.println(grade);
    }
}
