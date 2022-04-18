package aplications;

import entities.Account;
import entities.SavingsAccount;

public class AccountMainProgram {
    public static void main(String[] args) {
        
        /*
        //Account acc = new Account(1001, "Alex", 0.0);
        //BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        // UPCASTING
        //Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount bacc2 = (BusinessAccount) acc2;
        bacc2.loan(200.00);
        SavingsAccount sacc1 = (SavingsAccount) acc3;
        sacc1.updateBalance();
        
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount bacc3 = (BusinessAccount) acc3;
            bacc3.loan(200.00);
            System.out.println("Load!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount sacc2 = (SavingsAccount) acc3;
            sacc2.updateBalance();
            System.out.println("Update!");
        }

        System.out.println();
        
        Account conta = new Account(1002, "Gabriel", 200.00);
        
        System.out.println(conta.getBalance());
        conta.withdraw(100.0);
        System.out.println(conta.getBalance());
        
        System.out.println();
        
        SavingsAccount contaPoupanca = new SavingsAccount(1003, "Gabriel", 200.00, 2.0);
        
        System.out.println(contaPoupanca.getBalance());
        contaPoupanca.withdraw(100.00);
        System.out.println(contaPoupanca.getBalance());
        */

        // POLIMORFISMO

        Account x = new Account(1020, "Alex", 1000.00);
        Account y = new SavingsAccount(1023, "Maria", 1000.00, 0.01);

        x.withdraw(200.00);
        System.out.println(x.getBalance());
        y.withdraw(200.00);
        System.out.println(y.getBalance());

        /*
        Logo, fica entendido que quando trabalhamos com a SuperClasse e com a SubClasse
        se tivermos feito a sobreposição de um método que existe na SuperClasse na criação SubClasse
        
        Então ao instanciar ao fazer o upcasting o método que irá prevalecer será o da subclasse, já que
        o próprio compilador entender que apesar de você estar tratando a Classe forma genérica
        ela é no final das contas uma classe específica que tem sua própria sobreposição de métodos
        
        Daí o nome polimorfismo = variáveis do mesmo tipo se comportando de formas diferentes.
        */

    }
}
