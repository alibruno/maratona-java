package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio1.dominio;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnaliseDeTransacao {
    private static final File fileTransacoesCSV = new File("arquivos_exercicios\\lista3\\desafio1", "transacoes.csv");
    private List<Transacao> listaTransacoes = new ArrayList<>();

    public void lerCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileTransacoesCSV))) {
            br.readLine();
            String linha;
            while ((linha = br.readLine()) != null) {
                try {
                    String[] tokens = linha.split(",");
                    LocalDate data = LocalDate.parse(tokens[0]);
                    String descricao = tokens[1];
                    BigDecimal valor = new BigDecimal(tokens[2]);
                    Categoria categoria = Categoria.categoriaPorString(tokens[3]);
                    listaTransacoes.add(new Transacao(data, descricao, valor, categoria));
                } catch (NumberFormatException | DateTimeParseException | CategoriaInvalidaException e) {
                    System.out.println("Erro ao processar linha: " + linha + ". Motivo: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Map<Categoria, BigDecimal> calcularTotalPorCategoria() {
        Map<Categoria, BigDecimal> map = new TreeMap<>();
        for (Transacao transacao : listaTransacoes) {
            Categoria categoriaTrsc = transacao.getCategoria();
            if (map.containsKey(categoriaTrsc)) {
                map.put(categoriaTrsc, map.get(categoriaTrsc).add(transacao.getValor()));
            } else {
                map.put(categoriaTrsc, transacao.getValor());
            }
        }
        return map;
    }

    public Map<String, Long> contarTransacoesPorDescricao() {
        Map<String, Long> map = new TreeMap<>();
        for (Transacao transacao : listaTransacoes) {
            String descricaoTrsc = transacao.getDescricao();
            if (map.containsKey(descricaoTrsc)) {
                map.put(descricaoTrsc, map.get(descricaoTrsc) + 1L);
            } else {
                map.put(descricaoTrsc, 1L);
            }
        }
        return map;
    }

    public List<Transacao> getListaTransacoes() {
        return listaTransacoes;
    }

    public void setListaTransacoes(List<Transacao> listaTransacoes) {
        this.listaTransacoes = listaTransacoes;
    }


}
