package _4__Conditional_Statements;

public class Switch_case {

    public static void main(String[] args) {

        String day="tuesday";

        switch (day)
        {
            case "monday":
                System.out.println("today is monday!");
                break;
            case "tuesday":
                System.out.println("today is tuesday!");
                break;
            case "wednesday":
                System.out.println("today is wednesday!");
                break;
            case "thursday":
                System.out.println("today is thursday!");
                break;
            case "friday":
                System.out.println("today is friday!");
                break;
            case "saturday":
                System.out.println("today is saturday!");
                break;
            default:
                System.out.println("today is Weekend!");
        }
    }
}
