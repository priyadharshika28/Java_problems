import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary:");
        int salary = sc.nextInt();
        System.out.println("Enter performance appraisal rating:");
        double rating = sc.nextDouble();
        if(salary<=0 || rating<1 && rating>5){
            System.out.println("Invalid Input");
            return;
        }
        else if(rating>=1 && rating<=3){
            salary+=0.1*salary;
        }
        else if(rating>3 && rating<=4){
            salary+=0.25*salary;
        }
        else if(rating>4 && rating<=5){
            salary+=0.30*salary;
        }
        int tot = salary;
        System.out.println(tot);
    }
}
