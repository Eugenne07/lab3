package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introdu un cuvant:");
        String str = myObj.nextLine();
        StringBuilder string = new StringBuilder(str);
        if(str.contentEquals(string.reverse())) System.out.println("Este palindrom!");
        else System.out.println("Nu este palindrom!");
    }
}
