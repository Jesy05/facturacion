package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter

public class Cliente {
    @Id
    @Column(length=6)
    int numero;

    @Column(length=50)
    @Required //es como un not null
    String nombre;

}
