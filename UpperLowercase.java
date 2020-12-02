package StringExample;

public class UpperLowercase {

    public static void main(String[] args) {

        String brand = "microsoft";
        brand = brand.toUpperCase();

        System.out.println(brand);

        brand = brand.toLowerCase();
        System.out.println(brand);

        brand += brand.toLowerCase(); // brand = brand+brand.toLower.case();
        System.out.println(brand);



    }
}
