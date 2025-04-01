/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author HP
 */
public class Keyboard extends InputDevice {
    private String layout;
   public Keyboard(String name, String manufacturer, int price, String Connectivity, boolean isMechanical, String layout){
       super(name,manufacturer,price,Connectivity,isMechanical);
       this.layout=layout;
   }
     @Override
    public void displayInfo() {  
        super.displayInfo(); 
        System.out.println("Layout: " + layout);
    }
}
