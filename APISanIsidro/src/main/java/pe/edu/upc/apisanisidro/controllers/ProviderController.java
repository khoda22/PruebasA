package pe.edu.upc.apisanisidro.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.apisanisidro.dtos.ProviderDTO;
import pe.edu.upc.apisanisidro.entities.Provider;
import pe.edu.upc.apisanisidro.servicesinterfaces.IProviderService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proveedores")
public class ProviderController {
    @Autowired
    private IProviderService service;

    //Metodo GET - Listar datos (convertimos entidad provider a providerDTO con el modermapper y stream)
    @GetMapping
    public List<ProviderDTO> listar(){
        return service.List().stream().map(a->{
            ModelMapper m=new ModelMapper();
            return m.map(a,ProviderDTO.class);
        }).collect(Collectors.toList());
    }

    //Metodo POST - ingresar datos (provider a porvider dto modmap y str)
    @PostMapping
    public void insertar(@RequestBody ProviderDTO dto){
        ModelMapper m=new ModelMapper();
        Provider prov = m.map(dto,Provider.class);
        service.insert(prov);
    }
}
