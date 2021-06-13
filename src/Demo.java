public class Demo {
    public static void main(String args[]) {
        String str = "Hello world!";
        System.out.println("str::"+str);

        //Creating String using new keyword
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        //Length of the string
        String s1 = "Prashanth Kumar";
        System.out.println("Length "+s1.length());

        //Concatenation
        String s11 = "Hello";
        String s12 = "hello";
        System.out.println(s11.concat("Prashnath").concat(s12));
        s11 = s11.concat("Prashnath").concat(s12);
        s11 = s11.concat("rto");
        System.out.println(s11);

        int i = 0;
        System.out.println(++i);
        System.out.println(i);

        //chartAt
       // System.out.println(s11.charAt(1));
        //indexOf
        //System.out.println(s11.indexOf("H"));
        //Equals
        //System.out.println(s11.equalsIgnoreCase(s12));
        //Replace

        //toUpperCase
        String name = "Prashanth Kumar";
        //System.out.println(name.toLowerCase());
        //toLowerCase

    }
}
