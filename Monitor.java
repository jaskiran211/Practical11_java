/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author HP
 */
public class Monitor extends OutputDevice {
   private int screenSize;
   private String resolution;
    public Monitor(String name,String manufacturer,int price,String Connectivity,int powerConsumption,int screenSize,String resolution){
    super(name,manufacturer,price,Connectivity,powerConsumption);
    this.screenSize=screenSize;
    this.resolution=resolution;
    }
    @Override
    public void displayInfo() {  
        super.displayInfo(); 
        System.out.println("Screen size:"+screenSize);
        System.out.println("Resolution"+resolution);
    }     
}
