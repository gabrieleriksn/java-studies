package entities;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import entities_enums.OrderStatusRf;
import java.text.SimpleDateFormat;

public class OrderRf {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
    private static SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date moment;
    private OrderStatusRf status;
    private ClientRf client;

    List<OrderItemRf> listOrderItemsRf = new ArrayList<>();

    public OrderRf(Date moment, OrderStatusRf status, ClientRf client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }
    
    public OrderStatusRf getStatus() {
        return status;
    }

    public ClientRf getClient() {
        return client;
    }

    public void setStatus(OrderStatusRf status) {
        this.status = status;
    }

    public void addItem(OrderItemRf item) {
        listOrderItemsRf.add(item);
    }

    public void removeItem(OrderItemRf item) {
        listOrderItemsRf.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItemRf item : listOrderItemsRf) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Order moment: " + sdf.format(getMoment()) + "\n");
        
        String status = getStatus().toString();
        status = status.substring(0, 1).toUpperCase() + status.substring(1).toLowerCase();
        sb.append("Order status: " + status + "\n");
        
        sb.append("Client: " + client.getName() + " (" + sdfr.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        
        sb.append("Order items:\n");
        
        for (OrderItemRf o : listOrderItemsRf) {
            sb.append(o.getProduct().getName() 
                      + ", $" 
                      + String.format("%.2f", o.getProduct().getPrice()) 
                      + ", Quantity: " 
                      + o.getQuantity() 
                      + ", Subtotal: $" 
                      + String.format("%.2f", o.subTotal()) 
                      + "\n");
        }
        
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}
