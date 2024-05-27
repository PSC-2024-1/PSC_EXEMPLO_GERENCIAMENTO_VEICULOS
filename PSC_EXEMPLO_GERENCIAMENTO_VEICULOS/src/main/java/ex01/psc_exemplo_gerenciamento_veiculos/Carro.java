/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.psc_exemplo_gerenciamento_veiculos;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class Carro extends Veiculo implements Luxo{
    
    private final int numPortas;
    private final ArrayList<String> servicosLuxo = new ArrayList<>();

    public Carro(String marca, String modelo, int ano, double precoPorDia, int numPortas) {
        super(marca, modelo, ano, precoPorDia);
        this.numPortas = numPortas;
    }

    @Override
    public double calcularAluguel(int dias) {
        return precoPorDia * dias;
    }

    @Override
    public void exibirDetalhes() {
     System.out.println("""
                        Carro: 
                        - Marca: """ + marca + "\n- Modelo: " + modelo + "\n- Ano: " + ano + "\n- Portas: " + numPortas);

     if (!servicosLuxo.isEmpty()) {
            System.out.println("- Serviços de luxo: " + servicosLuxo);
        }
    }

    @Override
    public void adicionarServicoLuxo(String servico) {
      servicosLuxo.add(servico);
    }
    
}
