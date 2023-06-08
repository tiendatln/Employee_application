import java.util.ArrayList;
import java.util.Scanner;

public class ListEmployee {
    private final ArrayList<Employee> List;

    public ListEmployee() {
        this.List = new ArrayList<Employee>();
    }

    public ListEmployee(ArrayList<Employee> List) {
        this.List = List;
    }

    public void addEmployee(Employee ep) {
        this.List.add(ep);
    }

    public void printEmployee() {
        int No = 1;
        int age = 0;
        int highestsalary = 0;
        Employee hightEmployee = null;
        System.out.println("----- List of employee have average -----");
        System.out.println("- No. -- ID --   Employee name   -- Year Of Birth -- Salary -");
        for (Employee employee : List) {
            System.out.print("- " + No + " -");
            System.out.println(employee);
            int employeesala = employee.getSalary();
            if (employeesala > highestsalary) {
                highestsalary = employeesala;
                hightEmployee = employee;
            }
            No++;
        }
        age = 2023 - hightEmployee.getYearOfBirth();
        if (hightEmployee != null) {
            System.out.println("*The employee who has the highest salary: " + hightEmployee.getFullName() + "(Age:"
                    + age + ", Salary: " + hightEmployee.getSalary() + ")");
        }
    }

    public void AddEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n----- Add new employee -----");
        System.out.print("Input ID: ");
        String ID = sc.nextLine();
        System.out.print("\nInput name: ");
        String fn = sc.nextLine();
        System.out.print("\nInput year of birth: ");
        int yob = sc.nextInt();
        System.out.print("Input salary: ");
        int salary = sc.nextInt();
        Employee ep = new Employee(ID, fn, yob, salary);
        addEmployee(ep);
    }

    public int Averagewage() {
        int sum = 0;
        int No = 0;
        for (Employee employee : List) {
            sum += employee.getSalary();
            No++;
        }
        int average = sum / No;
        return average;
    }
}
