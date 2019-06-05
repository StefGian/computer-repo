package computers;


public class Tablet extends Computer {
    
   
    public Tablet(double price) {
        super(price);
    }

    public Tablet(String brand, double price) {
        super(brand, price);
        
    }

    

    @Override
    protected void setPrice(double price) {
        super.price = price;
    }
    
    
    
    
}
