
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
    private Person children;

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
    public void father(String name, int age) 
    {
        if ((this.age + 13) <= age)
        {
            this.father = new Person(name, age);
        }
        else
        {
            System.out.println("Error edad del padre no valida, demasiado jove");
        }
    }
    
     /**
     * crea un objeto Persona que sera la madre
     * el madre ha de ser almenos 13 años mayor 
     */
    public void mother(String name, int age) 
    {
        if ((this.age + 13) <= age)
        {
            this.mother = new Person(name, age);
        }
        else
        {
            System.out.println("Error edad del madre no valida, demasiado joven");
        }
    }
    
    
    
}
