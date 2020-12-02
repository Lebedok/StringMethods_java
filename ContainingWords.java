package HomeWorkTwo;

        import java.util.Scanner;

public class ContainingWords {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first value: ");
        String firstValue = input.nextLine();

        System.out.println("Please enter second value: ");
        String secondValue = input.nextLine();
        System.out.println(firstValue.contains(secondValue) || secondValue.contains(firstValue));
    }
}
