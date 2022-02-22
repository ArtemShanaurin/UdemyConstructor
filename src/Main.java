public class Main {
    public static void main(String[] args) {
        Employees emploees1 = new Employees("Kolya", "QA", 5000);
        emploees1.vacancy = "Developer";
        emploees1.salary = 5000;

        Employees emploees2 = new Employees("Vasya", "QA", 5000);

        emploees1.compare(emploees2);

       // System.out.println(emploees1.salaryForPeriod(2));

    }

}
