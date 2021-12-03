
package RetoFinal.Reto3Grupo8;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioLib {
    
    @Autowired
    private InterfaceLib crud;

    public List<Lib> getAll(){
        return (List<Lib>) crud.findAll();
    }

    public Optional<Lib> getLib(int id){
        return crud.findById(id);
    }

    public Lib save(Lib lib){
        return crud.save(lib);
    }
    public void delete(Lib lib){
        crud.delete(lib);
    }
    
}
