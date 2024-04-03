public class ClasseMedico {
    private int crm;
    private  String nome;

    private double salario;

    ClasseMedico(int crm, String nome){
        this.crm = crm;
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public int getCrm() {
        return crm;
    }

    public void verificarInformacoes(){

        System.out.printf("Médico: %s%n" +
                "CRM: %d %n",nome, crm);
    }

    public double calcularSalario(int horas){
        this.salario = horas * 75;
        return salario;
    }

    @Override
    public String toString() {
        return "Médico{\n" +
                "Nome: " + getNome() + "\n" +
                "CRM: " + getCrm() + "\n" +
                "Salário: " + salario + "\n" +
                "}";
    }
}
