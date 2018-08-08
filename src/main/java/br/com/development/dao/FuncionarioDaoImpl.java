package br.com.development.dao;

import org.springframework.stereotype.Repository;
import br.com.development.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
