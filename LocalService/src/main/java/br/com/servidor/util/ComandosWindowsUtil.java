package br.com.servidor.util;

public class ComandosWindowsUtil extends SistemaOperacionalLocal{
	
	private static final String COMAND_PROCURA_PORTAS_ABERTAS = "netstat -a -n -o ";
	private static final String COMAND_MATAR_PROCESSO_POR_PID = "taskKill.exe /F /PID ";
	

	public void mataPortaSeEstiverOcupada(String porta) {
		super.mataPortaSeEstiverOcupada(porta, COMAND_PROCURA_PORTAS_ABERTAS, COMAND_MATAR_PROCESSO_POR_PID);
	}
	
}
