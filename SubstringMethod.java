package StringExample;

public class SubstringMethod {

    public static void main(String[] args) {

        String email = "turan@gmail.com";
        int indexNumber = email.indexOf("@");
        System.out.println(indexNumber);     // 5
        System.out.println(email.substring(indexNumber));  // gmail.com

        indexNumber = email.indexOf(".")+1;
        // System.out.println(email.substring(indexNumber));
        System.out.println(email.substring(email.length()-3));  // com

        String name = "Jennifer";
        System.out.println(name.substring(1,5));   // enni

        name = name.substring(5);  // fer
        System.out.println(name);

        String name2 = "Jennifer";
        name2.substring(20);  // throw the exception on runtime
        name2.substring(4,2); // throw the exception on runtime
        name2.substring(3,3); // returns empty string
        System.out.println(name2);



        String str = "weather";
        str.substring(3);        // 3 is  starting index. result = ther
        str.substring(2, 5);     //  ath
        str.substring(10);       //outofboundserror
        str.substring(2 ,2);     // empty string
        str.substring(-4);       // outofboundserror











    }
}
