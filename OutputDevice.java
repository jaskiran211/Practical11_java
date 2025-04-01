/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author HP
 */
public class OutputDevice extends ComputerComponent {
    protected int powerConsumption;
   public OutputDevice(String name,String manufacturer,int price,String Connectivity,int powerConsumption){
        super(name,manufacturer,price,Connectivity);
        this.powerConsumption=powerConsumption;     
    }
      @Override
    public void displayInfo() {  
        super.displayInfo(); 
        System.out.println("powerConsumption: " + powerConsumption);
    }
}
