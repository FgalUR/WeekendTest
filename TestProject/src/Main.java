import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        for(int i=0; i<20; i++){
            integers.add(i);
            System.out.println(integers);
        }
        int sum=0;
        for(int i: integers){
            sum+=i;
        }
        System.out.println("This is sum");
    }
}
