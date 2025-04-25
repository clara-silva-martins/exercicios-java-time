import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Retorna da data de hoje
        LocalDate dataCompra = LocalDate.now();

        LocalDate dataPrimeiraParcela = LocalDate.of(2025,5,15);

        //Adicionar dias utilizar plus

        LocalDate dataSegundaParcela = LocalDate.now().plusDays(30);

        System.out.println("Data de compra: " + dataCompra);
        System.out.println("Data de primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data de segunda parcela: " + dataSegundaParcela);

        if(dataPrimeiraParcela.isBefore(LocalDate.now())){
            System.out.println("Anterior dia do vencimento");
        } else {
            System.out.println("Superior ao dia do vencimento");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: " + dataCompra.format(formatter));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusão da compra: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusão da compra em New York: " + dataCompraNy);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duration = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duration.toHours() + " horas e " + duration.toMinutes() + " minutos");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());

        //EXERCICICIO DATA E HORA ATUAL


        String tarefa;
        String opcao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja começar a tarefa agora? (S/N)");
        tarefa = scanner.nextLine();

        if(tarefa.equals("S")) {
            System.out.println("""
                     Digite a opção desejada:
                     1 - Enviar relatório semanal
                     2 - Sair             \s
                    \s"""
            );
            opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Enviar relatório semanal");
                LocalDate dataInicioTarefa = LocalDate.now();
                System.out.println("Data atual: " + dataInicioTarefa);
                LocalTime horaInicioTarefa = LocalTime.now();
                System.out.println("Hora atual: " + horaInicioTarefa);
            } else {
                System.out.println("Continue em outro momento");
            }
        } else if (tarefa.equals("N")) {
            System.out.println("Volte em outra hora!");
        }

        //EXERCICIO FORMATAR DATA E HORA ATUAL

        LocalTime horaHoje = LocalTime.now();
        System.out.println("Hora hoje: " + horaHoje);

        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Hora formatada: " + horaFormatada.format(horaHoje));

        LocalDate dataHoje = LocalDate.now();
        System.out.println("Data hoje: " + dataHoje);

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data formatada: " + dataFormatada.format(dataHoje));

        //EXERCICIO FORMATAR DATA E HORA ATUAL

        LocalTime inicioAtividade = LocalTime.of(1, 0);
        LocalTime fimAtividade = LocalTime.of(13, 30);

        Duration durationA = Duration.between(inicioAtividade, fimAtividade);
        System.out.println("Diferença de tempo: " + durationA.toHours() + " horas e " + durationA.toMinutes() + " " +
                "minutos");

        //EXERCICIO CALCULAR DATA DE ENTREGA






    }
}