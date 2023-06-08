package br.com.projetoAdopet.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{
	
			//CLASE DE TRATAMENTO DE EXCEÇÕES
	
	
	//Serial version, padrão 1L
	private static final long serialVersionUID = 1L;

	//construtores que mostram as mensagens
	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFoundException(String message) {
		super(message);
	}

}
