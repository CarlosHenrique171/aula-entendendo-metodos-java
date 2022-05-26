package model.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HorarioAtual {
	
	public static int puxarHorario() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh"); 
		return Integer.parseInt(sdf.format(new Date()));
	}
}
