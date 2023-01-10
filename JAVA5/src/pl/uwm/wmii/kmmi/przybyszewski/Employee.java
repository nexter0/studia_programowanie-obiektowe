package pl.uwm.wmii.kmmi.przybyszewski;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Employee
{
    public Employee(String name, double salary, int year, int month, int day)
    {
        this(name, salary, LocalDate.of(year, month - 1, day));
    }

    public Employee(String name, double salary, LocalDate hireDay)
    {
        this.name = name;
        this.salary = salary;
        this.hireDay = Date.from(hireDay.atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Dodane w stosunku do poprzedniej wersji
        id = nextId;
        ++nextId;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        return (Date) hireDay.clone();
    }

    public void raiseSalary(double procent)
    {
        double raise = salary * procent / 100;
        salary += raise;
    }

    // Dodane w stosunku do poprzedniej wersji
    public int getId()
    {
        return id;
    }

    // Dodane w stosunku do poprzedniej wersji
    public void setId()
    {
        id = nextId;
        ++nextId;
    }

    // Dodane w stosunku do poprzedniej wersji
    public static int getNextId()
    {
        return nextId;
    }

    private final String name;
    private double salary;
    private Date hireDay;

    // Dodane w stosunku do poprzedniej wersji
    private int id;
    private static int nextId = 1;
}
