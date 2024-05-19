import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            System.out.println("WELCOME TO THE HEALTH SYSTEM");
            System.out.println("1 - Cadastrar paciente.");
            System.out.println("2 - Listar pacientes.");
            System.out.println("3 - Editar paciente.");
            System.out.println("4 - Informações do paciente.");
            System.out.println("5 - Registrar atividade física para paciente.");
            System.out.println("6 - Remover paciente.");
            System.out.println("7 - Sair.");
            System.out.println("Por favor, selecione a opção desejada:");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarPaciente();
                    break;
                case 2:
                    listarPacientes();
                    break;
                case 3:
                    editarPaciente();
                    break;
                case 4:
                    informacoesPaciente();
                    break;
                case 5:
                    registrarAtividadeFisica();
                    break;
                case 6:
                    removerPaciente();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
            }
            if (opcao == 7) {
                break;
            }
        }


    }

    private static void registrarAtividadeFisica() {
        System.out.println("Digite o ID do paciente que deseja registrar atividade física: ");
        int id = input.nextInt();
        Paciente paciente = Paciente.buscarPaciente(id);
        if (paciente != null) {
            System.out.println("Digite a atividade física que deseja registrar: ");
            String atividade = input.next();
            paciente.setAtividadesFisicas(atividade);
            System.out.println("Atividade física registrada com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }

    }

    private static void informacoesPaciente() {
        System.out.println("Digite o ID do paciente que deseja ver as informações: ");
        int id = input.nextInt();
        Paciente paciente = Paciente.buscarPaciente(id);
        if (paciente != null) {
            System.out.println(paciente.stringPaciente());
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void editarPaciente() {
        System.out.println("Digite o ID do paciente que deseja editar: ");
        int id = input.nextInt();
        Paciente paciente = Paciente.buscarPaciente(id);
        if (paciente != null) {
            System.out.println("Digite o novo nome: ");
            paciente.setNome(input.next());
            System.out.println("Digite a nova idade: ");
            paciente.setIdade(input.nextInt());
            System.out.println("Digite o novo peso: ");
            paciente.setPeso(input.nextDouble());
            System.out.println("Digite a nova altura: ");
            paciente.setAltura(input.nextDouble());
            System.out.println("Digite a nova pressão arterial: ");
            paciente.setPressaoArterial(input.nextDouble());
            System.out.println("Digite a nova frequência cardíaca: ");
            paciente.setFrequenciaCardiaca(input.nextDouble());
            System.out.println("Digite a nova dieta alimentar: ");
            paciente.setDietaAlimentar(input.next());
            Paciente.alterar(id, paciente);
            System.out.println("Paciente editado com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void listarPacientes() {
        System.out.println("**Lista de Pacientes**");
        List<Paciente> pacientes = Paciente.listar();

        if (!pacientes.isEmpty()) {
            for (int i = 0; i < pacientes.size(); i++) {
                Paciente paciente = pacientes.get(i);
                System.out.println("ID: " + i + " - " + paciente.getNome());
            }
        } else {
            System.out.println("Nenhum paciente cadastrado.");
        }
    }

    private static void cadastrarPaciente() {
        System.out.println("**Cadastro de Novo Paciente**");
        Paciente paciente = new Paciente();
        System.out.println("Nome: ");
        paciente.setNome(input.next());
        System.out.println("Idade: ");
        paciente.setIdade(input.nextInt());
        System.out.println("Peso (kg): ");
        paciente.setPeso(input.nextDouble());
        System.out.println("Altura (m): ");
        paciente.setAltura(input.nextDouble());
        System.out.println("Pressão arterial (mmHg): ");
        paciente.setPressaoArterial(input.nextDouble());
        System.out.println("Frequência cardíaca (bpm): ");
        paciente.setFrequenciaCardiaca(input.nextDouble());
        System.out.println("Dieta alimentar: ");
        paciente.setDietaAlimentar(input.next());
        Paciente.adcionarPaciente(paciente);
        System.out.println("Paciente " + paciente + "cadastrado com sucesso!");
    }

    private static void removerPaciente() {
        System.out.println("Digite o id do paciente que deseja remover:");
        int idRemover = input.nextInt();
        Paciente.removerPaciente(idRemover);
        System.out.println("Paciente removido com sucesso!");
    }
}
