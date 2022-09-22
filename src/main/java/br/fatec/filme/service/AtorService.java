package br.fatec.filme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.filme.model.Ator;
import br.fatec.filme.repository.AtorRepository;

@Service
public class AtorService implements ServiceInterface<Ator>{
	
	@Autowired
	private AtorRepository repository;

	public AtorService() {
	}
	
	@Override
	public Ator create(Ator obj) {
		repository.save(obj);
		return obj;
	}
	
	@Override
	public List<Ator> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Ator findById(Long id) {
		Optional<Ator> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Ator obj) {
		if (repository.existsById(obj.getId())) {
			repository.save(obj);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean delete(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;			
		}
		return false;
	}
	
}
