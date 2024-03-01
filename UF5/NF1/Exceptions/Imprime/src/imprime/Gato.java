/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imprime;

/**
 *
 * @author mabardaji
 */
public class Gato {
    private String name;
    private int age;

    public Gato(String name, int age) throws NameTooShortException, AgeNotNegativeException {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) throws NameTooShortException {
        if (name.length()<3)
        {
            throw new NameTooShortException(name);
        }
        else
                    this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeNotNegativeException {
        if (age<0)
        {
            throw new AgeNotNegativeException("Edad negativa no permitida");
        }
        else
            this.age = age;
        
    }
    
    
    
}
