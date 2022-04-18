package entities;

public class OrderItemRf {
    
    private Integer quantity;
    private ProductRf product;

    public OrderItemRf() {
    }

    public OrderItemRf(Integer quantity, ProductRf product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public ProductRf getProduct() {
        return product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setProduct(ProductRf product) {
        this.product = product;
    }

    public Double subTotal() {
        return quantity * product.getPrice();
    }
}
