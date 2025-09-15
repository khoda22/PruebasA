package pe.edu.upc.apisanisidro.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.apisanisidro.dtos.ProviderDTO;
import pe.edu.upc.apisanisidro.entities.Provider;
import pe.edu.upc.apisanisidro.servicesinterfaces.IProviderService;

import java.time.LocalDate;
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

    //Metodo GET - Listar datos por ID
    @GetMapping("/{idProvider}")
    public ResponseEntity<?> listarId(@PathVariable("idProvider") Integer idProvider) {
        Provider prov = service.listId(idProvider);
        if (prov == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("No existe un registro con el ID: " + idProvider);
        }
        ModelMapper m = new ModelMapper();
        ProviderDTO dto = m.map(prov, ProviderDTO.class);
        return ResponseEntity.ok(dto);
    }

    //Metodo DELETE - borra por el ID
    @DeleteMapping("/{idProvider}")
    public ResponseEntity<String> eliminar(@PathVariable("idProvider") Integer idProvider) {
        Provider p = service.listId(idProvider);
        if (p == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No existe un registro con el ID: " + idProvider);
        }
        service.delete(idProvider);
        return ResponseEntity.ok("Registro con ID " + idProvider + " eliminado correctamente.");
    }

    //Metodo PUT - actualizar datos
    @PutMapping
    public ResponseEntity<String> modificar(@RequestBody ProviderDTO dto) {
        ModelMapper m = new ModelMapper();
        Provider p = m.map(dto, Provider.class);

        // Validación de existencia
        Provider existente = service.listId(p.getIdProvider());
        if (existente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se puede modificar. No existe un registro con el ID: " + p.getIdProvider());
        }

        // Actualización si pasa validaciones
        service.update(p);
        return ResponseEntity.ok("Registro con ID " + p.getIdProvider() + " modificado correctamente.");//
    }

    //Metodo GET - buscar por nombre
    @GetMapping("/busquedas")
    public ResponseEntity<?> buscarXNombre(@RequestParam String n) {
        List<Provider> proveedores = service.buscarXNombreService(n);

        if (proveedores.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se encontraron proveedores: " + n);
        }

        List<ProviderDTO> listaDTO = proveedores.stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProviderDTO.class);
        }).collect(Collectors.toList());

        return ResponseEntity.ok(listaDTO);
    }
}
