import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pessoa {

    private String nome;
    private Integer codigo;
    private float salario;

    public Pessoa(String nome, Integer codigo, float salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao cadastro de funcionarios!");
        System.out.println("----------------------------------------");

        while (true) {
            try {
                System.out.println("1 - Para inserir os funcionarios:");
                System.out.println("2 - Para listar os funcionarios:");
                System.out.println("3 - Para remover um funcionario:");
                System.out.println("0 - Para sair!!");
                int escolha = scanner.nextInt();
                scanner.nextLine();

                if (escolha == 0) break;

                else if (escolha == 1) {
                    System.out.println("Informe o nome do funcionario:");
                    String nome = scanner.nextLine();

                    System.out.println("Informe o codigo do funcionario:");
                    int codigo = scanner.nextInt();

                    boolean codigoExiste = false;
                    for (Pessoa p : listaDePessoas) {
                        if (p.codigo.equals(codigo)) {
                            codigoExiste = true;
                            break;
                        }
                    }

                    if (codigoExiste) {
                        System.out.println("Código já existe. Tente novamente com outro código.");
                        scanner.nextLine();
                        continue;
                    }

                    System.out.println("Informe o salario do funcionario:");
                    float salario = scanner.nextFloat();
                    scanner.nextLine();

                    Pessoa pessoa = new Pessoa(nome, codigo, salario);
                    listaDePessoas.add(pessoa);
                } else if (escolha == 2) {
                    System.out.println("Listando Funcionários:");
                    for (Pessoa p : listaDePessoas) {
                        System.out.println(p);
                    }
                } else if (escolha == 3) {
                    System.out.println("Informe o código do funcionario para remover:");
                    int codigoParaRemover = scanner.nextInt();
                    scanner.nextLine();
                    Pessoa pessoaARemover = null;
                    for (Pessoa p : listaDePessoas) {
                        if (p.codigo.equals(codigoParaRemover)) {
                            pessoaARemover = p;
                            break;
                        }
                    }
                    if (pessoaARemover != null) {
                        listaDePessoas.remove(pessoaARemover);
                        System.out.println("Funcionário removido com sucesso.");
                    } else {
                        System.out.println("Código não encontrado.");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
