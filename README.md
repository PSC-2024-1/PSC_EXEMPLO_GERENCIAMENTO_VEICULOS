# PSC_EXEMPLO_GERENCIAMENTO_VEICULOS

Você foi contratado para desenvolver um sistema de gerenciamento de veículos para uma locadora de veículos. O sistema deve ser capaz de lidar com diferentes tipos de veículos, cada um com suas próprias características e comportamentos específicos.

**Requisitos:**

- Crie uma **classe abstrata Veiculo** com os seguintes:
 - **Atributos:**
   - marca (String)
   - modelo (String)
   - ano (int)
   - precoPorDia (double)
 - **Métodos abstratos:**
   - calcularAluguel(int dias): deve calcular o custo do aluguel com base no número de dias.
   - exibirDetalhes(): deve exibir os detalhes do veículo.

- Crie uma **interface Luxo** com o método:
  - adicionarServicoLuxo(String servico): deve adicionar um serviço de luxo ao veículo.

- Crie três **classes que herdam da classe Veiculo**:
  - **Carro:**
    - Atributos adicionais: numPortas (int)
    - Implementação dos métodos abstratos:
      - calcularAluguel(int dias): custo do aluguel é precoPorDia * dias.
      - exibirDetalhes(): exibe os detalhes do carro, incluindo numPortas.
      - Se o carro for de luxo, deve implementar a interface Luxo.
  - **Moto:**
    - Atributos adicionais: cilindradas (int)
    - Implementação dos métodos abstratos:
      - calcularAluguel(int dias): custo do aluguel é precoPorDia * dias * 0.9 (10% de desconto).
      - exibirDetalhes(): exibe os detalhes da moto, incluindo cilindradas.
  - **Caminhao:**
     - Atributos adicionais: capacidadeCarga (double)
     - Implementação dos métodos abstratos:
       - calcularAluguel(int dias): custo do aluguel é precoPorDia * dias * 1.5 (50% de acréscimo).
       - exibirDetalhes(): exibe os detalhes do caminhão, incluindo capacidadeCarga.

- Crie uma **classe estática VeiculoFactory** para instanciar os veículos:
  - Métodos estáticos para criar Carro, Moto e Caminhao.
    
- Crie uma **classe de teste** para instanciar alguns veículos, calcular o aluguel para diferentes períodos e exibir os detalhes dos veículos.
