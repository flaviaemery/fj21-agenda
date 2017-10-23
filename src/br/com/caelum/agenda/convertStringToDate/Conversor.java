package br.com.caelum.agenda.convertStringToDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversor {
	
	public static Date converteStringParaData(String data, String formatoDeData) {
		Date dataConvertida = null;
		
		DateFormat df = new SimpleDateFormat(formatoDeData);
		try {
			dataConvertida = df.parse(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dataConvertida;
	}
	
	public static String converteDataParaString(Date data) {
		String dataConvertida = null;
		
		DateFormat dateformatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			dataConvertida = dateformatter.format(data);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return dataConvertida;
	}
	

}
