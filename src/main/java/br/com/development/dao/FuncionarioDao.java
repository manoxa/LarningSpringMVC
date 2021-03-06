package br.com.development.dao;

import java.util.List;

import br.com.development.domain.Cargo;
import br.com.development.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);

	void update(Funcionario funcionario);

	void delete(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();

	List<Funcionario> findByName(String nome);
	
	List<Funcionario> findByCargoId(Long id);
}
