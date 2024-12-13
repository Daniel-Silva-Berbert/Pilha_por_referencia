public class Jogador {
    private int tamanho = 0;
    private int ponto = 0;
    private Carta carta;

    public boolean isEmpty(){
        return this.tamanho == 0;
    }

    public void push(Carta c){
        if(!isEmpty()){
            c.proximo = this.carta;
        }
        this.ponto += c.getPonto();
        this.carta = c;
        ++this.tamanho;
    }

    public Carta pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Lista vazia");
        }
        Carta c = this.carta;
        if( this.carta.proximo != null)
            this.carta = this.carta.proximo;
        if(this.ponto > 21){
            this.ponto -= 5;
        }
        this.ponto -= c.getPonto();
        --this.tamanho;
        return c;
    }

    public int getPonto(){
        return this.ponto;
    }
}
