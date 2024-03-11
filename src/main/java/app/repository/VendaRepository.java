package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {
	
	public List<Venda> findById(String id);
		
	public List<Venda> findByEndereco(String enderecoEntrega);
	
	@Query("FROM Venda c WHERE c.valor > :valor")
	public List<Venda> buscarVendasAcimaValor(int valor);
}
