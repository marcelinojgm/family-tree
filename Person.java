
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
    
    
}
