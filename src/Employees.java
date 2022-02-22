public class Employees {

    String name;
    String vacancy;
    int salary;

   private Employees(String name, String vacancy, int salary){
        this.name = name;
        this.vacancy = vacancy;
        this.salary = salary;
    }

    String salaryForPeriod(int months){
        return  name + " "+ vacancy + " salary for " + months + " month(s): " + months*salary;
    }

   private void compare (Employees employee){
        int thisSalary = this.salary;
        if (this.salary> employee.salary){
            System.out.println("Your salary more");
        } else if(this.salary < employee.salary){
            System.out.println("Your salary is less");
        } else {
            System.out.println("Your salary is equals");
        }
    }
}
