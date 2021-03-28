/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author tolga
 */
public class Animal {
    public String name;
    public Animal(){
        this.name = "kitten";
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
       Cat cat1 = new Cat("garfield");
       Cat cat2 = cat1;
       Cat cat3 = (Cat) cat1.clone();
       cat1.name="heatcliff";
        System.out.println(cat1.name+" "+cat2.name+" "+cat3.name+" ");
    }
    
    
}
class Cat extends Animal implements Cloneable{
    
    public Cat(String name){
        super();
        this.name = name;

}
@Override
protected Object clone() throws CloneNotSupportedException{
    return super.clone();
}
}
