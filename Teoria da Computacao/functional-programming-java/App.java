package src;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Map: ");
        Arrays.asList(1, 3, 5, 7, 9, 11, 13)
            .stream()
            .map(num -> num*2)
            .forEach(num -> System.out.print(num+"| "));

        System.out.println();
        System.out.print("Filter: ");
        Arrays.asList("functional-programming", "java", "computation-theory", "Wellington-Della-Mura")
            .stream()
            .filter(str -> str.length() > 20 )
            .forEach(str -> System.out.print(str+", "));
        
        System.out.println();
        System.out.print("Reduce: ");
        String reducedStr = Arrays.asList("this", "is", "a", "functional", "programming", "test")
            .stream()
            .reduce("", (str1, str2) -> str1 + " " + str2);
        System.out.println(reducedStr);
    }

}
