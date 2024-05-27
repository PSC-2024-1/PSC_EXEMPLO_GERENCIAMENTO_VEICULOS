/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.psc_exemplo_gerenciamento_veiculos;

/**
 *
 * @author rafaelamoreira
 */
public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double precoPorDia;

    public Veiculo(String marca, String modelo, int ano, double precoPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoPorDia = precoPorDia;
    }

    public abstract double calcularAluguel(int dias);
    public abstract void exibirDetalhes();
}
