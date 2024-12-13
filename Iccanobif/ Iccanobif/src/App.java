import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        Iccanobif in = new Iccanobif();

        System.out.println("Digite um número inteiro positivo para ver a sequência de Iccanobif");
        try{
            op = entrada.nextInt();
        }catch(Exception ex){
            System.out.println("Renicie o programa e digite um número inteiro positivo");
        }
        if(op < 0){
            System.out.println("Renicie o programa e digite um número inteiro positivo");
        }else{
            for(int i = op ; i > 0; --i)
                in.push(i);

            while (!in.isEmpty()) {
                System.out.print(in.pop().getValor() +" - ");
            }
        }
        entrada.close();
    }
}
