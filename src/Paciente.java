import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paciente {

    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double pressaoArterial;
    private double frequenciaCardiaca;
    private String dietaAlimentar;
    private List<String> atividadesFisicas = new ArrayList<>();

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    public void setPressaoArterial(double pressaoArterial){
        this.pressaoArterial = pressaoArterial;
    }
    public double getPressaoArterial(){
        return pressaoArterial;
    }

    public void setFrequenciaCardiaca(double frequenciaCardiaca){
        this.frequenciaCardiaca = frequenciaCardiaca;
    }
    public double getFrequenciaCardiaca(){
        return frequenciaCardiaca;
    }

    public void setDietaAlimentar(String dietaAlimentar){
        this.dietaAlimentar = dietaAlimentar;
    }
    public String getDietaAlimentar(){
        return dietaAlimentar;
    }

    public void setAtividadesFisicas(String atividades){
        atividadesFisicas.add(atividades);
    }
    public List<String> getAtividadesFisicas(){
        return atividadesFisicas;
    }

    public double calcularIMC(){
        return peso/(altura*altura);
    }

    public String stringPaciente(){
        return "Nome: " + nome + "\n" +
               "Idade: " + idade + " anos\n" +
               "Peso: " + peso + " kg\n" +
               "Altura: " + altura + " m\n" +
               "IMC: " + calcularIMC() + "\n" +
               "Pressão arterial: " + pressaoArterial + "\n" +
               "Frequência cardíaca: " + frequenciaCardiaca + "\n" +
               "Dieta alimentar: " + dietaAlimentar + "\n" +
               "Atividades físicas: " + atividadesFisicas;
    }

    private static List<Paciente> pacientes = new ArrayList<>();

    public static void adcionarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    public static void removerPaciente(int id){
        if (id >= 0 && id < pacientes.size()){
            pacientes.remove(id);
        } else {
            System.out.println("Paciente não encontrado");
        }
    }

    public static Paciente buscarPaciente(int id){
        if (id >= 0 && id < pacientes.size()){
            return pacientes.get(id);
        } else {
            System.out.println("Paciente não encontrado");
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
            System.out.println("Paciente não encontrado");
        }
    }













}
