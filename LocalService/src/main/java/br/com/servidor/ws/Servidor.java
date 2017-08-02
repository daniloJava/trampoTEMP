package br.com.servidor.ws;

import javax.xml.ws.Endpoint;

import br.com.servidor.util.ComandosLinuxUtil;
import br.com.servidor.util.ComandosWindowsUtil;

public class Servidor {
	
	private static final String COMAND_PROCURA_PORTAS_ABERTAS = "netstat -a -n -o ";
	private static final String COMAND_MATAR_PROCESSO_POR_PID = "taskKill.exe /F /PID ";
	private static final String PORTA = "8085";

	public static void main(String[] args) {
		if(!abrePorta()){
			mataPortaSeEstiverOcupada();
			abrePorta();
		}
		System.getProperties().get("os.name");
	}
	
	
	/**Executa comandos que verificas as portas disponiveis
	 * 
	 * Mata a porta se estiver ocupada.
	 * 
	 */
	private static void mataPortaSeEstiverOcupada() {
		System.getenv();
		if(true){
			new ComandosWindowsUtil().mataPortaSeEstiverOcupada(PORTA);
		}else{
			new ComandosLinuxUtil().mataPortaSeEstiverOcupada(PORTA);
		}
		
	}
	
	private static boolean abrePorta() {
		try {
			Endpoint publish = Endpoint.publish("http://localhost:" + PORTA + "/LocalService/servidor", new Cliente());
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

}
