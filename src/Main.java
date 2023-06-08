import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListEmployee le =new ListEmployee();
        int select;
         do {            
             System.out.println("----- EMPLOYEE MANAGEMENT -----");
             System.out.println("1. Adds new employee.");
             System.out.println("2. Shows all employees.");
             System.out.println("3. Show all employees have aveage. "); 
            System.out.println("4. Quit.");
             System.out.print("Please select a function: ");
             select=sc.nextInt();
             switch(select){
                 case 1:{
                     le.AddEmployee();
                     break;
                 }
                 case 2:{
                     le.printEmployee();
                     break;
                 }
                 case 3:{
                     le.printEmployee();
                     System.out.print("Average wage: "+le.Averagewage()+"\n");
                     break;
                 }
                 case 4:{
                     System.out.println("THANK FOR USING OUR APPLICATION!\nSEE YOU AGAIN!");
                    return;}
                 default:
                     System.out.println("The function of application must be from 1 to 3!");
             }
        } while (true);
    }
}
