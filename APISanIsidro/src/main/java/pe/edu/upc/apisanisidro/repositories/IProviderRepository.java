package pe.edu.upc.apisanisidro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.apisanisidro.entities.Provider;

public interface IProviderRepository extends JpaRepository<Provider, Integer> {
}
