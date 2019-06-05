package computers;


public abstract class Computer {
    
    private String brand;
    protected double price;

    public Computer(double price) {
        this.price = price;
    }

    
    
    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    
    
    
    public String getBrand(){
        return brand;
    }
    
    public double getPrice(){
        return price;
    }
    
//    public void setBrand(String brand){
//        this.brand = brand;
//    }
    
    protected abstract void setPrice(double price);
    
    
    
    
}
