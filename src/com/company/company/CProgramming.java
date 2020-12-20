package com.company.company;

import java.util.Scanner;

public class  {
    Scanner scan = new Scanner(System.in);

    public int easyLevel()
    {
        int count = 0;
        System.out.print("Que 1 -  What is the 16-bit compiler allowable range for integer constants?\n" +
                CProgramming    "\n" +
                "A - 3.4e38 to 3.4e38\n" +
                "B - 32767 to 32768\n" +
                "C - 32668 to 32667\n" +
                "D - 32768 to 32767\n");

        System.out.println("Enter your answer: ");
        char ans1 = scan.next().charAt(0);
        if (Character.toUpperCase(ans1) == 'D')
        {
            count+=2;
        }

        System.out.println("======================================================");
        System.out.print("Que 2 - What is required in each C program?\n" +
                "\n" +
                "A - The program must have at least one function.\n" +
                "B - The program does not require any function.\n" +
                "C - Input data\n" +
                "D - Output data\n");

        System.out.println("Enter your answer: ");
        char ans2 = scan.next().charAt(0);
        if (Character.toUpperCase(ans2) == 'B')
        {
            count+=2;
        }

        System.out.println("===========================================================");
        System.out.print("Que 3 - What is the maximum number of characters that can be held in the string variable char address line [40]?\n" +
                "\n" +
                "A - 38\n" +
                "B - 39\n" +
                "C - 40\n" +
                "D - 41\n");

        System.out.println("Enter your answer: ");
        char ans3 = scan.next().charAt(0);
        if (Character.toUpperCase(ans3) == 'B')
        {
            count+=2;
        }


        System.out.println("==========================================================");
        System.out.print("Que 4 -  What will the result of num1 variable after execution of the following statements?\n" +
                "\n" +
                "int j = 1, num1 = 4;  \n" +
                "while (++j <= 10)  \n" +
                "{  \n" +
                "  num1++;  \n" +
                "}  \n" +
                "A - 11\n" +
                "B - 12\n" +
                "C - 13\n" +
                "D - 14\n");

        System.out.println("Enter your answer: ");
        char ans4 = scan.next().charAt(0);
        if (Character.toUpperCase(ans4) == 'C')
        {
            count+=2;
        }

        System.out.println("==============================================================");
        System.out.print("Que 5 - How many times the program will print?\n" +
                "\n" +
                "#include<stdio.h>\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    printf(\"IndiaBIX\");\n" +
                "    main();\n" +
                "    return 0;\n" +
                "}\n" +
                "A.\tInfinite times\n" +
                "B.\t32767 times\n" +
                "C.\t65535 times\n" +
                "D.\tTill stack overflows\n");

        System.out.println("Enter your answer: ");
        char ans5 = scan.next().charAt(0);
        if (Character.toUpperCase(ans5) == 'D')
        {
            count+=2;
        }


        System.out.println("=======================================================");
        System.out.println("Que 6 - What will be the output of the program?\n" +
                "\n" +
                "#include<stdio.h>\n" +
                "int i;\n" +
                "int fun();\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    while(i)\n" +
                "    {\n" +
                "        fun();\n" +
                "        main();\n" +
                "    }\n" +
                "    printf(\"Hello\\n\");\n" +
                "    return 0;\n" +
                "}\n" +
                "int fun()\n" +
                "{\n" +
                "    printf(\"Hi\");\n" +
                "}\n" +
                "A.\tHello\n" +
                "B.\tHi Hello\n" +
                "C.\tNo output\n" +
                "D.\tInfinite loop\n");

        System.out.println("Enter your answer: ");
        char ans6 = scan.next().charAt(0);
        if (Character.toUpperCase(ans6) == 'A')
        {
            count+=2;
        }

        System.out.println("The score of easy level is (C Programming): "+count);
        return count;

    }

    public int AdvanceLevel()
    {
        int count = 0;
        System.out.println("Ques1. What is the output of the following ?\n" +
                "#include <stdio.h> \n" +
                "void main() \n" +
                "{ \n" +
                "    int a[5] = { 5, 1, 15, 20, 25 }; \n" +
                "    int i, j, m; \n" +
                "    i = ++a[1]; \n" +
                "    j = a[1]++; \n" +
                "    m = a[i++]; \n" +
                "    printf(\"%d, %d, %d\", i, j, m); \n" +
                "} \n" +
                "Options :\n" +
                "A. 3, 2, 15\n" +
                "B. 2, 3, 20\n" +
                "C. 2, 1, 15\n" +
                "D. 1, 2, \n ");

        System.out.println("Enter your answer: ");
        char ans1 = scan.next().charAt(0);
        if (Character.toUpperCase(ans1) == 'A')
        {
            count+=3;
        }

        System.out.println("**************************************************");

        System.out.println("Ques 2 - What is the output of the following ?\n" +
                "#include <stdio.h> \n" +
                "void main() \n" +
                "{ \n" +
                "    char* s = \"hello\"; \n" +
                "    char* p = s; \n" +
                "    printf(\"%p\\t%p\", p, s); \n" +
                "} \n" +
                "Options :\n" +
                "A. Different address is printed\n" +
                "B. Same address is printed\n" +
                "C. Run time error\n" +
                "D. Nothing\n");

        System.out.println("Enter your answer: ");
        char ans2 = scan.next().charAt(0);
        if (Character.toUpperCase(ans2) == 'B')
        {
            count+=3;
        }

        System.out.println("************************************************");

        System.out.println("Ques 3  - What is the output of the following ?\n" +
                "#include<stdio.h> \n" +
                "void main() \n" +
                "{ \n" +
                "    int movie = 1; \n" +
                "    switch (movie << (2 + movie)) \n" +
                "    { \n" +
                "    default: \n" +
                "        printf(\" Traffic\"); \n" +
                "    case 4: \n" +
                "        printf(\" Sultan\"); \n" +
                "    case 5: \n" +
                "        printf(\" Dangal\"); \n" +
                "    case 8: \n" +
                "        printf(\" Bahubali\"); \n" +
                "    } \n" +
                "} \n");

        System.out.println("Write your answer here: ");
        String ans3 = scan.nextLine();

        if (ans3.toLowerCase().equals("bahubali") ) {
            count += 3;
        }


        System.out.println("*******************************************************");
        System.out.println("Ques 4 - What is the output of the following ?\\n\"" +
                "#include<stdio.h> \n" +
                "#define L 10 \n" +
                "void main() \n" +
                "{ \n" +
                "    auto a = 10; \n" +
                "    switch (a, a*2) \n" +
                "    { \n" +
                "    case L: \n" +
                "        printf(\"ABC\"); \n" +
                "        break; \n" +
                "  \n" +
                "    case L*2: \n" +
                "        printf(\"XYZ\"); \n" +
                "        break; \n" +
                "  \n" +
                "    case L*3: \n" +
                "        printf(\"PQR\"); \n" +
                "        break; \n" +
                "  \n" +
                "    default: \n" +
                "        printf(\"MNO\"); \n" +
                "  \n" +
                "    case L*4: \n" +
                "        printf(\"www\"); \n" +
                "        break; \n" +
                "    } \n" +
                "}\n ");

        System.out.println("Write your answer here: ");
        String ans4 = scan.nextLine();
        if (ans4.toLowerCase().equals("xyz"))
        {
            count += 3;
        }

        System.out.println("************************************************");

        System.out.println("Ques 5 - What will be the output of the following code?\n" +
                "#include <stdio.h> \n" +
                "  \n" +
                "int main() \n" +
                "{ \n" +
                "    short i; \n" +
                "    for (i = 1; i> 0; i++) \n" +
                "        printf(\"%d\\n\", i); \n" +
                "} \n" +
                "options :\n" +
                "A.The control won’t fall into the for loop\n" +
                "B.Numbers will be displayed until the signed limit of short and throw a run time error\n" +
                "C.Numbers will be displayed until the signed limit of short and program will successfully terminate\n" +
                "D.This program will get into an infinite loop and keep printing numbers with no errors\n");

        System.out.println("Enter your answer: ");
        char ans5 = scan.next().charAt(0);
        if (Character.toUpperCase(ans5) == 'D')
        {
            count+=3;
        }

        System.out.println("The score of Advance level (C Programming): "+count);

        return count;




        }
}



