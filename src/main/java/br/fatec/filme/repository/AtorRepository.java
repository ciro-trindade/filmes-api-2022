package br.fatec.filme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.fatec.filme.model.Ator;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Long>{

}
