package br.com.caelum.agenda.TestaConversao;

import java.util.Date;

import br.com.caelum.agenda.convertStringToDate.Conversor;

public class TestaConversor {

	public static void main(String[] args) {
		
		Date date = Conversor.converteStringParaData("01/01/2011 16:55:18", "dd/MM/yyyy");
		
		System.out.println(date);
		
	}

}
