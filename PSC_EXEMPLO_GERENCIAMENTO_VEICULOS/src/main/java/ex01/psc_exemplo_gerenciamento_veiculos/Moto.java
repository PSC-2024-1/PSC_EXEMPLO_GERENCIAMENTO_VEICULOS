/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.psc_exemplo_gerenciamento_veiculos;

/**
 *
 * @author rafaelamoreira
 */
public class Moto extends Veiculo{

    private final int cilindradas;

    public Moto(String marca, String modelo, int ano, double precoPorDia, int cilindradas) {
        super(marca, modelo, ano, precoPorDia);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularAluguel(int dias) {
        return precoPorDia * dias * 0.9; // 10% de desconto
    }

    @Override
    public void exibirDetalhes() {
           System.out.println("""
                              Moto: 
                              - Marca: """ + marca + "\n- Modelo: " + modelo + "\n- Ano: " + ano + "\n- Cilindradas: " + cilindradas);
 }
    
}
