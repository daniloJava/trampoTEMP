package br.com.servidor.ws;

import javax.xml.ws.Endpoint;

import br.com.servidor.util.ComandosLinuxUtil;
import br.com.servidor.util.ComandosWindowsUtil;

public class Servidor {
	
	private static final String PORTA = "8085";

	public static void main(String[] args) {
		if(!abrePorta()){
			mataPortaSeEstiverOcupada();
			abrePorta();
		}
	}
	
	/**Executa comandos que verificas as portas disponiveis
	 * 
	 * Mata a porta se estiver ocupada.
	 * 
	 */
	private static void mataPortaSeEstiverOcupada() {
		if(System.getProperty("os.name").contains("Windows")){
			new ComandosWindowsUtil().mataPortaSeEstiverOcupada(PORTA);
		}else{
			new ComandosLinuxUtil().mataPortaSeEstiverOcupada(PORTA);
		}
	}
	
	private static boolean abrePorta() {
		try {
			Endpoint publish = Endpoint.publish("http://localhost:" + PORTA + "/LocalService/servidor", new Cliente());
			System.out.println("PORTA ABERTA : " + "http://localhost:" + PORTA + "/LocalService/servidor");
			return true;
		} catch (Exception e) {
			System.out.println("Não foi possivel abrir porta");
			e.printStackTrace();
			return false;
		}
	}
}
