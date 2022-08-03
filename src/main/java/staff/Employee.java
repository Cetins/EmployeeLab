package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null && newName.length() < 0) {
            this.name = newName;
        }
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise) {
        if(raise > 0) {
            setSalary(this.salary + raise);
        }
    }

    public double payBonus() {
        return getSalary() * 0.01;
    }
}
