public class Disciplina {

    ICalcMedia calculo;
    double media;
    String nome;
    double p1;
    double p2;

    String situacao;

    public ICalcMedia getCalcMedia() {
        return calculo;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calculo = calcMedia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return calculo.Situacao(media);
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void CalcularMedia() {
        media = calculo.CalculaMedia(p1, p2);
    }

    public Disciplina(ICalcMedia calculo) {
        this.calculo = calculo;
    }
}