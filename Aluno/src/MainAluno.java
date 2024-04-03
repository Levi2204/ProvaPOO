import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int matricula;
        double notaUm, notaDois;

        System.out.print("Digite o nome do primeiro Aluno: ");
        nome = sc.nextLine();
        System.out.print("Digite o número da matrícula do primeiro Aluno: ");
        matricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        notaUm = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        notaDois = sc.nextDouble();

        ClasseAluno aluno1= new ClasseAluno(matricula, nome);
        aluno1.calcularMedia(notaUm, notaDois);
        System.out.println("---------------------------");
        System.out.println(aluno1.toString());
        System.out.println("---------------------------");
        System.out.println("Deseja alterar algum dado? (1 - Sim 2- Não)");
        int escolha = sc.nextInt();
        sc.nextLine();
        if (escolha == 1){
            while(true){
                System.out.println("""
                    Qual dado você deseja alterar
                    1 - Nome
                    2 - Matrícula
                    3 - Notas
                    4 - Sair""");
                int escolhaU = sc.nextInt();
                sc.nextLine();
                if(escolhaU == 1){
                    System.out.print("Digite o nome do aluno:");
                    nome = sc.nextLine();
                    aluno1.setNome(nome);
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
                    System.out.print("Digite a matrícula do aluno: ");
                    matricula = sc.nextInt();
                    aluno1.setMatricula(matricula);
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
                    System.out.print("Digite a primeira nota: ");
                    notaUm = sc.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    notaDois = sc.nextDouble();
                    aluno1.calcularMedia(notaUm, notaDois);
                    System.out.println("Deseja alterar mais algum dado? (1-Sim 2-Não)");
                    escolha = sc.nextInt();
                    sc.nextLine();
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
            System.out.println(aluno1.toString());
            System.out.println("---------------------------");
        }else{
            System.out.println("Certo");
        }

        System.out.print("Digite o nome do segundo Aluno: ");
        nome = sc.nextLine();
        System.out.print("Digite o número da matrícula do segundo Aluno: ");
        matricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        notaUm = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        notaDois = sc.nextDouble();

        ClasseAluno aluno2= new ClasseAluno(matricula, nome);
        aluno2.calcularMedia(notaUm, notaDois);
        System.out.println("---------------------------");
        System.out.println(aluno2.toString());
        System.out.println("---------------------------");
        System.out.println("Deseja alterar algum dado? (1 - Sim 2- Não)");
        escolha = sc.nextInt();
        sc.nextLine();
        if (escolha == 1){
            while(true){
                System.out.println("""
                    Qual dado você deseja alterar
                    1 - Nome
                    2 - Matrícula
                    3 - Notas
                    4 - Sair""");
                int escolhaU = sc.nextInt();
                sc.nextLine();
                if(escolhaU == 1){
                    System.out.print("Digite o nome do aluno:");
                    nome = sc.nextLine();
                    aluno2.setNome(nome);
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
                    System.out.print("Digite a matrícula do aluno: ");
                    matricula = sc.nextInt();
                    aluno2.setMatricula(matricula);
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
                    System.out.print("Digite a primeira nota: ");
                    notaUm = sc.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    notaDois = sc.nextDouble();
                    aluno2.calcularMedia(notaUm, notaDois);
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
            System.out.println(aluno2.toString());
            System.out.println("---------------------------");
        }else{
            System.out.println("Certo");
        }


        System.out.println("Alunos");
        System.out.println("---------------------------");
        System.out.println(aluno1.toString());
        System.out.println("---------------------------");


        System.out.println(aluno2.toString());
        System.out.println("---------------------------");







        sc.close();
    }
}
