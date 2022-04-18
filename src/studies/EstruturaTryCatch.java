package studies;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturaTryCatch {
    public static void main(String[] args) {
        /*
        ESTRUTURA TRY CATCH

        O catch captura a exceção e permite que o programa continue executando
        mesmo que ela tenha sido identificada, mas como ela é capturada, se torna
        possível manter a execução, já que ela parou de ser propagada na pilha
        de chamada de métodos em execução.

        Bloco Try
          . Contém código que representa a execução normal do trecho de código
          que pode acarretar em uma exceção

        Bloco Catch
          . Contém o código a ser executado caso uma exceção ocorra, isto é,
          contém o trecho de código responsável pelo tratamento da exceção.
          . Deve ser especificado o tipo de exceção a ser tratada (UpCasting
          é permitido).

        Sintaxe:

        try {

        }

        catch (ExceptionType e) {

        }

        catch (ExceptionType e) {
            
        }

        catch (ExceptionType e) {
            
        }

        catch (ExceptionType e) {
            
        }
        */

        Scanner sc = new Scanner(System.in);

        // Veja que se fornecemos no lugar de um inteiro uma letra ou,
        // ainda, se fornecemos um index que não existe no vetor teremos
        // casos de exceções e o programa quebra, mas em aplicações comer
        // ciais n queremos que o programa pare, queremos que uma mensagem
        // seja informada, por exemplo.
        // VEja que poderíamos muito bom tratar com vários if's, mas
        // a solução não seria elegante nesse tratamento.

        try {         
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Invalid Position!");
        }
        catch (InputMismatchException e) {
            System.out.println("Input Error!");
        }

        System.out.println("End of program.");



        sc.close();
    }
}
