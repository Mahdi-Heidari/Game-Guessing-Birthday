package guessbirthday;

import java.util.Scanner;

public class GuessBirthday {

    static int day = 0;
    static int answer = 0;
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        String set1
                = " 1 3 5 7\n"
                + " 9 11 13 15\n"
                + "17 19 21 23\n"
                + "25 27 29 31";

        String set2
                = " 2 3 6 7\n"
                + "10 11 14 15\n"
                + "18 19 22 23\n"
                + "26 27 30 31";

        String set3
                = " 4 5 6 7\n"
                + "12 13 14 15\n"
                + "20 21 22 23\n"
                + "28 29 30 31";

        String set4
                = " 8 9 10 11\n"
                + "12 13 14 15\n"
                + "24 25 26 27\n"
                + "28 29 30 31";

        String set5
                = "16 17 18 19\n"
                + "20 21 22 23\n"
                + "24 25 26 27\n"
                + "28 29 30 31\n";

        System.out.printf("Is your birthday in set1?\n%s\n", set1);
        System.out.print("\nEnter 0 for No and 1 for Yes: \t");
        answer = reader.nextInt();
        checkAnswer(answer);

        if (answer == 1) {
            day += 1;
        }

        System.out.printf("\nIs your birthday in set2?\n%s\n", set2);
        System.out.print("\nEnter 0 for No and 1 for Yes: \t");
        answer = reader.nextInt();
        checkAnswer(answer);

        if (answer == 1) {
            day += 2;
        }

        System.out.printf("\nIs your birthday in set3?\n%s\n", set3);
        System.out.print("\nEnter 0 for No and 1 for Yes: \t");
        answer = reader.nextInt();
        checkAnswer(answer);

        if (answer == 1) {
            day += 4;
        }

        System.out.printf("\nIs your birthday in set4?\n%s\n", set4);
        System.out.print("\nEnter 0 for No and 1 for Yes: \t");
        answer = reader.nextInt();
        checkAnswer(answer);

        if (answer == 1) {
            day += 8;
        }

        System.out.printf("\nIs your birthday in set5?\n%s\n", set5);
        System.out.print("\nEnter 0 for No and 1 for Yes: \t");
        answer = reader.nextInt();
        checkAnswer(answer);

        if (answer == 1) {
            day += 16;
        }

        System.out.printf("Your birthday is %d.\n\n", day);

    }

    public static void checkAnswer(int answer) {

        /*
         while (!(answer >= 0 && answer <= 1)) {
         System.out.println("Invalid input!\tTry again...");
         answer = reader.nextInt();
         }               
         */
        while (answer != 0 && answer != 1) {
            System.out.println("Invalid input!\tTry again...");
            answer = reader.nextInt();
        }

    }

}
