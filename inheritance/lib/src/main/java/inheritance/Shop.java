package inheritance;

public class Shop {

    private String name;
    private String description;
    private int priceCat;

    public Shop(String name ,String description , int priceCat){
        this.name=name;
        this.description = description;
        this.priceCat=priceCat;
    }

    @Override
    public String toString(){

        return "Shop Name: " + name + " - Shop Description: "+
                description+
                " - Price Category : " +priceCat + ".$";
    }
}
