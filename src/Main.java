class Main {
  public static void main(String[] args) {
    // functions, methods = methods are declared in class
    // Variables
    // datatype- What kind of data is going to be stored.
    // int - stores integer values. - 1, 2, 5
    // float - floating point numbers - 4.396
    // double - floating point numbers - 42.36896565655656
    // String-Character sequence - "Ansal Pandey"
    // char - single character. - 'A'

    // datatype variable_name = value;

    // single-line comments

    /*
    Multi
    Line
    Comments
    */

    //        int age = 29;
    //        String name = "Govind Dwivedi";
    //        String firstName = "Govind";
    //        String lastName = "Dwivedi";
    //        String fullName = firstName + " " + lastName;
    //        float marks = 63.325f;
    //        char grade = 'B';
    //
    //
    //
    //        System.out.println("My name is:- " + fullName);
    //        System.out.println("My age is:- " + age);
    //        System.out.println("My marks is:- " + marks);
    //        System.out.println("My grade is:- " + grade);

    // Range of Data types
    // int - 4bytes = 1byte = 8bits = 1bit = 0, 1
    // int - 4bytes = 2 power 32 = 4294967296 = -2,147,483,648 0 2,147,483,647
    // long - 8bytes = 2 power 64 = 18446744073709551616
    // char - 1byte = -128 0 127
    // boolean - 1bits = true, false

    //        double radius = 2.56f; // float = 4bytes, double = 8bytes
    //        int area = (int) (3.14159f * radius * radius); // Manual typecasting.
    //
    //        float area1 = (float) (3.14159f * radius * radius);
    //
    //        System.out.println(area);
    //        System.out.println(area1);

    // Automatic type casting
    int a = 5;
    int b = 10;
    System.out.println(a + " " + b);
    int c = a;
    a = b;
    b = c;
    System.out.println(a + " " + b);
  }
}
