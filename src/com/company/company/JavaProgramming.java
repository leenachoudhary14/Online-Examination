package com.company.company;

import java.util.Scanner;

public class JavaProgramming {
    Scanner scan = new Scanner(System.in);

    public int easyLevel()
    {
       int count = 0;
        System.out.println("Ques 1 - Which of the following is not a Java features?\n" +
                "\n" +
                "A.Dynamic\n" +
                "B.Architecture Neutral\n" +
                "C.Use of pointers\n" +
                "D.Object-oriented\n");

        System.out.println("Enter your answer: ");
        char ans1 = scan.next().charAt(0);
        if (Character.toUpperCase(ans1) == 'C')
        {
            count+=2;
        }

        System.out.println("**************************************************************");

        System.out.println("Ques 2 - The \\u0021 article referred to as a\n" +
                "\n" +
                "A.Unicode escape sequence\n" +
                "B.Octal escape\n" +
                "C.Hexadecimal\n" +
                "D.Line feed\n");

        System.out.println("Enter your answer: ");
        char ans2 = scan.next().charAt(0);
        if (Character.toUpperCase(ans2) == 'A')
        {
            count+=2;
        }

        System.out.println("*********************************************************************");

        System.out.println("Ques 3 -  Evaluate the following Java expression, if x=3, y=5, and z=10:\n" +
                "\n" +
                "++z + y - y + z + x++\n" +
                "\n" +
                "A.24\n" +
                "B.23\n" +
                "C.20\n" +
                "D.25\n");

        System.out.println("Enter your answer: ");
        char ans3 = scan.next().charAt(0);
        if (Character.toUpperCase(ans3) == 'A')
        {
            count+=2;
        }

        System.out.println("*********************************************************************");

        System.out.println("Ques 4 -What will be the output of the following program?\n" +
                "\n" +
                "public class Test {  \n" +
                "public static void main(String[] args) {  \n" +
                "    int count = 1;  \n" +
                "    while (count <= 15) {  \n" +
                "    System.out.println(count % 2 == 1 ? \"***\" : \"+++++\");  \n" +
                "    ++count;  \n" +
                "        }      // end while  \n" +
                "    }       // end main   \n" +
                " }  \n" +
                "A.15 times ***\n" +
                "B.15 times +++++\n" +
                "C.8 times *** and 7 times +++++\n" +
                "D.Both will print only once\n");

        System.out.println("Enter your answer: ");
        char ans4 = scan.next().charAt(0);
        if (Character.toUpperCase(ans4) == 'C')
        {
            count+=2;
        }

        System.out.println("****************************************************************");

        System.out.println("Ques 5 -  An interface with no fields or methods is known as a ______.\n" +
                "\n" +
                "A.Runnable Interface\n" +
                "B.Marker Interface\n" +
                "C.Abstract Interface\n" +
                "D.CharSequence Interface\n");

        System.out.println("Enter your answer: ");
        char ans5 = scan.next().charAt(0);
        if (Character.toUpperCase(ans5) == 'B')
        {
            count+=2;
        }

        System.out.println("The score of Easy level (Java Programming): "+count);

        return count;

    }

    public int AdvanceLevel()
    {

        int count = 0;
        System.out.println("Ques 1 - Predict the output of following Java Programs.\n" +
                "class First \n" +
                "{ \n" +
                "    public First() {  System.out.println(\"a\"); } \n" +
                "} \n" +
                "   \n" +
                "class Second extends First \n" +
                "{ \n" +
                "    public Second()  {  System.out.println(\"b\"); } \n" +
                "} \n" +
                "   \n" +
                "class Third extends Second \n" +
                "{ \n" +
                "    public Third()   {  System.out.println(\"c\"); } \n" +
                "} \n" +
                "   \n" +
                "public class MainClass \n" +
                "{ \n" +
                "    public static void main(String[] args) \n" +
                "    { \n" +
                "        Third c = new Third(); \n" +
                "    } \n" +
                "} \n");

        System.out.println("Write your answer: ");
        String ans1 = scan.nextLine();

        if (ans1.toLowerCase().equals("complilation error")){
             count += 3;
        }

        System.out.println("*******************************************************");

        System.out.println("Ques 2 - Predict the output of following Java Programs.\n" +
                "class First \n" +
                "{ \n" +
                "    public First() {  System.out.printf(\"a\"); } \n" +
                "} \n" +
                "   \n" +
                "class Second extends First \n" +
                "{ \n" +
                "    public Second()  {  System.out.printf(\"b\"); } \n" +
                "} \n" +
                "   \n" +
                "class Third extends Second \n" +
                "{ \n" +
                "    public Third()   {  System.out.printf(\"c\"); } \n" +
                "} \n" +
                "   \n" +
                "public class MainClass \n" +
                "{ \n" +
                "    public static void main(String[] args) \n" +
                "    { \n" +
                "        Third c = new Third(); \n" +
                "    } \n" +
                "} \n");

        System.out.println("Write the output of following code: ");
        String ans2 = scan.nextLine();
        if (ans2.toLowerCase().equals("abc")){
            count += 3;
        }

        System.out.println("********************************************************");
        System.out.println("Ques 3 -  What is the output of the following program?\n" +
                "class First \n" +
                "{ \n" +
                "    int i = 10; \n" +
                "   \n" +
                "    public First(int j) \n" +
                "    { \n" +
                "        System.out.print(i);  \n" +
                "        this.i = j * 10; \n" +
                "    } \n" +
                "} \n" +
                "   \n" +
                "class Second extends First \n" +
                "{ \n" +
                "    public Second(int j) \n" +
                "    { \n" +
                "        super(j);  \n" +
                "        System.out.print(i);  \n" +
                "        this.i = j * 20; \n" +
                "    } \n" +
                "} \n" +
                "   \n" +
                "public class MainClass \n" +
                "{ \n" +
                "    public static void main(String[] args) \n" +
                "    { \n" +
                "        Second n = new Second(20);  \n" +
                "        System.out.print(n.i); \n" +
                "    } \n" +
                "} \n");

        System.out.println("Write the output of following code: ");
        String ans3 = scan.nextLine();
        if (ans3.toLowerCase().equals("10200400")){
            count += 3;
        }

        System.out.println("********************************************************");

        System.out.println("Ques 4 -  What is the output of the following program?\n" +
                " class Derived  \n" +
                "{ \n" +
                "    protected final void getDetails() \n" +
                "    { \n" +
                "        System.out.println(\"Derived class\"); \n" +
                "    } \n" +
                "} \n" +
                "  \n" +
                "public class Test extends Derived \n" +
                "{ \n" +
                "    protected final void getDetails() \n" +
                "    { \n" +
                "        System.out.println(\"Test class\"); \n" +
                "    } \n" +
                "    public static void main(String[] args) \n" +
                "    { \n" +
                "        Derived obj = new Derived(); \n" +
                "        obj.getDetails(); \n" +
                "    } \n" +
                "} \n"+
                "A. Derived class\n" +
                "B. Test class\n" +
                "C. Runtime error\n" +
                "D. Compilation error\n");

        System.out.println("Enter your answer: ");
        char ans4 = scan.next().charAt(0);
        if (Character.toUpperCase(ans4) == 'D')
        {
            count+=3;
        }

        System.out.println("******************************************************");

        System.out.println("Ques 5 -  What is the output of the following program?\n" +
                "Class Helper \n" +
                "{ \n" +
                "    private int data; \n" +
                "    private Helper() \n" +
                "    { \n" +
                "        data = 5; \n" +
                "    } \n" +
                "} \n" +
                "public class Test \n" +
                "{ \n" +
                "    public static void main(String[] args) \n" +
                "    { \n" +
                "        Helper help = new Helper(); \n" +
                "        System.out.println(help.data); \n" +
                "    } \n" +
                "} \n" +
                "A. Compilation error\n" +
                "B. 5\n" +
                "C. Runtime error\n" +
                "D. None of these\n");

        System.out.println("Enter your answer: ");
        char ans5 = scan.next().charAt(0);
        if (Character.toUpperCase(ans5) == 'A')
        {
            count+=3;
        }

        System.out.println("The score of Advance level (Java Programming): "+count);
           return count;
    }

}
