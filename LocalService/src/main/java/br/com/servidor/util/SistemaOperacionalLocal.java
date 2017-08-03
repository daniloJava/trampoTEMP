package br.com.servidor.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class SistemaOperacionalLocal {
	
	protected void mataPortaSeEstiverOcupada(final String porta, final String comandoPortasAbertas, final String comandoMatarProcesso) {
		String pid = "";
		
		try {
			//Verifica todas portas abertas = netstat -a -n -o 
			Process p = Runtime.getRuntime().exec(comandoPortasAbertas);
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String lineOut = input.readLine();
			
			while ((lineOut = input.readLine()) != null) {
				if(lineOut.contains(porta)) //Verifica porta usada
					pid = lineOut;
			}
			
			//Matar processo pelo PID filtrado taskKill.exe /F /PID 
			Runtime.getRuntime().exec(comandoMatarProcesso + getfiltroPID(pid));
			
			input.close();
			
		} catch (IOException e) {
			System.out.println("DEU BOSTA ");
		}
	}
	
	protected abstract String getfiltroPID(String pid);
}
