/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.psc_exemplo_gerenciamento_veiculos;

/**
 *
 * @author rafaelamoreira
 */
public class Principal {

    public static void main(String[] args) {
        
        Carro carro = VeiculoFactory.criarCarro("Toyota", "Corolla", 2022, 150.0, 4);
        Moto moto = VeiculoFactory.criarMoto("Hinda", "CG-160 Titan", 2021, 100.0, 162);
        Caminhao caminhao = VeiculoFactory.criarCaminhao("Volvo", "FH", 2020, 300.0, 20.0);

        // Adicionando serviços de luxo ao carro
        carro.adicionarServicoLuxo("Wi-Fi");
        carro.adicionarServicoLuxo("Ar Condicionado");

        // Calculando aluguel para diferentes períodos
        System.out.println("Aluguel Carro (3 dias): " + carro.calcularAluguel(3));
        System.out.println("Aluguel Moto (5 dias): " + moto.calcularAluguel(5));
        System.out.println("Aluguel Caminhão (2 dias): " + caminhao.calcularAluguel(2));

        // Exibindo detalhes dos veículos
        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();
    }
}
