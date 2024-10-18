public class Salesperson implements Comparable<Salesperson>
{
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    public int compareTo(Salesperson other)
    {
        if (this.totalSales < other.getSales())
            return -1;
        else if (this.totalSales > other.getSales())
            return 1;
        else
            return (lastName + firstName).compareTo(other.getLastName() + other.getFirstName());
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getSales()
    {
        return totalSales;
    }
}