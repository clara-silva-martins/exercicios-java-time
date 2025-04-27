import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Retorna da data de hoje
//        LocalDate dataCompra = LocalDate.now();
//
//        LocalDate dataPrimeiraParcela = LocalDate.of(2025,5,15);

        //Adicionar dias utilizar plus

//        LocalDate dataSegundaParcela = LocalDate.now().plusDays(30);
//
//        System.out.println("Data de compra: " + dataCompra);
//        System.out.println("Data de primeira parcela: " + dataPrimeiraParcela);
//        System.out.println("Data de segunda parcela: " + dataSegundaParcela);
//
//        if(dataPrimeiraParcela.isBefore(LocalDate.now())){
//            System.out.println("Anterior dia do vencimento");
//        } else {
//            System.out.println("Superior ao dia do vencimento");
//        }
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println("Data compra formatada: " + dataCompra.format(formatter));
//
//        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
//        System.out.println("Data conclusão da compra: " + dataConclusaoCompra);
//        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
//        System.out.println("Data conclusão da compra em New York: " + dataCompraNy);
//
//        LocalTime inicio = LocalTime.of(9, 0);
//        LocalTime fim = LocalTime.of(17, 30);
//
//        Duration duration = Duration.between(inicio, fim);
//        System.out.println("Duração do expediente: " + duration.toHours() + " horas e " + duration.toMinutes() + " minutos");
//
//        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
//        Period periodo = Period.between(dataCompra, dataPagamento);
//        System.out.println("Diferença em dias: " + periodo.getDays());

        //EXERCICICIO DATA E HORA ATUAL
//
//
//        String tarefa;
//        String opcao;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Deseja começar a tarefa agora? (S/N)");
//        tarefa = scanner.nextLine();
//
//        if(tarefa.equals("S")) {
//            System.out.println("""
//                     Digite a opção desejada:
//                     1 - Enviar relatório semanal
//                     2 - Sair             \s
//                    \s"""
//            );
//            opcao = scanner.nextLine();
//
//            if (opcao.equals("1")) {
//                System.out.println("Enviar relatório semanal");
//                LocalDate dataInicioTarefa = LocalDate.now();
//                System.out.println("Data atual: " + dataInicioTarefa);
//                LocalTime horaInicioTarefa = LocalTime.now();
//                System.out.println("Hora atual: " + horaInicioTarefa);
//            } else {
//                System.out.println("Continue em outro momento");
//            }
//        } else if (tarefa.equals("N")) {
//            System.out.println("Volte em outra hora!");
//        }
//
//        //EXERCICIO FORMATAR DATA E HORA ATUAL
//
//        LocalTime horaHoje = LocalTime.now();
//        System.out.println("Hora hoje: " + horaHoje);
//
//        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");
//        System.out.println("Hora formatada: " + horaFormatada.format(horaHoje));
//
//        LocalDate dataHoje = LocalDate.now();
//        System.out.println("Data hoje: " + dataHoje);
//
//        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println("Data formatada: " + dataFormatada.format(dataHoje));
//
//        //EXERCICIO FORMATAR DATA E HORA ATUAL
//
//        LocalTime inicioAtividade = LocalTime.of(1, 0);
//        LocalTime fimAtividade = LocalTime.of(13, 30);
//
//        Duration durationA = Duration.between(inicioAtividade, fimAtividade);
//        System.out.println("Diferença de tempo: " + durationA.toHours() + " horas e " + durationA.toMinutes() + " " +
//                "minutos");

        //EXERCICIO CALCULAR DATA DE ENTREGA

//        LocalDate dataInicioProjeto = LocalDate.of(2025,4,25);
//        LocalDate prazoEntregaProjeto = LocalDate.now().plusDays(20);
//        System.out.println("Data inicial: " + dataInicioProjeto);
//        System.out.println("Data final: " + prazoEntregaProjeto);
//
//        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println("Data de entrega formatada: " + dataFormatada.format(prazoEntregaProjeto));

        //EXERCICIO AJUSTAR DATA DE VENCIMENTO

//        LocalDate dataVencimento = LocalDate.of(2025,9,7);
//        System.out.println("Data de vencimento: " + dataVencimento);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Deseja adiar a fatura? S/N");
//        String opcao = scanner.nextLine();
//
//        if (opcao.equals("S")) {
//            LocalDate dataAdiamento =  dataVencimento.plusMonths(4);
//            DateTimeFormatter dataAdiamentoFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            System.out.println("Data de antecipacao: " + dataAdiamentoFormatada.format(dataAdiamento));
//        }

        //EXERCICIO VERIFICAR DATA DE UM EVENTO

//        LocalDate dataAconteceuEvento = LocalDate.of(2025,4,26);
//        DateTimeFormatter dataAconteceuEventoFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate dataHoje = LocalDate.now();
//        DateTimeFormatter dataHojeFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println("Data de hoje: " + dataHojeFormatada.format(dataHoje));
//        System.out.println("Data do evento: " + dataAconteceuEventoFormatada.format(dataAconteceuEvento));
//
//        if(dataAconteceuEvento.isBefore(LocalDate.now())){
//            System.out.println("O evento já ocorreu");
//        }

        //EXERCICIO LEMBRETE DE PAGAMENTO

//        LocalDate lembretePrimeiroPagamento = LocalDate.of(2025, 04, 20);
//        LocalDate dataAntecedenciaPrimeiro = lembretePrimeiroPagamento.minusDays(10);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        LocalDate lembreteSegundoPagaemnto = LocalDate.of(2025, 04, 30);
//        LocalDate dataAntecedenciaSegundo = lembreteSegundoPagaemnto.minusDays(5);
//
//
//        if (lembreteSegundoPagaemnto.isAfter(dataAntecedenciaSegundo)){
//            System.out.println("Data do lembrete: " + formatter.format(dataAntecedenciaSegundo));
//        } else if (lembretePrimeiroPagamento.isBefore(lembreteSegundoPagaemnto)) {
//            System.out.println("Data do lembrete: " + formatter.format(dataAntecedenciaPrimeiro));
//        }

        //EXERCICIO FUSO HORARIO

//        ZonedDateTime dataAtual = ZonedDateTime.now();
//        System.out.println("Fuso horário de Brasil: " + dataAtual);
//        ZonedDateTime dataJapan = dataAtual.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
//        LocalTime hour = dataJapan.toLocalTime();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        System.out.println("Fuso horário de Tóquio: " + dataJapan);
//
//        System.out.println("Horário atual em Tóquio: " + formatter.format(hour));

        //EXERCICIO CONVERTENDO HORARIO PARA FUSO HORARIO

//        ZonedDateTime dataAtual = ZonedDateTime.now();
//        ZonedDateTime  fusoAustralia =  dataAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
//        ZonedDateTime fusoBrasil = ZonedDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//        System.out.println("Horário atual em Sydney: " + formatter.format(fusoAustralia));
//        System.out.println("Horário atual no Sistema: " + formatter.format(fusoBrasil));

        //EXERCICIO CONTROLE DE EXPEDIENTE

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter formatterDois = DateTimeFormatter.ofPattern("H");

        //Recebo as informações

        System.out.print("Digite seu horário de entrada (HH:mm): ");
        LocalTime horario = LocalTime.parse(scanner.nextLine(), formatter);

        System.out.println("Digite a carga horária diária (em horas): ");
        double horas = Double.parseDouble(scanner.nextLine());
        Duration carga = Duration.ofMinutes((long)(horas * 60));


        System.out.println("Digite o horária real de saída (HH:mm): ");
        LocalTime horarioRe = LocalTime.parse(scanner.nextLine(), formatter);

        //Horário saida

        LocalTime horaSaida = horario.plus(carga);

        Duration duration = Duration.between(horario, horarioRe);
        Duration diferenca = duration.minus(carga);

        System.out.println("Saldo de horas: " + diferenca.toHoursPart() + "h" + diferenca.toMinutesPart() + " min");







    }
}