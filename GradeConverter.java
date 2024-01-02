public class GradeConverter {

    public static void main(String[] args) {
        int numericalGrade = 95;

        if (isValidGrade(numericalGrade)) {
            String letterGradeSwitch = convertToLetterGradeSwitch(numericalGrade);
           // String letterGradeIfElse = convertToLetterGradeIfElse(numericalGrade);

            System.out.println("Using Switch: " + letterGradeSwitch);
           // System.out.println("Using If-Else: " + letterGradeIfElse);
        } else {
            System.out.println("Invalid numerical grade. Please enter a grade between 0 and 100.");
        }
    }

    static boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 100;
    }

    static String convertToLetterGradeSwitch(int numericalGrade) {
        int grade = numericalGrade / 10;

        switch (grade) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}


// using if else ladder statement in java to make the program 
/*
    static String convertToLetterGradeIfElse(int numericalGrade) {
        int grade = numericalGrade / 10;

        if (grade == 10 || grade == 9) {
            return "A";
        } else if (grade == 8) {
            return "B";
        } else if (grade == 7) {
            return "C";
        } else if (grade == 6) {
            return "D";
        } else {
            return "F";
        }
    }
}
*/