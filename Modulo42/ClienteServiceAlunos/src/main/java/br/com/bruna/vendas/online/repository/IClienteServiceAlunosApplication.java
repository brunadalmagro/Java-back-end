/**
 * 
 */
package br.com.bruna.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.bruna.vendas.online.ClienteServiceAlunosApplication;

/**
 * 
 *
 */
@Repository
public interface IClienteServiceAlunosApplication extends MongoRepository<ClienteServiceAlunosApplication, String>{

	Optional<ClienteServiceAlunosApplication> findByCpf(Long cpf);
}
