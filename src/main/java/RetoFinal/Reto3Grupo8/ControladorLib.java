
package RetoFinal.Reto3Grupo8;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Lib")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ControladorLib {
      @Autowired
    private ServiciosLib servicio;
    @GetMapping("/all")
    public List<Lib> getLibs(){
        return servicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Lib> getLib(@PathVariable("id") int libId) {
        return servicio.getLib(libId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Lib save(@RequestBody Lib lib) {
        return servicio.save(lib);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Lib update(@RequestBody Lib lib) {
        return servicio.update(lib);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int libId) {
        return servicio.deleteLib(libId);
    }
    
}
