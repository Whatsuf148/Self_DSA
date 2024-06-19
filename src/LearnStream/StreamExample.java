package LearnStream;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static  void main (String []args) {
        List<Integer> list = Arrays.asList(10, 20, 8, 13, 66, 77);
        List<Integer> Check = list.stream().filter(i -> i % 2 == 0).toList();
        long flist = list.stream().filter(i -> i % 2 == 0).count();
        System.out.println(Check);
       Check.forEach(System.out::println);
        
    }}