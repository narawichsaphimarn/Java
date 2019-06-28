package Chapter12;

class DigitalCamera2 {
    String brand;
    String model;
    String cardType;
    double price;
    
    public DigitalCamera2(String brand,String model,String cardType,double price){
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

class SLRCamera2 {
    String brand;
    String model;
    String cardType;
    double price;
    String lensType;
    
    public SLRCamera2(String brand,String model,String cardType,double price,String lensType){
        setBrand(brand);
        setModel(model);
        setCardType(cardType);
        setPrice(price);
        setLensType(lensType);
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
    
    public void setLensType(String lensType){
        this.lensType = lensType;
    }
    
    public String getLensType(){
        return this.lensType;
    } 
}

public class CameraShop2 {
    public static void main(String[] args){
        DigitalCamera2 d = new DigitalCamera2("Nikon","Coolpix S710","SD/MMC/SDHC",12990.0);
        System.out.println(d.getBrand() + " " + d.getModel() + " (CardType : " + d.getCardType() + " ) => " + d.getPrice());
        SLRCamera2 s = new SLRCamera2("Canon","1000D","SD",15000.0,"macro lens");
        System.out.print("Brand : " + s.getBrand() + "\n" + "Model : " + s.getModel() + "\n" + "Card Type : " + s.getCardType() + "\n" + "Lens Type : "
                + s.getLensType() + "\n" + "Price : " + s.getPrice());
    }
}

