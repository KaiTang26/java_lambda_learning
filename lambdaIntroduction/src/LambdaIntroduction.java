import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public class LambdaIntroduction {

    public static void main(String[] args) {
        new Company(new Employee(){

            @Override
            public void getPay() {
                System.out.println("My Salary is low");
            }
        }).getTotalSalary();

        new Company(()->System.out.println("my salary is high")).getTotalSalary();

        String processedString = processStrings((String s1, String s2)->{
            return s1.toUpperCase()+" "+s2.toUpperCase();
        }, "kai", "kang");

        UpperConcat upperConcat = (String s1, String s2)->{
            return s1.toUpperCase()+" "+s2.toUpperCase();
        };

        System.out.println(processStrings(upperConcat, "yinying", "huang"));

    }

    private static String processStrings(UpperConcat upperConcat, String s1, String s2){
        return  upperConcat.upperAndConcat(s1, s2);

    };
}

class Company {
    private Employee employee;

    public Company(Employee employee) {
        this.employee = employee;
    }

    public void getTotalSalary() {
        employee.getPay();
    }
}

