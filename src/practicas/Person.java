/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author alma
 */
public class Person {
    private int ageYears = 32;
    private String name = "Pedro";
    private String job = "Programador";
    
    public void calculateAge(){
        int ageDays = ageYears *365;
        long ageSeconds = ageYears *365 *24L *60 *60;
        
        System.out.println("Tienes" + ageDays +"días de nacido.");
        System.out.println("Tienes" + ageSeconds + "días de nacido.");
        }// end of calculateAge method
    public void display(){
        System.out.println("Mi nombre es" + name + ",Soy un" + job);
    }
}//end of class
