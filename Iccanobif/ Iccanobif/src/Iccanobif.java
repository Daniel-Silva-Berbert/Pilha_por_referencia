public class Iccanobif {
    private int tamanho = 0;
    private No valor = new No(1, null);

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public void push(int q){
        No no = new No();
        if(tamanho != 0){
            no.setProximo(this.valor);
            int v = (tamanho == 1) ? 0: this.valor.getProximo().getValor();
            no.setValor(this.valor.getValor() + v);
        }else{
            no.setValor(1);
        }
        this.valor = no;
        ++tamanho;
    }

    public No pop() throws Exception{
        if(tamanho == 0){
            throw new Exception("Pilha vazia");
        }
        No no = this.valor;
        this.valor = this.valor.getProximo();
        --tamanho;
        return no;
    }
}
