import java.util.Scanner;

public class MainMedico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do médico: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CRM do médico: ");
        int crm = sc.nextInt();
        System.out.print("Digite quantas horas ele trabalhou esse mês: ");
        int hrs = sc.nextInt();

        ClasseMedico med1= new ClasseMedico(crm, nome);
        med1.calcularSalario(hrs);
        System.out.println("---------------------------");
        med1.verificarInformacoes();
        System.out.println("---------------------------");
        System.out.println("Deseja alterar algum dado? (1 - Sim 2- Não)");
        int escolha = sc.nextInt();
        sc.nextLine();
        if (escolha == 1){
            while(true){
                System.out.println("""
                    Qual dado você deseja alterar
                    1 - Nome
                    2 - CRM
                    3 - Horas trabalhadas
                    4 - Sair""");
                int escolhaU = sc.nextInt();
                sc.nextLine();
                if(escolhaU == 1){
                    System.out.print("Digite o nome do médico:");
                    nome = sc.nextLine();
                    med1.setNome(nome);
                    System.out.println("Deseja alterar mais algum dado? (1-Sim 2-Não)");
                    escolha = sc.nextInt();
                    if(escolha == 2){
                        break;
                    }else if(escolha == 1){
                        System.out.println("Certo");
                    }else{
                        break;
                    }
                }else if(escolhaU == 2){
                    System.out.print("Digite a CRM do médico: ");
                    crm = sc.nextInt();
                    med1.setCrm(crm);
                    System.out.println("Deseja alterar mais algum dado? (1-Sim 2-Não)");
                    escolha = sc.nextInt();
                    if(escolha == 2){
                        break;
                    }else if(escolha == 1){
                        System.out.println("Certo");
                    }else{
                        break;
                    }
                }else if(escolhaU == 3){
                    System.out.print("Digite quantas horas esse médico trabalhou: ");
                    hrs = sc.nextInt();
                    med1.calcularSalario(hrs);
                    System.out.println("Deseja alterar mais algum dado? (1-Sim 2-Não)");
                    escolha = sc.nextInt();
                    if(escolha == 2){
                        break;
                    }else if(escolha == 1){
                        System.out.println("Certo");
                    }else{
                        break;
                    }
                }else if(escolhaU == 4){
                    break;
                }else{
                    System.out.println("Opção inválida");
                }
            }
            System.out.println("---------------------------");
            System.out.println(med1.toString());
            System.out.println("---------------------------");
        }else{
            System.out.println("Certo");
        }
        System.out.println("---------------------------");
        System.out.println(med1.toString());
        System.out.println("---------------------------");


        sc.close();
    }
}
