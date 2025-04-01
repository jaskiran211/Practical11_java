/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author HP
 */
public class StorageDevice extends ComputerComponent {
    protected boolean isExternal;
    public StorageDevice(String name,String manufacturer,int price,String Connectivity,boolean isExternal){
    super(name,manufacturer,price,Connectivity);
    this.isExternal=isExternal;
    }
    @Override
    public void displayInfo() {  
        super.displayInfo(); 
        System.out.println("External Device: " + isExternal);
    }  
}
