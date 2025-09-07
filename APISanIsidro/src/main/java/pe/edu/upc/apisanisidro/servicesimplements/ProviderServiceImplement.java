package pe.edu.upc.apisanisidro.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.apisanisidro.entities.Provider;
import pe.edu.upc.apisanisidro.repositories.IProviderRepository;
import pe.edu.upc.apisanisidro.servicesinterfaces.IProviderService;

import java.util.List;

@Service
public class ProviderServiceImplement implements IProviderService {

    @Autowired
    private IProviderRepository repository; //repository es el punto de conexion con el repositories

    @Override
    public List<Provider> List() {
        return repository.findAll(); //usa CRUD
    }

    @Override
    public void insert(Provider p) {
        repository.save(p); //usa CRUD
    }
}
