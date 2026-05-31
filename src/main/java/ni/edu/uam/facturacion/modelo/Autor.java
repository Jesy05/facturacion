package ni.edu.uam.facturacion.modelo;

import javax.persistence.*;
import java.util.Collection;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;
import lombok.*;

@Entity
@Getter @Setter
public class Autor {

    @Id
    @GeneratedValue(generator="system-uuid")
    @Hidden
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;

    @Column(length=50)
    @Required
    String nombre;

    @OneToMany(mappedBy="autor")
    @ListProperties("numero, descripcion, price") // Nota: usamos 'price' en lugar de 'precio' porque así se llama en tu clase Producto
            Collection<Producto> productos;

}