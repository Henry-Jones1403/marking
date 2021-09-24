package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeat = "forever";
        System.out.println("What is the total possible marks for this paper?");
        final int maxMark = input.nextInt();

        while(repeat.equals("forever")){
            System.out.print("Marks -->   ");
            int mark = input.nextInt();
            if((mark> 0)&&(mark< maxMark)) {
                double percentage = ((double) mark / maxMark) * 100;
                if ((percentage) >= 80) {
                    System.out.println(percentage + "% ---> A");
                }
                else if (((percentage) >= 70) && ((percentage) < 80)) {
                    System.out.println(percentage + "% ---> B");
                }
                else if (((percentage) >= 60) && ((percentage) <= 69)) {
                    System.out.println(percentage + "% ---> C");
                }
                else if (((percentage) >= 50) && ((percentage) <= 59)) {
                    System.out.println(percentage + "% ---> D");
                }
                else if (((percentage) >= 40) && ((percentage) <= 49)) {
                    System.out.println(percentage + "% ---> E");
                } else {
                    System.out.println(percentage + "% ---> U");

                }
            }else{
                System.out.println("Sorry, That mark is invalid");
            }


        }
    }
}
