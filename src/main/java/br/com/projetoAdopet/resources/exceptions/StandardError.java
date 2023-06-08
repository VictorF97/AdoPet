package br.com.projetoAdopet.resources.exceptions;

public class StandardError {

	// CLASSE PARA IMPLEMENTAR O NOSSO OBJ NOT FOUND EXCEPTION (OBJ NÃO ENCONTRADO)

	private Integer status; // status
	private long timestamp;// momento em que ocorre o erro
	private String message;// mensagem do erro

	// Construtor da superclass
	public StandardError() {
		super();
	}

	// Construtor com os Parâmetros
	public StandardError(Integer status, long timestamp, String message) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
	}

	// Gets e Setters dos atributos
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
