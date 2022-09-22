package br.fatec.filme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.filme.model.Nacionalidade;
import br.fatec.filme.repository.NacionalidadeRepository;

@Service
public class NacionalidadeService implements ServiceInterface<Nacionalidade>{
	
	@Autowired
	private NacionalidadeRepository repository;

	public NacionalidadeService() {
	}
	
	@Override
	public Nacionalidade create(Nacionalidade obj) {
		repository.save(obj);
		return obj;
	}
	
	@Override
	public List<Nacionalidade> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Nacionalidade findById(Long id) {
		Optional<Nacionalidade> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Nacionalidade obj) {
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
