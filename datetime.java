import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(now.format(Formatter));
    }
}
