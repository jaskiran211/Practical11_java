/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */
public class InputDevice extends ComputerComponent {
    protected boolean isMechanical;

    public InputDevice(String name, String manufacturer, int price, String connectivity, boolean isMechanical) {
        super(name, manufacturer, price, connectivity);
        this.isMechanical = isMechanical; 
    }
     @Override
    public void displayInfo() {  
        super.displayInfo(); 
        System.out.println("Mechanical: " + isMechanical);
    }
}


