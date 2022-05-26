package mensagem.control;

import mensagem.model.Mensagems;
import model.util.HorarioAtual;

public class MensagemControl {

	public static void mensagemBoasVindas() {
		int hora = HorarioAtual.puxarHorario();
		if(hora>=4 && hora<=12){
			Mensagems.mensagemBomDia();
		}else if(hora>=13 && hora<=18) {
			Mensagems.mensagemBoaTarde();
		}else if((hora>=19 && hora<=24) || (hora>=1 && hora<=3) ) {
			Mensagems.mensagemBoaNoite();
		}
	}
	
	
	
}
