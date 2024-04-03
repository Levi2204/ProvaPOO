import java.util.Scanner;

public class MainGato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do seu gato: ");
        String nome = sc.nextLine();
        System.out.print("Digite o peso do seu gato: ");
        double peso = sc.nextDouble();
        System.out.print("Digite a idade do seu gato: ");
        int idade = sc.nextInt();
        sc.nextLine();
        ClasseGato met = new ClasseGato(idade, nome, peso);
        System.out.print("Deseja alterar algum dado? (1-sim/2-não)");
        int escolha = sc.nextInt();
        sc.nextLine();
        if(escolha == 1){
            System.out.print("Digite o nome do seu gato: ");
            nome = sc.nextLine();
            met.setNome(nome);
            System.out.print("Digite o peso do seu gato: ");
            peso = sc.nextDouble();
            met.setPeso(peso);
            System.out.print("Digite a idade do seu gato: ");
            idade = sc.nextInt();
            met.setIdade(idade);
        }

        System.out.println(met.toString());

        met.calcularPeso(peso);

        met.comer();





        sc.close();
    }


}
