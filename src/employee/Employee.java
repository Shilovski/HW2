package employee;

public class Employee implements Measurable {

    private String name;
    private double measure;

    public Employee(String name, double measure) {
        this.name = name;
        this.measure = measure;
    }

    public Employee(double measure) {
        this.measure = measure;
    }

    @Override
    public double getMeasure() {
        return this.measure;
    }

    public String getName() {
        return name;
    }

    public static double average(Employee[] objects) {
        return Measurable.average(objects);
    }

    public static String getLargest(Employee[] employees) {
        Measurable largest = Measurable.largest(employees);
        Employee largestEmployee = (Employee) largest;
        return largestEmployee.getName();
    }

    public static void main(String[] args) {
        Employee[] eArray = {new Employee("Ivan",500), new Employee("Alex",600),
                new Employee("Dmitry",700), new Employee("Oleg",800),
                new Employee("Artem",900)};
        //ch3: ex 1
        System.out.println(Employee.average(eArray));

        //ch3: ex 2
        System.out.println(Employee.getLargest(eArray));
    }

}
