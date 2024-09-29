public class ManagerTest{
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 3500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3600000, 1, 11, 1993);
        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        System.out.println("SEBELUM DI SORT : ");
        for (i = 0; i < 3; i++) staff[i].print();
        Sortable.shell_sort(staff);
        System.out.println("SETELAH DI SORT : ");
        for (i = 0; i < 3; i++) staff[i].print();
    }
}