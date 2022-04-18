package entities;

public class ProductRf {
    
    private String name;
    private Double price;

    public ProductRf() {
    }

    public ProductRf(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
