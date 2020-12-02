package StringExample;

public class StringMethodChar {


    public static void main(String[] args) {

        String device = "mic rophone";
        System.out.println(device.charAt(4));

        char letter = device.charAt(8); // return type charAt() method is char
        System.out.println(letter);


        System.out.println(device.indexOf("m")); // return : 0
        System.out.println(device.indexOf(" "));
        System.out.println(device.indexOf("rop"));  // 4 returns first matching element
        System.out.println(device.indexOf("k")); // -1  if there is no matching letter it will return -1
        System.out.println(device.indexOf("ono"));  // -1 it should match exactly with all the letters
        System.out.println(device.indexOf("o"));  // output is first matching "o"
        System.out.println(device.indexOf("on")); //  returns second o
        System.out.println(device.indexOf("o",6)); // will return element after index 5
        System.out.println(device.indexOf("o",device.indexOf("o")+1)); // starts to search after one elements from "o"


        String numLetters = "sasknc1991ABC";
        String nums;
        String capitalLetter;
        nums = numLetters.substring (6, 10);
        capitalLetter = numLetters.substring(10, 11);
        System.out.println(nums);
        System.out.println(capitalLetter);

        System.out.println(device.indexOf('a'));

        //System.out.println(numLetters.charAt(numLetters.length()) -1);




    }
}
