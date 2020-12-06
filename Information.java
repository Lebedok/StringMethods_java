package StringExample;

import java.util.Scanner;

public class Information {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please provide your personal information: "+
                    "\n(Gender - yourfullName - YearofBirth)");
            String info = input.nextLine();

            System.out.println(info.startsWith("F"));
            System.out.println(info.startsWith("M"));
            System.out.println(info.contains("David"));
            System.out.println(info.endsWith("1998"));


        }
    }




