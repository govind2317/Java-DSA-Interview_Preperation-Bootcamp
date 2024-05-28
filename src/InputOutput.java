import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) {
    // Input Output, conditions, loops
    // Input:- Data gathering from user.

    Scanner input = new Scanner(System.in);
    //    System.out.print("Enter your age:- ");
    //    int age = input.nextInt();
    //    System.out.println("Your age is " + age + ".");

    // Program for detail printing
    //    String name;
    //    int age;
    //    float marks;
    //    name = input.nextLine();
    //    age = input.nextInt();
    //    marks = input.nextFloat();
    //    System.out.println(
    //        "Your name is " + name + " " + "and your age is " + age + " " + " your marks is" +
    // marks);

    // conditional statements:- if, else, else if
    // A program to check whether a person can vote or not.

    //    int age;
    //    age = input.nextInt();
    //
    //    if (age >= 18) {
    //      System.out.println("You can vote.");
    //    }
    //    else if(age <= 0){
    //      System.out.println("Invalid age.");
    //    }
    //    else {
    //      System.out.println("You cannot vote.");
    //    }

    // Loops
    // 1 - 10 print numbers.
    // create 10 variables.
    // assign values to them.
    // print them.

    //    int counter;
    //    for (counter = 1; counter <= 10; counter++) {
    //      System.out.println(counter);
    //    }

    //    int num = 125468;
    //    1 - 15 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
    //      for (int i = 1; i <= 10; i++) {
    //      System.out.println(num * i);
    //      }

    // While - loop - decided not when the loop will break.

    //    int num = 0;
    //    while (num < 5) {
    //      int i = num + 10;
    //      System.out.println(i);
    //      num++;
    //    }

    // do-while
    // The Java do-while loop is used to iterate a part of the program repeatedly,
    // until the specified condition is true. If the number of iteration is not fixed
    // and you must have to execute the loop at least once, it is recommended to
    // use a do-while loop.

    int num = 1;
    do {
      System.out.println(num);
      num++;
    } while (num < 10);
  }
}
