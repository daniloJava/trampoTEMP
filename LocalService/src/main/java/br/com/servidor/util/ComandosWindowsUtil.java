package br.com.servidor.util;

import javax.swing.JOptionPane;

public class ComandosWindowsUtil extends SistemaOperacionalLocal{
	
	private static final String COMAND_PROCURA_PORTAS_ABERTAS = "netstat -a -n -o ";
	private static final String COMAND_MATAR_PROCESSO_POR_PID = "taskKill.exe /F /PID ";

	public void mataPortaSeEstiverOcupada(String porta) {
		super.mataPortaSeEstiverOcupada(porta, COMAND_PROCURA_PORTAS_ABERTAS, COMAND_MATAR_PROCESSO_POR_PID);
	}


	@Override
	protected String getfiltroPID(String pid) {
		System.out.println("PID : " + pid);
		return pid.substring(pid.length() - 7).trim();
	}
	
}
