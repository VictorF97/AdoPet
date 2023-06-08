package br.com.projetoAdopet.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.projetoAdopet.services.exceptions.ObjectNotFoundException;

//Manipulador de Exceções de Recursos
@ControllerAdvice
public class ResourcesExceptionHandler {

	//metódo para tratar o obj notfounds (Objeto não encontrado)
	@ExceptionHandler(ObjectNotFoundException.class)//Manipulador de exceções da class ObjectNotFound
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), System.currentTimeMillis(), e.getMessage());//instanciando um Standard erro, da classe StandError
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
