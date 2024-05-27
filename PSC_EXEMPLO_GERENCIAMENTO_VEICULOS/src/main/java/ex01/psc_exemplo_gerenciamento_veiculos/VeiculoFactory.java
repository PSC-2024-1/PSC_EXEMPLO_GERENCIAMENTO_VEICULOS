/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.psc_exemplo_gerenciamento_veiculos;

/**
 *
 * @author rafaelamoreira
 */
public class VeiculoFactory {
    
    public static Carro criarCarro(String marca, String modelo, int ano, double precoPorDia, int numPortas) {
        return new Carro(marca, modelo, ano, precoPorDia, numPortas);
    }

    public static Moto criarMoto(String marca, String modelo, int ano, double precoPorDia, int cilindradas) {
        return new Moto(marca, modelo, ano, precoPorDia, cilindradas);
    }

    public static Caminhao criarCaminhao(String marca, String modelo, int ano, double precoPorDia, double capacidadeCarga) {
        return new Caminhao(marca, modelo, ano, precoPorDia, capacidadeCarga);
    }
}
