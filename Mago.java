/*
 * Crie uma classe Mago em Java que modele um personagem de um jogo de RPG. A classe deve possuir os seguintes atributos:

nome (String): O nome do mago.
tipoDeMagia (String): O tipo de magia que o mago utiliza (ex: fogo, gelo, etc.).
pontosDeVida (int): Os pontos de vida do mago.
pontosDeMana (int): Os pontos de mana do mago.
Além dos métodos getters e setters para todos os atributos, a classe deve conter os seguintes métodos:

lancarMagia: Este método deve gastar uma quantidade específica de pontos de mana e exibir uma mensagem indicando que a magia foi lançada. Se o mago não tiver mana suficiente, uma mensagem indicando isso deve ser exibida.

lancarMagiaEspecial: Este método deve gastar uma quantidade maior de pontos de mana do que o método anterior e exibir uma mensagem indicando que uma magia especial foi lançada. Caso o mago não tenha mana suficiente, uma mensagem apropriada deve ser exibida.

curar: Este método deve receber a quantidade de pontos de vida a serem recuperados como parâmetro e aumentar os pontos de vida do mago em acordo com esse valor. A quantidade de pontos de vida não pode ultrapassar um valor máximo (defina um valor máximo para pontos de vida).

recuperarMana: Este método deve receber a quantidade de pontos de mana a serem recuperados como parâmetro e aumentar os pontos de mana do mago em acordo com esse valor. A quantidade de pontos de mana não pode ultrapassar um valor máximo (defina um valor máximo para pontos de mana).
 * */
public class Mago {
    private String nome;
    private String tipoDeMagia;
    private int pontosDeMana;
    private int pontosDeVida;
    
    public Mago(String nome, String tipoDeMagia){
        this.setNome(nome);
        this.setTipoDeMagia(tipoDeMagia);
        this.setPontosDeVida(100);
        this.setPontosDeMana(100);
    }

    public void setPontosDeMana(int mana){
        this.pontosDeMana = mana;
    }

    public int getPontosDeMana(){
        return pontosDeMana;
    }

    public void setPontosDeVida(int vida){
        this.pontosDeVida = vida;
    }

    public int getPontosDeVida(){
        return pontosDeVida;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipoDeMagia(String magia){
        tipoDeMagia = magia;
    }

    public String getTipoDeMagia(){
        return this.tipoDeMagia;
    }

    public boolean estaVivo(){
        if(this.getPontosDeVida() > 0) 
            return true;
        else
            return false;
    }

    public void imprimirVivoMorto(){
        if(this.estaVivo())
            System.out.println(nome + " está vivo!");
        else
            System.out.println(nome + " está morto!");
    }
    public void lancarMagia(){
        if(this.estaVivo()){
            if(this.getPontosDeMana() >= 25){
                this.pontosDeMana-=25;
                System.out.println("Magia simples de " + this.getTipoDeMagia() + " foi lançada!");
            }
            else{
                System.out.println("Não tenho mana para lançar a magia!");
            }
        }
        else{
            System.out.println(nome + " está morto e não pode lançar magias!");
        }
    }

    public void lancarMagiaEspecial(){
        if(this.estaVivo()){
            if(this.getPontosDeMana() >= 50){
                this.pontosDeMana-=50;
                System.out.println("Magia especial de " + this.getTipoDeMagia() + " foi lançada!");
            }
            else{
                System.out.println("Não tenho mana para lançar a magia especial!");
            }
        }
        else{
            System.out.println(nome + " está morto e não pode lançar magias!");
        }
    }
}
