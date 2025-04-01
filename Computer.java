/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Computer {
    public static void main(String args[])
    {
       ComputerComponent ob1=new ComputerComponent("Mouse","Logitech",10,"Wired");
       ob1.displayInfo();
       InputDevice ob2=new InputDevice("Keyboard","HP",2000,"Wireless",true);
       ob2.displayInfo();
       Keyboard ob3=new Keyboard("Lenevo","Hp",150,"Wired",true,"Qwerty");
       ob3.displayInfo();
       OutputDevice ob4=new OutputDevice("Speaker","Boat",120,"Wireless",20);
       ob4.displayInfo();
       Monitor ob5=new Monitor("LED","Asus",34,"Wireless",56,30,"1920X1080");
       ob5.displayInfo();
       Cpu ob6=new Cpu("Cpu1","Intel",89,"Wired",235.98,78);
       ob6.displayInfo();
       StorageDevice ob7=new StorageDevice("Hard disc","Tintri",90,"Wireless",true);
       ob7.displayInfo();
       HDD ob8=new HDD("Hard Disc 1","Hp",89,"Wireless",false,90,"2.5 inch");
       ob8.displayInfo();
}
}