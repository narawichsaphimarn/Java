package Chapter12;

class DigitalCamera {
    String brand;
    String model;
    String cardType;
    double price;
    
    public DigitalCamera(String brand,String model,String cardType,double price){
        setBrand(brand); 
        setModel(model);
        setCardType(cardType);
        setPrice(price);
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public void setCardType(String cardType){
        this.cardType = cardType;
    }
    
    public String getCardType(){
        return this.cardType;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return this.price;
    } 
}

class SLRCamera {
    String brand;
    String model;
    String cardType;
    int price;
    String lensType;
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public void setCardType(String cardType){
        this.cardType = cardType;
    }
    
    public String getCardType(){
        return this.cardType;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return this.price;
    } 
    
    public void setLensType(String lensType){
        this.lensType = lensType;
    }
    
    public String getLensType(){
        return this.lensType;
    } 
}

public class CameraShop {
    public static void main(String[] args){
        DigitalCamera d = new DigitalCamera("Nikon","Coolpix S710","SD/MMC/SDHC",12990.0);
        
        System.out.println(d.getBrand() + " " + d.getModel() + " (CardType : " + d.getCardType() + " ) => " + d.getPrice());
    }
}
