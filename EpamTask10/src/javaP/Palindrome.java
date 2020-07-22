package javaP;

import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface check_palindrome{
    List<String> check_if_palindrome(List<String> list_strings);
}
class PalindromeChecker {

    public static List<String> isPalindrome(List<String> l) {
        return l.stream().filter(t-> t.equals(new StringBuilder(t).reverse().toString())).collect(Collectors.toList());
    }

}
public class Palindrome {
    public Palindrome() {
    }

    public List<String> palindromeCheck(check_palindrome p, List<String> str) {
        return p.check_if_palindrome(str);
    }
    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        List<String> sList= new ArrayList<>();
        sList.add("epam");
        sList.add("rotator");
        sList.add("tasks");
        sList.add("level");
        sList.add("india");
        sList.add("college");
        sList.add("minim");
        sList.add("radar");
        List<String> res;

        res = pal.palindromeCheck(PalindromeChecker::isPalindrome,sList);
        System.out.println(res);
    }
}