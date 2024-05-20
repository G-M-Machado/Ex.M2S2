package entidades;

import java.util.ArrayList;
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


    public void setPeso(double peso){
        this.peso = peso;
    }


    public void setAltura(double altura){
        this.altura = altura;
    }


    public void setPressaoArterial(double pressaoArterial){
        this.pressaoArterial = pressaoArterial;
    }


    public void setFrequenciaCardiaca(double frequenciaCardiaca){
        this.frequenciaCardiaca = frequenciaCardiaca;
    }


    public void setDietaAlimentar(String dietaAlimentar){
        this.dietaAlimentar = dietaAlimentar;
    }


    public void setAtividadesFisicas(String atividades){
        atividadesFisicas.add(atividades);
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
}
