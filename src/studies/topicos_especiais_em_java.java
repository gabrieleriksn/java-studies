package studies;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.Instant;
//import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class topicos_especiais_em_java {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Date (Uma classe). 
		 * 
		 * Representa um instante.
		 * 
		 * Internamente um objeto da classe Date armazena:
		 * - O n�mero de milissegundos desde a meia noite do dia 01 de janeiro
		 * de 1970 GMT (UTC); 
		 * 
		 * OBS: � EXATAMENTE POR ISSO QUE OS VALORES S�O ARMAZENADOS COMO LONG, POIS S�O GIGANTES.
		 * 
		 * - GMT: Greenwich Mean Time (time zone);
		 * - UTC: Coordinated Universal Time (time standard).
		 * 
		 * 
		 * SimpleDateFormat (Define formatos para convers�o entre Data e String)
		 * 
		 * - dd/MM/yyyy
		 * - dd/MM/yyyy HH:mm:ss
		 * 
		 * 
		 * PADR�O ISO 8601 e Classe Instant
		 * 
		 * - Formato: "yyyy-mm-ddTHH:mm:ssZ"
		 * 
		 * Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		 * 
		 */
	
		
		// Exemplos
		
		
		/* 
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());

		
		Date y1 = sdf1.parse("09/04/2022");
		Date y2 = sdf2.parse("23/08/2002 12:45:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		// As datas s�o impressas, por padr�o no format local.
		// Como corrigir?
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("--------------------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		*/
		 
		
		// Como manipular Dates com Calendar;
		
		//SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfr = new SimpleDateFormat("MM/yyyy");

		String dMy = "08/2003";
		Date dateMy = sdfr.parse(dMy);
		System.out.println(sdfr.format(dateMy));
		Date dateMyTwo = sdfr.parse("08/2003");
		System.out.println(sdfr.format(dateMyTwo));
		System.out.println(dateMy.equals(dateMyTwo));
		/*
		String data = sc.nextLine();
		Date date = sdf.parse(data);
		System.out.println(sdf.format(date));

		// sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf1.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		// cal.add(Calendar.HOUR_OF_DAY, 4);
		// d = cal.getTime();
		// cal.add(Calendar.HOUR_OF_DAY, -3);
		// d = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
		System.out.println(sdf1.format(d));

		Date in = Date.from(Instant.parse("2022-04-12T00:00:00Z"));
        Calendar calIn = Calendar.getInstance();
        calIn.setTime(in);
        long millisIn = calIn.getTimeInMillis();

        Date out = Date.from(Instant.parse("2022-04-15T00:00:00Z"));
        Calendar calOut = Calendar.getInstance();
        calOut.setTime(out);
        long millisOut = calOut.getTimeInMillis();

        System.out.println(in);
        System.out.println(millisIn);
        System.out.println(out);
        System.out.println(millisOut);

        long duration = millisOut - millisIn;
        long durationHours = duration / (24 * 60 * 60 * 1000);

        System.out.println(duration);
        System.out.println(durationHours);

        //    1 dia -> 24 * 60 * 3600 * 216000 millis
        //      n   -> duration 

		OBS: Sempre tratar datas utilizando long, já que estamos falando de números gigantescos
		que, no processo de casting, há a perda de dados e inconsistência nos valores
		
		*/
		sc.close();
	}

}
