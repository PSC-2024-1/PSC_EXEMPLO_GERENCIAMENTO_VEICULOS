/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.psc_exemplo_gerenciamento_veiculos;

/**
 *
 * @author rafaelamoreira
 */
public class Caminhao extends Veiculo {

    private final double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double precoPorDia, double capacidadeCarga) {
        super(marca, modelo, ano, precoPorDia);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAluguel(int dias) {
        return precoPorDia * dias * 1.5; // 50% de acréscimo
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("""
                           Caminhão: 
                           - Marca: """ + marca + "\n- Modelo: " + modelo + "\n- Ano: " + ano + "\n- Capacidade: " + capacidadeCarga + " toneladas");
    }
    
}
