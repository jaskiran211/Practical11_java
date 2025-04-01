/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author HP
 */
public class HDD extends StorageDevice {
    private int rpm;
    private String formFactor;
    public HDD(String name,String manufacturer,int price,String Connectivity,boolean isExternal,int rpm,String formFactor)
    {
        super(name,manufacturer,price,Connectivity,isExternal);
        this.rpm=rpm;
        this.formFactor=formFactor;
    }
    @Override
    public void displayInfo() {  
        super.displayInfo(); 
        System.out.println("RPM value: " + rpm);
        System.out.println("Form Factor:"+formFactor);
    }
}
