# Gerenciamento de Frota de Veículos

Este é um software desenvolvido em Java para gerenciar uma frota de veículos. O sistema consiste em duas classes principais: `Veiculo` e `VeiculoRepository`.

## Classe Veiculo

A classe `Veiculo` é responsável por modelar as características de um veículo, incluindo marca, modelo, autonomia, tipo de motorização, capacidade do tanque e quantidade de combustível disponível. Cada veículo é representado por uma instância desta classe.

### Atributos da Classe Veiculo

- `marca`: String representando a marca do veículo.
- `modelo`: String representando o modelo do veículo.
- `autonomia`: double representando a autonomia de rodagem do veículo em quilômetros.
- `motorizacao`: TipoMotorizacao representando o tipo de motorização do veículo (combustível: gasolina, flex, diesel ou elétrico).
- `capacidadeTanque`: double representando a capacidade do tanque de combustível do veículo em litros.
- `combustivelDisponivel`: double representando a quantidade de combustível disponível no tanque do veículo em litros.

### Métodos da Classe Veiculo

- `abastecer(double quantidade)`: Método para abastecer o tanque do veículo com a quantidade especificada de combustível.
- `autonomiaAbaixoPorcentagem(double porcentagem)`: Método para verificar se a autonomia do veículo está abaixo de uma certa porcentagem especificada.

## Classe VeiculoRepository

A classe `VeiculoRepository` é responsável por servir como um repositório de veículos e realizar operações relacionadas à frota, como adicionar veículos, listar veículos por diferentes critérios e abastecer a frota.

### Métodos da Classe Frota

- `adicionarVeiculo(Veiculo veiculo)`: Método para adicionar um veículo à frota.
- `listarTopAutonomia(int n)`: Método para listar os N veículos com maior autonomia de rodagem.
- `listarBottomAutonomia(int n)`: Método para listar os N veículos com menor autonomia de rodagem.
- `listarVeiculosPorMotorizacao(TipoMotorizacao motorizacao)`: Método para listar os veículos movidos por um determinado tipo de motorização (gasolina, diesel, flex ou elétrico).
- `abastecerFrota(TipoMotorizacao motorizacao, double quantidade)`: Método para abastecer a frota com um tipo específico de combustível e uma quantidade informada.
- `listarAutonomiaAbaixoPorcentagem(double porcentagem)`: Método para listar os veículos com autonomia inferior a uma certa porcentagem especificada.

## Observações

- A classe `Veiculo` realiza a validação de que o modelo informado pertence à marca selecionada.

## Uso do Sistema

O sistema pode ser utilizado para gerenciar uma frota de veículos, realizar operações como adicionar veículos, listar veículos com diferentes critérios, abastecer a frota e verificar a autonomia dos veículos.

Exemplo de código para utilização do sistema:

```java
public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        // Adicionar veículos à frota
        // (Código para adicionar os veículos aqui)

        // Exemplo de uso das funcionalidades do sistema
        // (Código para utilizar as funcionalidades aqui)
    }
}
```
