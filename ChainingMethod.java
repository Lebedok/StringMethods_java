package StringExample;

public class ChainingMethod {

    public static void main(String[] args) {

       // EXAMPLE #1
        String day = "Saturday";

        String result = day.substring(day.length()-3);
        System.out.println(result);                  //  day

        result = result.toUpperCase();
        System.out.println(result);                    // DAY

        result=result.replace("Y", "D");  //  DAD
        System.out.println(result);

        // EXAMPLE #2  Chaining
        String value = "Saturday";
        String chainingResult = day.substring(day.length()-3).toUpperCase().replace("Y", "D");
        System.out.println(chainingResult);


        // EXAMPLE #3 chaining with primitive data type

        String day2 = "Saturday";
        day2 = day2.toUpperCase();
        System.out.println(day2.charAt(3));    // U


        String day3 = "Saturday";
        System.out.println(day.toUpperCase().charAt(3));  // after charAt() we cant chain any methods.


        // EXAMPLE #4
        char resultt = day3.toUpperCase().charAt(2);
        System.out.println(resultt);

        String month = "  January   ";
        month = month.trim().toLowerCase().substring(0, 3).replace("n", "N");
        System.out.println(month);        // jaN


        int index = month.trim().concat(" Method Chaining").indexOf("");
        System.out.println(month);      //immutible


        boolean bl = month.trim().equals("jaN");   // equals() method returns boolean. After that method we cant chain any method
        System.out.println(bl);


        String sentence = "  Zero to Hero  ";
        //TASK:
        //change Zero with One,
        //make all of them upper case
        //get only first three character
        // print length of first three character

       int number =  sentence.replace("Zero", "One").toUpperCase().trim().substring(0,3).length();
        System.out.println(number);

        int num = sentence.trim().substring(0,5).charAt(3);
        System.out.println(num);                      // according to ascii table letter  o  = 111



        String test = "STRING T";
        int in = test.indexOf("T", test.indexOf("T")+1);
        System.out.println(in);                                    // result = 7 which is index number of the second "T"











    }
}
