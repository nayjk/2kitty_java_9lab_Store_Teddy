package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Today in the ToyStore are:");
        Teddy teddy = new Teddy("Teddy", "4.8", "57 cent");
        teddy.print();
        Unicorn unicorn = new Unicorn("Unicorn", "4.9", "68 cent");
        unicorn.print();
        Kitty kitty = new Kitty("Kitty", "5.0", "89 cent");
        kitty.print();
        System.out.println(" ");
        System.out.println("Who visited our store:");
        User_one user_one = new User_one("Nataly_1", "nataly7890", "85435787");
        user_one.username();
        user_one.login();
        user_one.password();
        System.out.println(" ");
        User_two user_two = new User_two("Alice_2", "Alice5499", "73465695763");
        user_two.username();
        user_two.login();
        user_two.password();
        System.out.println(" ");
        User_three user_three = new User_three("John_3", "John63989", "02356899");
        user_three.username();
        user_three.login();
        user_three.password();
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter user ID: (1,2 or 3)");
        int count = in.nextInt();
        if (count == 1){
            System.out.println("User 1 bought Teddy");
        }
        if (count == 2){
            System.out.println("User 2 bought Unicorn");
        }
        if (count == 3){
            System.out.println("User 3 bought Kitty");
        }
        if (count < 1){
            System.out.println("incorrect ID");
        }
        if (count > 3){
            System.out.println("incorrect ID");
        }
    }
}
interface Product{
    void print();
}
class Teddy implements Product{
    String nameproduct;
    String rating;
    String cost;
    Teddy(String nameproduct, String rating, String cost){
        this.cost=cost;
        this.rating=rating;
        this.nameproduct=nameproduct;
    }
    public void print(){
        System.out.println("Toys number one:");
        System.out.print("Name: "+nameproduct+"     "+"Rating: "+rating+"     "+"Cost: "+cost);
        System.out.println(" ");
    }
}
class Unicorn implements Product{
    String nameproduct;
    String rating;
    String cost;
    Unicorn(String nameproduct, String rating, String cost){
        this.cost=cost;
        this.rating=rating;
        this.nameproduct=nameproduct;
    }
    public void print(){
        System.out.println(" ");
        System.out.println("Toys number two:");
        System.out.printf("Name: "+nameproduct+"     "+"Rating: "+rating+"     "+"Cost: "+cost);
        System.out.println(" ");
    }
}
class Kitty implements Product{
    String nameproduct;
    String rating;
    String cost;
    Kitty(String nameproduct, String rating, String cost){
        this.cost=cost;
        this.rating=rating;
        this.nameproduct=nameproduct;
    }
    public void print(){
        System.out.println(" ");
        System.out.println("Toys number three:");
        System.out.printf("Name: "+nameproduct+"     "+"Rating: "+rating+"     "+"Cost: "+cost);
        System.out.println(" ");
    }
}
interface User{
    void username();
    void login();
    void password();
}
class User_one implements User{
    String username;
    String login;
    String password;
    User_one(String username, String login, String password){
        this.login=login;
        this.username=username;
        this.password=password;
    }
    public void username(){
        //System.out.printf("Username: " + username +"     "+ "Login: " + login +"     "+ "Password: " + password);
        System.out.printf("Username: " + username + "     ");
    }
    public void login(){
        System.out.printf("Login: " + login + "     ");
    }
    public void password(){
        System.out.printf("Password: " + password + "     ");
    }
}
class User_two implements User{
    String username;
    String login;
    String password;
    User_two(String username, String login, String password){
        this.login=login;
        this.username=username;
        this.password=password;
    }
    public void username(){
        //System.out.printf("Username: " + username +"     "+ "Login: " + login +"     "+ "Password: " + password);
        System.out.printf("Username: " + username + "     ");
    }
    public void login(){
        System.out.printf("Login: " + login + "     ");
    }
    public void password(){
        System.out.printf("Password: " + password + "     ");
    }
}
class User_three implements User{
    String username;
    String login;
    String password;
    User_three(String username, String login, String password){
        this.login=login;
        this.username=username;
        this.password=password;
    }
    public void username(){
        //System.out.printf("Username: " + username +"     "+ "Login: " + login +"     "+ "Password: " + password);
        System.out.printf("Username: " + username + "     ");
    }
    public void login(){
        System.out.printf("Login: " + login + "     ");
    }
    public void password(){
        System.out.printf("Password: " + password + "     ");
    }
}