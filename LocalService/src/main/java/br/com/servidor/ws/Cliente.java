package br.com.servidor.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="Servidor")
public class Cliente {

	private String param = "!";

	@WebMethod(operationName="Consulta")
	@WebResult(name = "Teste")
	public String consultaTest(){
		return "Seja bem Findo " + this.param;
	}

	@WebMethod(operationName="Adiciona")
	@WebResult(name = "Teste")
	public String adicionaTest(@WebParam(name = "Nome") String param){
		this.param = param;
		return "Nome " + this.param + " Adicionado com Sucesso!";
	}
	
	@WebMethod(operationName="Atualiza")
	@WebResult(name = "Teste")
	public String atualizaTest(@WebParam(name = "Nome") String param){
		this.param = param;
		return "Nome " + this.param + " Atualizado!";
	}
	
	@WebMethod(operationName="Deletar")
	@WebResult(name = "Deletado")
	public String deletarTest(@WebParam(name = "Nome") String param){
		this.param = "!";
		return "Deletado o Nome " + param;
	}
	
}
