package com.company.company;
import com.idPassword.IdPassword;
import java.io.*;
import java.util.Scanner;

public class OnlineExamination {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Id");
        String Id = scanner.nextLine();
        System.out.println("Enter Password");
        String Password = scanner.nextLine();
        System.out.println("********************************************");


        System.out.println("Enter user_Id");
        String Id_user = scanner.nextLine();
        System.out.println("Enter user_password");
        String password_user = scanner.nextLine();
        System.out.println("********************************************");
        IdPassword idPassword = new IdPassword(Id, Password);

        String check = idPassword.check_idPwd(Id_user, password_user);
        CProgramming C = new CProgramming();
        JavaProgramming Java = new JavaProgramming();
        if (check.equals("Authentication successful")) {
            System.out.println("Authentication successful");
            System.out.println("Exam starts");
            //C.easyLevel();
            int cEasy = C.easyLevel();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            int cAdvance = C.AdvanceLevel();
            showres();

            System.out.println("\n*******************************************************");
            System.out.println("Questions of java Programming");

            int javaEasy = Java.easyLevel();
            System.out.println("***********************************************************");
            int javaAdvance = Java.AdvanceLevel();
            showres();

            String fid = Id;
            String Fpass = Password;
            try {

                FileOutputStream fout = new FileOutputStream(fid + ".txt");
                fid = "ID : " + fid + "\n";
                fout.write(fid.getBytes());
                String CeasyResult = "C Programming easy level total : " + String.valueOf(cEasy);
                fout.write(CeasyResult.getBytes());
                fout.write("\n".getBytes());
                System.out.println("\n");
                String CadvanceResult = "C Programming advance level total : " + String.valueOf(cAdvance);
                fout.write(CadvanceResult.getBytes());

                System.out.println("\n");
                String JavaEasyResult = "JAVA Programming easy level total : " + String.valueOf(javaEasy);
                fout.write(JavaEasyResult.getBytes());
                fout.write("\n".getBytes());
                System.out.println("\n");
                String JavaAdvanceResult = "\n JAVA Programming advance level total : " + String.valueOf(javaAdvance);
                fout.write(JavaAdvanceResult.getBytes());

                fout.close();

            } catch (Exception e) {
                System.out.println(e);
            }


        }

    }
    static void showres ()
    {
        try {
            System.out.println("Enter id to show result\n");
            String fid = scanner.nextLine();
            FileInputStream fin = new FileInputStream(fid + ".txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}


