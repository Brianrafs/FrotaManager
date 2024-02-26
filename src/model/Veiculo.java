package model;

public class Veiculo {
    private String marca;
    private String modelo;
    private double autonomia;
    private TipoMotorizacao motorizacao;
    private double capacidadeTanque;
    private double combustivelDisponivel;

    public Veiculo(String marca, String modelo, double autonomia, TipoMotorizacao motorizacao,
                   double capacidadeTanque, double combustivelDisponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.autonomia = autonomia;
        this.motorizacao = motorizacao;
        this.capacidadeTanque = capacidadeTanque;
        this.combustivelDisponivel = combustivelDisponivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public TipoMotorizacao getMotorizacao() {
        return motorizacao;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double getCombustivelDisponivel() {
        return combustivelDisponivel;
    }

    public void abastecer(double quantidade) {
        combustivelDisponivel = Math.min(combustivelDisponivel + quantidade, capacidadeTanque);
    }

    public boolean autonomiaAbaixoPorcentagem(double porcentagem) {
        return (combustivelDisponivel / capacidadeTanque) * 100 < porcentagem;
    }
}

