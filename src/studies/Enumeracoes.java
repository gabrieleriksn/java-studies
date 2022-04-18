package studies;
import entities_enums.OrderStatus;
import entities.Order;
import java.util.Date;

public class Enumeracoes {
    public static void main(String[] args) {

        /*

        ENUMERAÇÕES

        São um tipo especial em Java que servem para especificar de forma literal
        um conjunto de CONSTANTES relacionadas. Servem, geralmente, para 
        representar estados.

        Palavra chave em Java: enum

        Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador

        */

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        
        // Como é uma constante fazemos a "instanciação" através da Classe.Contante;       
        
        System.out.println(order);

        
        
        // Como converter de String para enum?? 
        
        // OrderStatus order1 = OrderStatus.valueOf("DELIVERED");
        
        // Serve, basicamente, para realizar entrada de dados de usuários e armazenar na forma de
        // enum
    
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
