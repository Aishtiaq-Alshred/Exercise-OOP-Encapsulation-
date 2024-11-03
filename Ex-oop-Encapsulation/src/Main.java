//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Account
        Account account1 = new Account("1116442797", "Aishtiaq", 1000);


        account1.credit(1000);


        account1.debit(500);


        Account account2 = new Account("250", "Mona");
        account1.transferTo(account2, 400);

        System.out.println();
        System.out.println(account1);
        System.out.println(account2);


        System.out.println("--------------------------------------------------------------------");

        //Employee

        Employee employee = new Employee("11145", "Ahmed", 7000);


        System.out.println(employee);


        System.out.println("Annual salary: " + employee.getAnnualSalary());


        employee.raiseSalary(20);


        System.out.println(employee);






    }
}