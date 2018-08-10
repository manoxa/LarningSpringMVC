package br.com.development.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.development.domain.Cargo;
import br.com.development.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	@Override
	public List<Funcionario> findByName(String nome) {
		return createQuery("select f from Funcionario f where f.nome like concat('%',?1,'%') ", nome); 	
	}

	@Override
	public List<Funcionario> findByCargoId(Long id) {
		return createQuery("select f from Funcionario f where f.cargo.id = ?1", id);
	}

}
