package repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import entidades.Paciente;

public class repositorio {


    private static List<Paciente> pacientes = new ArrayList<>();

    public static void adcionarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    public static void removerPaciente(int id){
        if (id >= 0 && id < pacientes.size()){
            pacientes.remove(id);
        } else {
            System.out.println("entidades.Paciente não encontrado");
        }
    }

    public static Paciente buscarPaciente(int id){
        if (id >= 0 && id < pacientes.size()){
            return pacientes.get(id);
        } else {
            System.out.println("entidades.Paciente não encontrado");
            return null;
        }
    }

    public static List<Paciente> listar() {
        return Collections.unmodifiableList(pacientes);
    }

    public static void alterar (int id, Paciente paciente){
        if (id >= 0 && id < pacientes.size()){
            pacientes.set(id, paciente);
        } else {
            System.out.println("entidades.Paciente não encontrado");
        }
    }
}
