public class EmployeeTest{
    public static void main (String[] args){
        int i;
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 3000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 4000000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 1000000, 1, 11, 1993);
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        System.out.println("SEBELUM DI SORT : ");
        for (i = 0; i < 3; i++) staff[i].print();
        Sortable.shell_sort(staff);
        System.out.println("SETELAH DI SORT : ");
        for (i = 0; i < 3; i++) staff[i].print();
    }
}