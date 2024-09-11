public class Main {
    public static void main(String[] args) {
        Mago merlin;

        merlin = new Mago("Merlin", "fogo");

        
        System.out.println("Nome: " + merlin.getNome());
        System.out.println("Tipo de magia: " + merlin.getTipoDeMagia());
        System.out.println("Pontos de vida: " + merlin.getPontosDeVida());
        System.out.println("Pontos de mana: " + merlin.getPontosDeMana());
        
        //merlin.setPontosDeVida(0);
        merlin.lancarMagia();
        merlin.lancarMagia();
        merlin.lancarMagiaEspecial();
        merlin.lancarMagiaEspecial();
    }
}