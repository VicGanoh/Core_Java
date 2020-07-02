import java.util.*;

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Daniel Chris", "Software Engineer", 45, 5, 24),
                new Employee("Freda Anim", "Data Scientist", 23, 6, 12),
                new Employee("Sheila Greene", "Business Consultant", 58, 7, 48),
                new Employee("Nancy Smith", "Software Engineer", 41, 5, 6),
                new Employee("Victor Tetteh", "Marketer", 30, 3, 5),
                new Employee("Jeniffer Rogers", "Web Developer", 20, 0, 0)

        );

        //filter and get hours worked maximum of 12hrs or more
        List<Employee> filterEmployeeHoursWorked = filter(employeeList, new Predicate<Employee>() {
            @Override
            public boolean test(Employee hoursWorked) {
                return hoursWorked.getHoursWorkedFor() > 11;
            }
        });
        System.out.println("Hours worked for maximum of 12 or more: ");
        System.out.println(filterEmployeeHoursWorked);
        System.out.println("=============================================");

        //filter number of days employee has worked
        List<Employee> numberOfDaysWorkedByEmployee = filter(employeeList, new Predicate<Employee>(){
            @Override
            public boolean test(Employee daysWorked){
                return daysWorked.getNumberOfDaysWorked() > -1;
            }
        });
        System.out.println("Number of days worked by Employee: ");
        System.out.println(numberOfDaysWorkedByEmployee);
        System.out.println("=============================================");

        //filter employees with age greater than 25
        List<Employee> employeesAge = filter(employeeList, new Predicate<Employee>() {
            @Override
            public boolean test(Employee employeesAge) {
                return employeesAge.getEmployeesAge() > 25;
            }
        });
        System.out.println("Employees with age above 25 years: ");
        System.out.println(employeesAge);
        System.out.println("=============================================");

        //filter employees who are software engineers and data scientist only
        List<Employee> softwareEngineersAndDataScience = filter(employeeList, new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getEmployeesOccupation().equals("Software Engineer") || employee.getEmployeesOccupation().equals("Data Scientist");
            }
        });
        System.out.println("Employees who are Software Engineer or Data Scientist only");
        System.out.println(softwareEngineersAndDataScience);


        List<Orange> orangeList = List.of(
                new Orange(Color.GREEN,150),
                new Orange(Color.YELLOW,35),
                new Orange(Color.GREEN, 21)
        );


//
//        List<Orange> ripeOrange = filter(orangeList, new Predicate<Orange>() {
//            @Override
//            public boolean test(Orange riped) {
//                return riped.getColor().equals(Color.YELLOW);
//            }
//        });
//        System.out.println("Riped Oranges");
//        System.out.println(ripeOrange);
//
//        List<Orange> greenOranges = filter( orangeList, (Orange orange) ->
//                {
//                    return orange.getColor().equals(Color.GREEN);
//                }
//        );
//
//        System.out.println(greenOranges);




    }

    public static class Employee {
        private String employeesName;
        private int numberOfDaysWorked = 0;
        private int hoursWorkedFor = 0;
        private int employeesAge;
        private String employeesOccupation;

        public Employee(String employeesName, String employeesOccupation, int employeesAge, int numberOfDaysWorked, int hoursWorkedFor) {
            this.employeesName = employeesName;
            this.employeesOccupation = employeesOccupation;
            this.employeesAge = employeesAge;
            this.numberOfDaysWorked = numberOfDaysWorked;
            this.hoursWorkedFor = hoursWorkedFor;
        }

        //getters and setters
        public String getEmployeesName() {
            return employeesName;
        }

        public void setEmployeesName(String employeesName) {
            this.employeesName = employeesName;
        }

        public int getNumberOfDaysWorked() {
            return numberOfDaysWorked;
        }

        public void setNumberOfDaysWorked(int numberOfDaysWorked) {
            this.numberOfDaysWorked = numberOfDaysWorked;
        }

        public int getHoursWorkedFor() {
            return hoursWorkedFor;
        }

        public void setHoursWorkedFor(int hoursWorkedFor) {
            this.hoursWorkedFor = hoursWorkedFor;
        }

        public int getEmployeesAge() {
            return employeesAge;
        }

        public void setEmployeesAge(int employeesAge) {
            this.employeesAge = employeesAge;
        }

        public String getEmployeesOccupation() {
            return employeesOccupation;
        }

        public void setEmployeesOccupation(String employeesOccupation) {
            this.employeesOccupation = employeesOccupation;
        }

        @Override
        public String toString() {
            return String.format("Employee{Name='%s' Occupation='%s' Age='%d'yrs Number of Days Worked for='%d' Hours Worked='%d'hrs}",
                    employeesName, employeesOccupation, employeesAge, numberOfDaysWorked, hoursWorkedFor);
        }
    }

    interface Predicate<T> {
        boolean test(T t);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static class Orange{
        private Color color;
        private int weight = 0;

        public Orange(Color color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Orange{" +
                    "color=" + color +
                    ", weight=" + weight +
                    '}';
        }
    }

    enum Color{
        GREEN, YELLOW
    }
}
