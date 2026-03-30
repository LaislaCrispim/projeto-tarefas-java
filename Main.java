import java.util.ArrayList;
import java.util.Scanner;

class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Concluir tarefa");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String desc = scanner.nextLine();
                    tarefas.add(new Tarefa(desc));
                    break;

                case 2:
    for (int i = 0; i < tarefas.size(); i++) {
        Tarefa t = tarefas.get(i);
        String status = t.concluida ? "[OK]" : "[ ]";
        System.out.println(i + " - " + status + " " + t.descricao);
    }
    break;

                   case 3:
    System.out.print("Digite o número da tarefa para remover: ");
    int indice = scanner.nextInt();

    if (indice >= 0 && indice < tarefas.size()) {
        tarefas.remove(indice);
        System.out.println("Tarefa removida com sucesso!");
    } else {
        System.out.println("Número inválido!");
    }
    break;
                    case 4:
    System.out.print("Digite o número da tarefa para concluir: ");
    int index = scanner.nextInt();

    if (index >= 0 && index < tarefas.size()) {
        tarefas.get(index).marcarComoConcluida();
        System.out.println("Tarefa concluída!");
    } else {
        System.out.println("Número inválido!");
    }
    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}