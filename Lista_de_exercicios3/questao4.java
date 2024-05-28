package Lista_de_exercicios3;

import java.util.ArrayList;
import java.util.Scanner;

public class questao4 {

    static ArrayList<String> nomes = new ArrayList<String>();

    public static int create(String nome){

        int aluno_existe = read(nome);

        if (aluno_existe != -2){
            return -3;
        }

        nomes.add(nome);        

        return -1;
    }

    public static int read(String nome){

        for(int indice = 0; indice < nomes.size(); indice++){
            String nome_busca = nomes.get(indice);
            if (nome_busca.equals(nome)){
                return indice;
            }
        }

        return -2;
    }

    public static int update (String nome){

        int indice_aluno = read(nome);

        if (indice_aluno == -2){
            return -2;
        }

        nomes.set(indice_aluno, nome);

        return -1;
    }

    public static int delete (String nome){

        int indice_aluno = read(nome);

        if (indice_aluno == -2){
            return -2;
        }

        nomes.remove(indice_aluno);
  

        return -1;

    }
    public static void main(String[] args) {
        String nome = "";
        int opcao;
        int resultado;
        int indice;
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("Escolha o que quer fazer:");
            System.out.println("1 - Criar Aluno");
            System.out.println("2 - Buscar Aluno");
            System.out.println("3 - Atualizar Aluno");
            System.out.println("4 - Remover Aluno");
            System.out.println("5 - Listar Tudo");
            System.out.println("9 - Sair");

            opcao = scan.nextInt();

            if (opcao == 1){
                System.out.println("Create");

                System.out.println("Digite o nome do aluno");
                nome = scan.next();

                resultado = create(nome);

                System.out.println(resultado);
                
                if (resultado == -3){
                    System.out.println("Já existe um usuário com esse nome");
                }else if (resultado == -1){

                    System.out.println("Aluno cadastrado com sucesso");
                } else {
                    System.out.println("Aconteceu algo de errado");
                }

            
                
            }else if (opcao == 2){

                System.out.println("Read");

                System.out.println("Digite o nome do aluno");
                nome = scan.next();

                indice = read(nome);

                System.out.println(indice);
                
                if (indice != -2){
                   
                    System.out.println(nomes.get(indice));
                }else {
                    
                    System.out.println("Aluno não encontrado");
                }
                

            
            }else if (opcao == 3){

                System.out.println("Para atualizar o nome é nescessário remover o nome de adicionar o novo nome");
            
            }else if (opcao == 4){

                System.out.println("Delete");

                System.out.println("Digite o nome do aluno");
                nome = scan.next();

                resultado = delete(nome);

               if (resultado == -1){
                System.out.println("Aluno removido com sucesso");
               } else if (resultado == -2){
                System.out.println("Aluno não encontrado");
               } else {
                System.out.println("Deu algo de errado");
               }

            
            }else if(opcao == 5){
            
                System.out.println(nomes);
                
            }else if(opcao == 9){
                System.out.println("Fechando...");
                break;
            }else {
                System.out.println("Não é uma opção");
            }

            
        }
    }
}            