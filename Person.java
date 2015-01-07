import java.util.ArrayList;
/**
 * 
 * 
 * @author Marcelino José Granda Muñoz
 * @version 
 */
public class Person
{
    // instance variables - replace the example below with your own
    //nombre de la persona
    private String name;
    //edad de la persona
    private int age ;
    //madre de la persona
    private Person father;
    //padre de la persona
    private Person mother;
    //hijo de la persona
    private ArrayList<Person> children;

    /**
     * constructor inicializa valores de nombre (name String)y edad(age int) con parametros por parametros
     *  
     */
    public Person(String name, int age)
    {
        //datos de la persona
        this.name = name;
        this.age  = age;

        //familiares 
        this.father   = null;
        this.mother   = null;
        this.children = null;
    }

    /**
     * crea un objeto Persona que sera el padre
     * el padre ha de ser almenos 13 años mayor 
     */
    public void setFather(Person father ) 
    {
        if ((this.age + 13) <= father.getAge())
        {
            this.father = new Person(name, age);
        }
        else
        {
            System.out.println("Error," + father.getName() + " es demasiado joven para ser la padre de " + this.name);
        }
    }

    /**
     * crea un objeto Persona que sera la madre
     * el madre ha de ser almenos 13 años mayor 
     */
    public void setMother(Person mother) 
    {
        if ((this.age + 13) <= mother.getAge())
        {
            this.mother = mother;
        }
        else
        {
            System.out.println("Error," + mother.getName() + " es demasiado joven para ser la madre de " + this.name);
        }
    }

    /**
     * crea un objeto Persona que sera el hijo
     * el hijo ha de ser almenos 13 años menor 
     */
    public void children(Person children) 
    {
        //si tienen una diferencia de 13 años
        if(this.age <= 13)
        {
            System.out.println("Error, " + this.name + " no tiene edad suficiente para tener hijos");
        }
        else if ((children.getAge() + 13) <= this.age)
        {
            this.children.add(children) ;
        }
        // si la diferencia de edad es inferior a 13
        else
        {
            System.out.println("Error," + children.getName() + " es demasiado mayor para ser hijo de " + this.name);
        } 
    }

    /**
     * imprime por pantalla nombre y edad
     */
    public void showData()
    {
        System.out.println("Nombre: " + this.name);
        System.out.println("Edad:   " + this.age);
    }
    
    /**
     * retorna la edad
     */
    public int getAge()
    {
        return this.age;
    }
    
    /**
     * retorna el nombre de la persona
     */
    public String getName()
    {
        return this.name;
    }
    
}
