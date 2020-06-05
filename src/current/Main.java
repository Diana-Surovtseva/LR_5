package current;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Database");
        Employee employee = new Employee("Olga", "Manager", "3333333");
        System.out.println("To string: " + employee.toString());
Engineer engineer1 = new Engineer("Artur", "Jun dev", "777777");
        System.out.println(engineer1.toString());
        Manager manager1 = new Manager("Olga", "Manager", "888888");
        System.out.println(manager1.toString());
        Employee employee1 = new Engineer("Serj", "QA", "454545");
        System.out.println(employee1.toString());
        employee.doWork();

Employee employee2 = new Manager("Tolik", "Worker", "78787778");
        System.out.println(employee2.toString());
        System.out.println("done");

employee2.doWork();
    }
}
