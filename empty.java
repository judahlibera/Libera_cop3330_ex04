/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.*;
public class empty {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter a noun ");
        String noun = sc.nextLine();
        System.out.printf("Enter a verb ");
        String verb = sc.nextLine();
        System.out.printf("Enter an adjective ");
        String adj = sc.nextLine();
        System.out.printf("Enter an adverb ");
        String adv = sc.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's Hilarious!", verb, adj, noun, adv);
    }
}
