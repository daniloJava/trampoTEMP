package br.com.servidor.ws;

import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSplitPaneUI;
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
		JOptionPane.showMessageDialog(null, "MATA PROCESSO");
	}
	
	private static boolean abrePorta() {
		try {
			Endpoint publish = Endpoint.publish("http://localhost:" + PORTA + "/LocalService/servidor", new Cliente());
			JOptionPane.showMessageDialog(null, "PORTA ABRIDA");
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "FALHA EM ABRIR PORTA");
			return false;
		}
	}
}
