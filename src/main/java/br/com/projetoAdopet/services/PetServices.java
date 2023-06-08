package br.com.projetoAdopet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoAdopet.Pet;
import br.com.projetoAdopet.repositories.PetRepository;
import br.com.projetoAdopet.services.exceptions.ObjectNotFoundException;

//informa ao spring que essa é uma classe de serviços da API
@Service
public class PetServices {

	@Autowired

	private PetRepository repository;// instanciando um pet repository

	// retorna um pet e recebe um obj do tipo integer
	public Pet findById(Integer id) {
		Optional<Pet> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pet.class.getName()));
	}

	// Método que lista todos os pets
	public List<Pet> findAll() {
		return repository.findAll();
	} // ele indentifica que é uma lista de usuários e vai fazer uma busca de todos
		// pets e vai retornar essa lista de usuários pra nossa camada de recursos.

	public Pet update(Integer id, Pet obj) {
		Pet newObj = findById(id);
		newObj.setNome(obj.getNome());//vai atualizar o nome do pet na nossa base de dados
		return repository.save(newObj);//quando ele for salvar vai entender que é apenas uma atualização
	}

	public Pet create(Pet obj) {
		obj.setId(null);//já atribui um novo id no pet
		return repository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);//faz uma busca pra ver se o pet existe ou não
		repository.deleteById(id);	
	}


}
