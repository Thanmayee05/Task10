package javaP;
import java.util.*;
import java.util.stream.*;

public class ListAvg{
    public static void main(String args[])
    {
        List<Integer> al=new ArrayList<> (Arrays.asList(9,1,7,0,3,2,4,1,5,5,1,4,7));
        IntStream intStream=Arrays.stream(al.stream().mapToInt(i->i).toArray());
        double avgRes = intStream.average().getAsDouble();
        System.out.println("Average of list elements is: "+avgRes);
    }
}
