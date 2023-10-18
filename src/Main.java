
public class Main {
    public static void main(String[] args) {

       
        Geometrica calculo = new Geometrica();

        Disciplina d = new Disciplina(calculo);

        d.setNome("Padroes de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.CalcularMedia();

        System.out.println(
                String.format("P1: %.2f \nP2: %.2f \nMedia: %.2f \nSituação: %s",
                        d.getP1(), d.getP2(), d.getMedia(), d.getSituacao())
        );
    }
}