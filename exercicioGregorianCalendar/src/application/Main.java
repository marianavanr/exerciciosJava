package application;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        GregorianCalendar cal = new GregorianCalendar();

        // Data de hoje
        Date date = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy E");
        System.out.println("Dia de hoje: " + formatador.format( date ));

        // Data daqui a 15 dias
        GregorianCalendar dateFifteen = new GregorianCalendar();
        dateFifteen.add(Calendar.DAY_OF_MONTH, 15);
        System.out.println("Daqui a 15 dias: " + formatador.format(dateFifteen.getTime()));

        // Data daqui a 45 dias
        GregorianCalendar date45 = new GregorianCalendar();
        date45.add(Calendar.DAY_OF_MONTH, 45);
        System.out.println("Daqui a 45 dias: " + formatador.format(date45.getTime()));

        // Data daqui a 90 dias
        GregorianCalendar date90 = new GregorianCalendar();
        date90.add(Calendar.DAY_OF_MONTH, 90);
        System.out.println("Daqui a 90 dias: " + formatador.format(date90.getTime()));

        // Data de aniversário
        GregorianCalendar dateAniv = new GregorianCalendar(1993, Calendar.FEBRUARY, 19);
        System.out.println("Data de Aniversário: " + formatador.format(dateAniv.getTime()));

        // Data de Natal
        int ano = cal.get(Calendar.YEAR);
        GregorianCalendar dateNatal = new GregorianCalendar(ano, Calendar.DECEMBER, 25);
        System.out.println("Data de Natal: " + formatador.format(dateNatal.getTime()));

        //Data de Ano Novo
        GregorianCalendar dateAnoNovo = new GregorianCalendar(ano, Calendar.DECEMBER, 31);
        System.out.println("Data de Ano Novo: " + formatador.format(dateAnoNovo.getTime()));


    }
}
