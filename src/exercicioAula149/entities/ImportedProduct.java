package exercicioAula149.entities;

public final class ImportedProduct extends Product {
    
    private Double customnsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customnsFee) {
        super(name, price);
        this.customnsFee = customnsFee;
    }

    public Double getCustomnsFee() {
        return customnsFee;
    }

    public void setCustomnsFee(Double customnsFee) {
        this.customnsFee = customnsFee;
    }

    @Override
    public String priceTag() {
        return name 
               + " $ " 
               + String.format("%.2f", price + customnsFee) 
               + " (Customns fee: $ " 
               + String.format("%.2f", customnsFee) 
               + ")"; 
    }

}
