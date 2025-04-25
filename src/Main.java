import java.time.*;
import java.time.format.DateTimeFormatter;

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
        



    }
}