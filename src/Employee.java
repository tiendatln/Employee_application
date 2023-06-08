public class Employee {
    private String ID;
    private String FullName;
    private int yearOfBirth;
    private int Salary;
    
    public Employee(String ID, String fn, int yob, int Salary) {
        this.ID = ID;
        this.FullName = fn;
        this.yearOfBirth = yob;
        this.Salary = Salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fn) {
        this.FullName = fn;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yob) {
        this.yearOfBirth = yob;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return String.format("-  %-3s-- %-23s--  %-7d--  %-6d",ID,FullName,yearOfBirth,Salary); //To change body of generated methods, choose Tools | Templates.
    }
}
