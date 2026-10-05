import java.util.Locale;
import java.util.Scanner;

public class string{
    static void main(){

        String str = "My,name,is,Sans";
        String[] words = str.split(",");
        for(String word:words){
            System.out.println(word);
        }

//        String name = "Sans";
//        char[] arr = name.toCharArray();
//        for(char ch: arr){
//            System.out.println("Value of char:" +ch);
//        }
//        String name = "hello Sans bye";
//        System.out.println(name.startsWith("hello"));
//        System.out.println(name.endsWith("Sans"));

//        int num = 5123;
//        String str = String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(str+1);
//        String str = "My name is Sans";
//        System.out.println(str.substring(3, 7));
//        System.out.println(str.contains("love"));
        //empty -> length = 0
        //blank -> empty or spaces

//        String name = "sans";
//        System.out.println(name.toUpperCase());
//        String name2 = "SANS";
//        System.out.println(name2.toLowerCase());
//        String str = "";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//
//        String name = " sans   ";
//        System.out.println(name.length());
//        name = name.trim();
//        System.out.println(name.length());

//        String str = "Sans";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//
//        String name = "sans";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide Value: ");
//        String str = sc.nextLine();
//        System.out.println("Value of nextLine: "+str);
//
//        System.out.println("Provide Value: ");
//        String str2 = sc.next();
//        System.out.println("Value of next: "+str2);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide String: ");
//        String str = sc.nextLine();
//        System.out.println("Given String: "+ str);


//        String name1 = "sans";
//        String name2 = "sans";
//
//        if(name1.equals(name2)){
//            System.out.println("Both strings are equal");
//        }
//        else{
//            System.out.println("Not equal");
//        }


//        String firstName = "sans";
//        String secondName = "hello";
//        System.out.println(firstName + " " + secondName);
//
//        //System.out.println(firstName[0]);
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(2));

//        String name = "Rana";name[0] = 'B';
//        name = "Bana";
//        System.out.println(name);


    }
}