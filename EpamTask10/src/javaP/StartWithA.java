package javaP;

import java.util.*;
import java.util.stream.Collectors;

public class StartWithA {
    public static List<String> checkStrings(List<String> sList) {
        return sList.stream().filter(str -> (str.startsWith("a") && str.length()==3 )).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    	List<String> l1 = Arrays.asList("ant", "Ape", "bird", "alian", "age", "bat","","aim","about","cat");
        List<String> l2= checkStrings(l1);
        System.out.println("Strings with length 3 and starting with 'a' are:");
        System.out.println(l2);
    }
}