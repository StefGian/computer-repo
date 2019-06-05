package computers;


public class Laptop extends Computer {
    
    
    public Laptop(double price) {
        super(price);
    }

    public Laptop(String brand, double price) {
        super(brand, price);
        
    }


    @Override
    protected void setPrice(double price) {
        super.price = price;
    }

    
    
    
    
    
    
}
