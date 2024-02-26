package repository;

import model.Veiculo;
import model.TipoMotorizacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VeiculoRepository {
    private List<Veiculo> veiculos;

    public VeiculoRepository() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public List<Veiculo> listarTopAutonomia(int n) {
        List<Veiculo> copiaVeiculos = new ArrayList<>(veiculos);
        Collections.sort(copiaVeiculos, Comparator.comparingDouble(Veiculo::getAutonomia).reversed());
        return copiaVeiculos.subList(0, Math.min(n, copiaVeiculos.size()));
    }

    public List<Veiculo> listarBottomAutonomia(int n) {
        List<Veiculo> copiaVeiculos = new ArrayList<>(veiculos);
        Collections.sort(copiaVeiculos, Comparator.comparingDouble(Veiculo::getAutonomia));
        return copiaVeiculos.subList(0, Math.min(n, copiaVeiculos.size()));
    }

    public List<Veiculo> listarVeiculosPorMotorizacao(TipoMotorizacao motorizacao) {
        List<Veiculo> veiculosPorMotorizacao = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMotorizacao() == motorizacao) {
                veiculosPorMotorizacao.add(veiculo);
            }
        }
        return veiculosPorMotorizacao;
    }

    public void abastecerFrota(TipoMotorizacao motorizacao, double quantidade) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMotorizacao() == motorizacao) {
                veiculo.abastecer(quantidade);
            }
        }
    }

}