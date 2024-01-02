import java.util.*;
public class HighSchoolResult {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
System.out.println("Enter the number which you got in the exam result");
int studentMarks=sc.nextInt();
        displayResult(studentMarks);
    }

    static void displayResult(int marks) {
        int passMarks = 40;

        if (marks >= passMarks) {
            int grade = marks / 10;

            switch (grade) {
                case 10:
                case 9:
                    System.out.println("Result: Very Good");
                    break;
                case 8:
                case 7:
                    System.out.println("Result: Good");
                    break;
                default:
                    System.out.println("Result: Pass");
            }
        } else {
            System.out.println("Result: Fail");
        }
    }
}
