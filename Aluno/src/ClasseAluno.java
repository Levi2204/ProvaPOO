public class ClasseAluno {
    private int matricula;
    private  String nome;

    private double media;

    ClasseAluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void verificarMatricula(){

        System.out.printf("Aluno: %s%nMatricula: %d%n",nome, matricula);
    }

    public double calcularMedia(double notaUm, double notaDois){
        this.media = (notaUm + notaDois)/2;
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{\n" +
                "Nome: " + getNome() + "\n" +
                "Maticula: " + getMatricula() + "\n" +
                "Média: " + media + "\n" +
                "}";
    }
}
