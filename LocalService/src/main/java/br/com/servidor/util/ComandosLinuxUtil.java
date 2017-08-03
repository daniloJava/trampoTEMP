package br.com.servidor.util;

public class ComandosLinuxUtil  extends SistemaOperacionalLocal{
	
	private static final String COMAND_PROCURA_PORTAS_ABERTAS = "netstat -t -l -p --numeric-ports ";
	private static final String COMAND_MATAR_PROCESSO_POR_PID = "kill -9 ";
	private static final String PADRA_FIND_PID = "ESCUTA";

	public void mataPortaSeEstiverOcupada(String porta) {
		super.mataPortaSeEstiverOcupada(porta, COMAND_PROCURA_PORTAS_ABERTAS, COMAND_MATAR_PROCESSO_POR_PID);
	}

	@Override
	protected String getfiltroPID(String pid) {
		return pid.substring(pid.lastIndexOf(PADRA_FIND_PID) + 9).trim();
	}
	

}
