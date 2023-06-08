package br.com.projetoAdopet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoAdopet.Pet;

	//CLASSE DO BANCO DE DADOS //REPOSITORIO

//informando para o spring que essa é uma interface Repository.
@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

}
