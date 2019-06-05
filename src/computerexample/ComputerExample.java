package computerexample;

import computers.Computer;
import computers.Desktop;
import computers.Laptop;
import computers.Tablet;
import java.util.ArrayList;
import java.util.List;

public class ComputerExample {

    public static void main(String[] args) {

        String sony = "Sony";
        String dell = "Dell";
        String samsung = "Samsung";
        String lenovo = "Lenovo";
        String hp = "HP";

        List<Computer> lista = new ArrayList();
        lista.add(new Laptop(lenovo, 670));
        lista.add(new Laptop(dell, 990));
        lista.add(new Laptop(hp, 786));
        lista.add(new Laptop(dell, 870));
        lista.add(new Desktop(hp, 2100));
        lista.add(new Desktop(hp, 1750));
        lista.add(new Desktop(dell, 2450));
        lista.add(new Tablet(samsung, 300));
        lista.add(new Tablet(lenovo, 150));
        lista.add(new Tablet(sony, 200));

        double priceOfSony = 0;
        double priceOfSamsung = 0;
        double priceOfLenovo = 0;
        double priceOfDell = 0;
        double multiComputers = 0;
        for (Computer c : lista) {
            if (c.getBrand().equals(sony)) {
                priceOfSony += c.getPrice();
            } else if (c.getBrand().equals(samsung)) {
                priceOfSamsung += c.getPrice();
            } else if (c.getBrand().equals(lenovo)) {
                priceOfLenovo += c.getPrice();
            } else if (c.getBrand().equals(dell)) {
                priceOfDell += c.getPrice();
            } else {
                multiComputers += c.getPrice();
            }
        }

        System.out.println("priceOfDell is " + priceOfDell);
        System.out.println("priceOfSony is " + priceOfSony);
        System.out.println("priceOfSamsung is " + priceOfSamsung);
        System.out.println("priceOfLenovo is " + priceOfLenovo);
        double total = priceOfDell + priceOfSamsung + priceOfLenovo + priceOfSony;
        System.out.println(total);

        //get price of computers according to object type
        double priceOfLaptop =0.0;
        double priceOfDesktop = 0.0;
        double priceOfTablet = 0.0;
        
        for (Computer c : lista) {
            if (c instanceof Laptop){
                priceOfLaptop += c.getPrice();
            }else if (c instanceof Desktop){
                priceOfDesktop += c.getPrice();
            }else if (c instanceof Tablet){
                priceOfTablet += c.getPrice();
            }
        }
        System.out.println("Laptops cost: " + priceOfLaptop);
        System.out.println("Desktops cost: " + priceOfDesktop);
        System.out.println("Tabletss cost: " + priceOfTablet);
        
        
    }

}
