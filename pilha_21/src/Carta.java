public class Carta {
    private int ponto;
    public Carta proximo;

    public Carta(){
        this.ponto = (int)(Math.random()*10) +1;
        this.proximo = null;
    }

    public void setPonto(int ponto)
    {
        this.ponto = ponto;
    }

    public int getPonto(){
        return this.ponto;
    }

}
