import java.util.Scanner;

class SeasonChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        if (isValidMonth(month)) {
            String season = determineSeason(month);
            System.out.println("The season is: " + season);
        } else {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
        }

        scanner.close();
    }

    static boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    static String determineSeason(int month) {
        switch (month) {
            case 1:
            case 2:
            case 3:
                return "Winter";
            case 4:
            case 5:
            case 6:
                return "Spring";
            case 7:
            case 8:
            case 9:
                return "Summer";
            case 10:
            case 11:
            case 12:
                return "Autumn";
            default:
                return "Invalid month";
        }
    }
}
