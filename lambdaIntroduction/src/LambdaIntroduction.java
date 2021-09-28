public class LambdaIntroduction {

    public static void main(String[] args) {
        new Company(new Employee(){

            @Override
            public void getPay() {
                System.out.println("My Salary is low");
            }
        }).getTotalSalary();

        new Company(()->System.out.println("my salary is high")).getTotalSalary();
    }
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

