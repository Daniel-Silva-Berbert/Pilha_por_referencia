import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Carta c  = new Carta();

        String op = "-1";

        System.out.println("Bem vindo ao 21 doido kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        System.out.println("Vez do Jogador 1");
        jogador1.push(c);
        System.out.println("Jogador 1 o valor da carta foi " + c.getPonto());
        c  = new Carta();
        jogador1.push(c);
        
        while(!op.equals("2")){
            
            System.out.println("Jogador 1 o valor da carta foi " + c.getPonto());
            System.out.println("Você tem " + jogador1.getPonto() + " pontos.");
            if(jogador1.getPonto() > 21){
                jogador1.pop();
                break;
            }
            System.out.println("Deseja continua? (1 - Sim, 2 - Não)");
            op = entrada.next();
            
            while(!op.equals("1") && !op.equals("2")){
                System.out.println("É 1 ou 2, onde 1 e continuar e 2 e parar");
                op = entrada.next();
            }
            if(op.equals("1")){
                c = new Carta();
                jogador1.push(c);
            }
        }
        op = "-1";
        System.out.println("Vez do Jogador 2");
        c  = new Carta();
        jogador2.push(c);
        System.out.println("Jogador 2 o valor da carta foi " + c.getPonto());
        c  = new Carta();
        jogador2.push(c);
        
        while(!op.equals("2")){
            System.out.println("Jogador 2 o valor da carta foi " + c.getPonto());
            System.out.println("Você tem " + jogador2.getPonto() + " pontos.");
            if(jogador2.getPonto() > 21){
                jogador2.pop();
                break;
            }
            System.out.println("Deseja continua? (1 - Sim, 2 - Não)");
            op = entrada.next();
            while(!op.equals("1") && !op.equals("2")){
                System.out.println("É 1 ou 2, onde 1 e continuar e 2 e parar");
                op = entrada.next();
            }
            if(op.equals("1")){
                c = new Carta();
                jogador2.push(c);
            }
        }
        if(jogador1.getPonto() > jogador2.getPonto()){
            System.out.println("Parabéns jogador 1 você ganhou com " + jogador1.getPonto() + " pontos");
            System.out.println("Suas Cartas são:");
            while(!jogador1.isEmpty()){
                System.out.println(jogador1.pop().getPonto());
            }
        }else{
            if(jogador2.getPonto() > jogador1.getPonto()){
                System.out.println("Parabéns jogador 2 você ganhou com " + jogador2.getPonto() + " pontos");
                System.out.println("Suas Cartas são:");
                while(!jogador2.isEmpty()){
                    System.out.println(jogador2.pop().getPonto());
                }
            }else{
                System.out.println("Deu empate!!!");
                System.out.println("Jogador 1 você ficou com " + jogador1.getPonto() + " pontos");
                System.out.println("Suas Cartas são:");
                while(!jogador1.isEmpty()){
                    System.out.println(jogador1.pop().getPonto());
                }
                System.out.println("Jogador 2 você ficou com " + jogador2.getPonto() + " pontos");
                System.out.println("Suas Cartas são:");
                while(!jogador1.isEmpty()){
                    System.out.println(jogador2.pop().getPonto());
                }
            }
        }
        entrada.close();
    }
    //5
}
