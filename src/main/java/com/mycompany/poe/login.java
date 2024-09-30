/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;
import java.util.Scanner;


/**
 *
 * @author nkgap
 */
public class login {
     public static void main(String[] args) {

         POE system = new POE();
        Scanner sc = new Scanner(System.in);

        boolean isAccountCreated = false;
        
        //Simulate user registration
        System.out.println("Hi, please create an account");

        while (!isAccountCreated) {
            System.out.print("Enter first name: ");
            String firstName = sc.nextLine();
            system.setFirstName(firstName);

            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();
            system.setLastName(lastName);

            System.out.print("Enter username: ");
            String username = sc.nextLine();
            system.setUsername(username);

            System.out.print("Enter password: ");
            String password = sc.nextLine();
            system.setPassword(password);

            String registrationStatus = system.registerUser();
            System.out.println(registrationStatus);
            
            //attempt registration and print result 
            if (registrationStatus.contains("successfully")) {
                system.Accountcreation(username, password, firstName, lastName);
                isAccountCreated = true;
            }
        }
        
        //login attempt 
        System.out.println("Login:");

        boolean loginStatus = false;

        while (!loginStatus) {
            System.out.print("Enter username: ");
            String loginUsername = sc.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = sc.nextLine();

            loginStatus = system.loginUser(loginUsername, loginPassword);

            String loginMessage = system.returnLoginStatus(loginStatus);
            System.out.println(loginMessage);
        }
     }
}


