package ni.edu.uam.facturacion.modelo;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.openxava.annotations.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter @Setter
public class Producto {

    @Id
    @Column(length = 9)
    int numero;

    @Column(length = 50)
    @Required
    String descripcion;

    @ManyToOne(
            fetch=FetchType.LAZY,
            optional=true)
    @DescriptionsList
    Categoria categoria;

    @Money
    BigDecimal price;

    @Files
    @Column(length= 32)
    String photos;

    @TextArea
    String remarks;

}