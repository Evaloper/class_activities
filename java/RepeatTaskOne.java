import java.util.Random;
import java.util.Scanner;

public class RepeatTaskOne {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your full name: ");
        String fullName = reader.nextLine();

        System.out.println("Hello " + fullName + "! Welcome to Elementary Maths Assessment. This is to test your elementary skill.");

        String letsPlay;
        System.out.println("Are you ready? if yes, type yes; otherwise come back later.");

        letsPlay = reader.nextLine();

        while (letsPlay.equalsIgnoreCase("yes")){
            int num1 = random.nextInt(1, 100);
            int num2 = random.nextInt(1, 20);

            int result = 0;

            System.out.println("What is the sum of " + num1 + " and " + num2);
            int userSumInput = reader.nextInt();

            int correctSum = num1 + num2;

            if (userSumInput == correctSum){
                System.out.println("You are correct!");
                result++;
            } else {
                System.out.println(userSumInput + " is the wrong answer. The right answer is " + correctSum );
            }

            num1 = random.nextInt(1, 40);
            num2 = random.nextInt(1, 4);

            System.out.println("What is the product of " + num1 + " and " + num2);
            int userSubInput = reader.nextInt();

            int correctSub = num1 * num2;

            if (userSubInput == correctSub) {
                System.out.println("You are correct");
                result++;
            } else{
                System.out.println(userSubInput + " is a wrong answer. The correct answer is " + correctSub);
            }

            num1 = random.nextInt(1, 500);
            num2 = random.nextInt(1, 50);

            System.out.println("What is the quotient of " + num1 + " by " + num2);
            int userDivInput = reader.nextInt();

            int correctDiv = num1 / num2;

            if (userDivInput == correctDiv) {
                System.out.println("You are correct");
                result++;
            } else{
                System.out.println(userDivInput + " is a wrong answer. The correct answer is " + correctDiv);
            }

            num1 = random.nextInt(1, 500);
            num2 = random.nextInt(1, 50);

            System.out.println("What is the multiple of " + num1 + " by " + num2);
            int userMultipleInput = reader.nextInt();

            int correctMultiple = num1 * num2;

            if (userMultipleInput == correctMultiple) {
                System.out.println("You are correct");
                result++;
            } else{
                System.out.println(userMultipleInput + " is a wrong answer. The correct answer is " + correctMultiple);
            }

            if(result >= 3){
                System.out.println("Bravo!");
            } else{
                System.out.println("Nice Try");
            }

            System.out.println("Your total score is " + result + " out of 5 questions asked.");
            System.out.println("This is the end of your elementary assessment, type no to terminate. Otherwise continue trying");
            reader.nextLine();
            letsPlay = reader.nextLine();

        }
        System.out.println("Thank you for taking the assessment. ");
        System.out.println("It was nice having you here " + fullName + "!");
    }
}
