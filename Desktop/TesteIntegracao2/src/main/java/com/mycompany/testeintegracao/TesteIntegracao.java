package com.mycompany.testeintegracao;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

// DAYS.between() é um método do java.time.temporal.ChronoUnit -> Calcula diferença entre datas
// Classe para calcular os dias trabalhados
class Calculadora {
    public static long calcularDiasTrabalhados(LocalDate dataAdmissao, LocalDate dataDemissao) {
        return ChronoUnit.DAYS.between(dataAdmissao, dataDemissao);
    }
}

// Classe para calcular o valor total a receber
class ValorTotalAReceber {
    public static double calcularValorTotal(long diasTrabalhados) {
        double valorPorDia = 8 * 12.50;
        return valorPorDia * diasTrabalhados;
    }
}

// Classe principal do programa
public class TesteIntegracao {
    public static void main(String[] args) {
        
        //Declarando as variáveis do tipo LocalDate como nulas
        LocalDate dataAdmissao = null;
        LocalDate dataDemissao = null;

        // Loop para obter datas válidas
        while (!datasSaoValidas(dataAdmissao, dataDemissao)) {
            try {
                // Solicitar entrada de data de admissão
                String admissaoInput = JOptionPane.showInputDialog("Digite a data de admissão (AAAA-MM-DD):");
                dataAdmissao = LocalDate.parse(admissaoInput);

                // Solicitar entrada de data de demissão
                String demissaoInput = JOptionPane.showInputDialog("Digite a data de demissão (AAAA-MM-DD):");
                dataDemissao = LocalDate.parse(demissaoInput);


                // Verificar validade das datas
                if (!datasSaoValidas(dataAdmissao, dataDemissao)) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira datas válidas dentro do calendário gregoriano e com intervalo de até 100 anos.");
                } else if (dataAdmissao.isAfter(dataDemissao)) {
                    JOptionPane.showMessageDialog(null, "Data de admissão não pode ser posterior à data de demissão.");
                }
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de data inválido. Digite novamente."); //Não serão aceitos carateres fora do formato AAAA-MM-DD
            }
        }


        // Calcular dias trabalhados e valor total
        long diasTrabalhados = Calculadora.calcularDiasTrabalhados(dataAdmissao, dataDemissao);
        double valorTotal = ValorTotalAReceber.calcularValorTotal(diasTrabalhados); //Recebendo dados da primeira classe e realizando calculos da segunda classe

        // Exibir resultados
        JOptionPane.showMessageDialog(null, "Dias trabalhados: " + diasTrabalhados + "\nValor total a receber: R$ " + valorTotal);
    }

    // Verificar se as datas são válidas
    private static boolean datasSaoValidas(LocalDate dataAdmissao, LocalDate dataDemissao) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataLimite = dataAtual.plusYears(100); // Limite de 100 anos a partir da data atual

        //Verifica se as variáveis são nulas, caso o usuário envie um valor vazio, um erro é exibido.
        if (dataAdmissao == null || dataDemissao == null) {
            return false;
        }

        // Verificar se as datas estão dentro do calendário gregoriano (após o ano 1582) e se o intervalo é de até 100 anos
        return !dataAdmissao.isBefore(LocalDate.of(1582, 10, 15)) && !dataDemissao.isBefore(LocalDate.of(1582, 10, 15)) && !dataDemissao.isAfter(dataLimite);
    }
}