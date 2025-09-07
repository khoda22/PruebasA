package pe.edu.upc.apisanisidro.servicesinterfaces;

import pe.edu.upc.apisanisidro.entities.Provider;

import java.util.List;

public interface IProviderService {
    public List<Provider> List(); //HUF02
    public void insert(Provider p); //HUF02
}
