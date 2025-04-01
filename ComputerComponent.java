/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ComputerComponent {
    protected String name;
    protected String manufacturer;
    protected int price;
    protected String Connectivity;
    public ComputerComponent(String name,String manufacturer,int price,String Connectivity){
        this.name=name;
        this.manufacturer=manufacturer;
        this.price=price;
        this.Connectivity=Connectivity;
    }
    public void displayInfo()
    {
        System.out.println("Component:"+name);
        System.out.println("Manufacturer:"+manufacturer);
        System.out.println("Price:$"+price);
        System.out.println("Connectivity:"+Connectivity);
        
    }
    
    
}
