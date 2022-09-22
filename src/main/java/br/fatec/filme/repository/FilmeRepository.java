package br.fatec.filme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.fatec.filme.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
