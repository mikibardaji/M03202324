/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasempleado;

/**
 *
 * @author mabardaji
 */
public class Empleat {
    private String name;
    private double salari;
    private String department;
    private final int SMI = 15876;
    public Empleat() {
    }

    public Empleat(String name, double salari, String department) 
            throws SalariInvalidException, DepartamentInvalidException {
        this.name = name;
        this.setSalari(salari);
        this.setDepartment(department);
    }
    
    public Empleat(Empleat e)
    {
        this.name = e.getName();
        this.department = e.getDepartment();
        //this.setSalari(e.getSalari());
        this.salari = e.getSalari();
    }

    public String getName() {
        return name;
    }

    public double getSalari() {
        return salari;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalari(double salari) throws SalariInvalidException {
        if (salari > SMI)
        {
            this.salari = salari;
        }   
        else
        {
            throw new SalariInvalidException(salari);
        }
    }

    public void setDepartment(String department) throws DepartamentInvalidException {
        if (!department.equalsIgnoreCase("Informatica") 
            && !department.equalsIgnoreCase("comercial") 
                && !department.equalsIgnoreCase("Direccio")  )
        {
            throw new DepartamentInvalidException( department);
        }
        else
            this.department = department;
    }
    
    
}
