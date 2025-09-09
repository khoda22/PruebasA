package pe.edu.upc.apisanisidro.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.apisanisidro.entities.Provider;

import java.util.List;

public interface IProviderService {
    public List<Provider> List(); //HUF02
    public void insert(Provider p); //HUF01
    public Provider listId(int id); //HUF05
    public void delete(int id); //HUF04
    public void update(Provider p); //HUF03
    public List<Provider> buscarXNombreService(String nombre); //HUF06
}
