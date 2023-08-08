import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee emp1 = new SalariedEmployee("Deirdre Swiss", 84000);
        SalariedEmployee emp2 = new SalariedEmployee("Mike Swiss", 82000);
        SalariedEmployee emp3 = new SalariedEmployee("Matt Swiss", 94000);


    String fileName = "Pay_stubs.txt";

        List<SalariedEmployee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        SalariedEmployee.printStub(fileName, employees);

    }
}