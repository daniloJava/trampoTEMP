package br.com.servidor.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="Servidor")
public class Cliente {

	private String param;

	@WebMethod(operationName="Adiciona")
	@WebResult(name = "Teste")
	public String adicionaTest(@WebParam(name = "Nome") String param){
		this.param = param;
		return "Chama fIO " + this.param;
	}
	
	@WebMethod(operationName="Atualiza")
	@WebResult(name = "Teste")
	public String atualizaTest(@WebParam(name = "Nome") String param){
		this.param = param;
		return "Atualizado a bagaça";
	}
	
}
