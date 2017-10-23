package br.com.caelum.agenda.TestaConversao;

import java.util.Date;
import java.util.Formatter;

import br.com.caelum.agenda.convertStringToDate.Conversor;

public class TestaStringConversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data = new Date();
		
		String date = Conversor.converteDataParaString(data);
		//22/08/2017
		//22/08/2017 13:56:23
		System.out.println(date);

	}

}
