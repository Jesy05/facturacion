package ni.edu.uam.facturacion.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Embeddable
@Getter @Setter
public class Detalle {

    int cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @DescriptionsList
    Producto producto;

}