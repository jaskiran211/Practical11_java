/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author HP
 */
public class Cpu extends ComputerComponent{
    private double clockspeed;
    private int cacheSize;
    public Cpu(String name,String manufacturer,int price,String Connectivity,double clockspeed,int cacheSize)
    {
        super(name,manufacturer,price,Connectivity);
        this.clockspeed=clockspeed;
        this.cacheSize=cacheSize;
    }
      @Override
    public void displayInfo() {  
        super.displayInfo(); 
        System.out.println("Clock Speed: " + clockspeed);
        System.out.println("Cache Size"+cacheSize);
    }
}
