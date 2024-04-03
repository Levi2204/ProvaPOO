public class ClasseGato {

    private int idade;
    private String nome;

    private double peso;

    ClasseGato(int idade, String nome, double peso) {
        this.idade = idade;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void comer(){
        System.out.printf("Seu gato(a) %s está comendo%n", getNome());

    }



    public void calcularPeso(double peso) {
        if (peso < 1.8){
            System.out.println("Seu gato(a) está muito magro");
        }else if (peso > 4){
            System.out.println("Seu gato(a) está acima do peso ideal");
        }else{
            System.out.println("Seu gato(a) está no peso ideal");
        }
    }

    @Override
    public String toString() {
        return "Gato(a){\n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Peso: " + getPeso() + "\n" +
                "}";
        }

}
