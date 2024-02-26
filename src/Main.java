import  repository.VeiculoRepository;
import  model.*;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        VeiculoRepository frota = new VeiculoRepository();

        // Adicionar veículos à frota
        frota.adicionarVeiculo(new Veiculo("Volkswagen", "Gol", 600, TipoMotorizacao.FLEX, 50, 30));
        frota.adicionarVeiculo(new Veiculo("Fiat", "Uno", 500, TipoMotorizacao.FLEX, 45, 25));
        frota.adicionarVeiculo(new Veiculo("Chevrolet", "Onix", 650, TipoMotorizacao.FLEX, 48, 35));
        frota.adicionarVeiculo(new Veiculo("Ford", "Ka", 620, TipoMotorizacao.FLEX, 47, 30));
        frota.adicionarVeiculo(new Veiculo("Hyundai", "HB20", 620, TipoMotorizacao.FLEX, 48, 30));
        frota.adicionarVeiculo(new Veiculo("Renault", "Kwid", 550, TipoMotorizacao.FLEX, 40, 25));
        frota.adicionarVeiculo(new Veiculo("Toyota", "Corolla", 700, TipoMotorizacao.FLEX, 55, 40));
        frota.adicionarVeiculo(new Veiculo("Honda", "Civic", 680, TipoMotorizacao.FLEX, 53, 38));
        frota.adicionarVeiculo(new Veiculo("Jeep", "Renegade", 600, TipoMotorizacao.FLEX, 50, 30));
        frota.adicionarVeiculo(new Veiculo("Nissan", "Kicks", 650, TipoMotorizacao.FLEX, 52, 35));
        frota.adicionarVeiculo(new Veiculo("Chevrolet", "Prisma", 630, TipoMotorizacao.FLEX, 50, 32));
        frota.adicionarVeiculo(new Veiculo("Volkswagen", "Fox", 580, TipoMotorizacao.FLEX, 45, 28));
        frota.adicionarVeiculo(new Veiculo("Fiat", "Strada", 570, TipoMotorizacao.FLEX, 50, 30));
        frota.adicionarVeiculo(new Veiculo("Renault", "Sandero", 600, TipoMotorizacao.FLEX, 48, 30));
        frota.adicionarVeiculo(new Veiculo("Chevrolet", "S10", 700, TipoMotorizacao.DIESEL, 60, 45));
        frota.adicionarVeiculo(new Veiculo("Toyota", "Hilux", 720, TipoMotorizacao.DIESEL, 65, 50));
        frota.adicionarVeiculo(new Veiculo("Ford", "Ranger", 680, TipoMotorizacao.DIESEL, 60, 40));
        frota.adicionarVeiculo(new Veiculo("Mitsubishi", "L200", 700, TipoMotorizacao.DIESEL, 65, 45));
        frota.adicionarVeiculo(new Veiculo("Volkswagen", "Saveiro", 580, TipoMotorizacao.FLEX, 48, 30));
        frota.adicionarVeiculo(new Veiculo("Fiat", "Toro", 650, TipoMotorizacao.FLEX, 55, 35));
        frota.adicionarVeiculo(new Veiculo("Tesla", "Model S", 800, TipoMotorizacao.ELETRICO, 0, 0));
        frota.adicionarVeiculo(new Veiculo("Nissan", "Leaf", 400, TipoMotorizacao.ELETRICO, 0, 0));
        frota.adicionarVeiculo(new Veiculo("BMW", "i3", 350, TipoMotorizacao.ELETRICO, 0, 0));
        frota.adicionarVeiculo(new Veiculo("Ford", "Fiesta", 600, TipoMotorizacao.GASOLINA, 45, 25));
        frota.adicionarVeiculo(new Veiculo("Chevrolet", "Cruze", 650, TipoMotorizacao.GASOLINA, 50, 30));
        frota.adicionarVeiculo(new Veiculo("Volkswagen", "Virtus", 620, TipoMotorizacao.GASOLINA, 48, 28));
        frota.adicionarVeiculo(new Veiculo("Honda", "Fit", 580, TipoMotorizacao.GASOLINA, 45, 30));
        frota.adicionarVeiculo(new Veiculo("Toyota", "Yaris", 620, TipoMotorizacao.GASOLINA, 47, 32));
        frota.adicionarVeiculo(new Veiculo("Renault", "Logan", 600, TipoMotorizacao.GASOLINA, 48, 30));
        frota.adicionarVeiculo(new Veiculo("Fiat", "Mobi", 550, TipoMotorizacao.GASOLINA, 40, 25));
        frota.adicionarVeiculo(new Veiculo("Ford", "Focus", 680, TipoMotorizacao.GASOLINA, 53, 38));
        frota.adicionarVeiculo(new Veiculo("Volkswagen", "Polo", 620, TipoMotorizacao.GASOLINA, 50, 32));
        frota.adicionarVeiculo(new Veiculo("Chevrolet", "Spin", 650, TipoMotorizacao.GASOLINA, 55, 35));

        // Exemplos de uso do sistema
        System.out.println("Top 10 veículos com maior autonomia:\n");
        List<Veiculo> topAutonomia = frota.listarTopAutonomia(10);
        for (Veiculo veiculo : topAutonomia) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " - Autonomia: " + veiculo.getAutonomia());
        }

        System.out.println("\nVeículos à Diesel:");
        List<Veiculo> diesel = frota.listarVeiculosPorMotorizacao(TipoMotorizacao.DIESEL);
        for (Veiculo veiculo : diesel) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo());
        }

        System.out.println("\nVeículos à Gasolina:");
        List<Veiculo> gasolina = frota.listarVeiculosPorMotorizacao(TipoMotorizacao.GASOLINA);
        for (Veiculo veiculo : gasolina) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo());
        }

        System.out.println("\nVeículos FLEX:");
        List<Veiculo> flex = frota.listarVeiculosPorMotorizacao(TipoMotorizacao.FLEX);
        for (Veiculo veiculo : flex) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo());
        }

        System.out.println("\nVeículos Elétricos:");
        List<Veiculo> eletrico = frota.listarVeiculosPorMotorizacao(TipoMotorizacao.ELETRICO);
        for (Veiculo veiculo : eletrico) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo());
        }

        System.out.println("\nEstado do combustivel da frota:\n");
        for (Veiculo veiculo : gasolina) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " " + veiculo.getCombustivelDisponivel());
        }
        System.out.println("\nAbastecendo a frota de gasolina com 20 litros\n");
        frota.abastecerFrota(TipoMotorizacao.GASOLINA, 20);
        System.out.println("\nEstado do combustivel da frota:\n");
        for (Veiculo veiculo : gasolina) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " " + veiculo.getCombustivelDisponivel());
        }

        System.out.println("\nTop 10 veiculos com menor autonomia:\n");
        List<Veiculo> autonomiaBaixa = frota.listarBottomAutonomia(10);
        for (Veiculo veiculo : autonomiaBaixa) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " - Autonomia: " + veiculo.getAutonomia());
        }
    }
}