import java.util.ArrayList;
/**
 * simula una persona que tiene nombre y nuna edad 
 * y se puede indicar que tiene una serie de parientes
 * 
 * @author Marcelino José Granda Muñoz
 * @version 
 */
public class Person
{
    //nombre de la persona
    private String name;
    //edad de la persona
    private int age ;
    //madre de la persona
    private Person father;
    //padre de la persona
    private Person mother;
    //hijos de la persona
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
        this.children = new ArrayList<>();
    }

    /**
     * crea un objeto Persona que sera el padre
     * el padre ha de ser al menos 13 años mayor 
     */
    public void setFather(Person father ) 
    {
        if ((father.getAge() - this.age ) >= 13 )
        {
            this.father =  father;
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
        if ((mother.getAge() - this.age) >= 13 )
        {
            this.mother = mother;
        }
        else
        {
            System.out.println("Error," + mother.getName() + " es demasiado joven para ser la madre de " + this.name);
        }
    }

    /**
     * asigana un objeto Persona que sera el hijo
     * el hijo ha de ser almenos 13 años menor 
     */
    public void addChild(Person children) 
    {
        //si tienen una diferencia de 13 años
        if(this.age < 13)
        {
            System.out.println("Error, " + this.name + " no tiene edad suficiente para tener hijos");
        }
        else if ((this.age - children.getAge() ) >= 13 )
        {
            this.children.add(children);
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
     * retorna booleano en funcion de si se tienen hijos o no
     * cambiar para una sola linea
     */
    public boolean hasChildens()
    {
        return (this.children.size()>0) ;
    }

    /**
     * retorna la edad
     */
    public int getAge()
    {
        return this.age;
    }

    /**
     * retorna true o false en funcion si tiene hemanos o no
     */
    public boolean hasBrothers()
    {
                    //si el padre tiene mas de un hijo
         return ((this.father != null && this.father.getChildren().size()  > 1) || 
                    //si la madre tienen mas de un hijo
                 (this.mother != null && this.mother.getChildren().size()  > 1) );
    }

    /**
     * retorna el nombre de la persona
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * retorna children
     */
    public ArrayList<Person> getChildren()
    {
        return this.children;
    }

    /**
     * retorna numero de hijos
     */
    public int getNumberOfChildren()
    {
        return this.children.size();
    }

    /**
     * muestra por pantalla los datos de la madre y el padre si estan definidos
     */
    public void showParentsData()
    {
        if (this.father != null)
        {
            System.out.println("FATHER");
            System.out.println("----------------");
            this.father.showData();
        }

        if (this.mother != null)
        {
            System.out.println("MOTHER");
            System.out.println("----------------");
            this.mother.showData();
        }
    }

}

