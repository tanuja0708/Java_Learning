import java.util.Scanner;

import java.util.*;

public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age>18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not adult");
        // }


        // int x = sc.nextInt();

        // if(x%2==0){
        //     System.out.println("even");
        // }else {
        //     System.out.println("odd");
        // }


        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a==b){
        //     System.out.println("equal");
        // }else{
        //     if(a>b){
        //         System.out.println("a is greater than b");
        //     }else{
        //         System.out.println("b is greater than a");
        //     }
        // }

        int button = sc.nextInt();

        switch(button) {
        case 1: System.out.println("hello");
        break;
        case 2: System.out.println("namaste");
        break;
        case 3: System.out.println("bonjour");
        break;
        default : System.out.println("invalid button");
        }
        }
    }
    

