package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
@Getter @Setter
@View(name = "Simple", members = "numero, nombre")
public class Cliente {

    @Id
    @Column(length = 6)
    int numero;

    @Column(length = 50)
    @Required
    String nombre;

    @Embedded @NoFrame
    Address address;

}