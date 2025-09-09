package pe.edu.upc.apisanisidro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.apisanisidro.entities.Provider;

import java.util.List;

public interface IProviderRepository extends JpaRepository<Provider, Integer> {

    @Query("SELECT p FROM Provider p WHERE p.nameProvider LIKE %:nombre%")
    public List<Provider> buscarXNombre(@Param("nombre") String nombre);
}
