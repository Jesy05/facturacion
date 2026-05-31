package ni.edu.uam.facturacion.modelo;

import java.time.*;
import java.util.*; // Requerido para Collection
import javax.persistence.*;
import ni.edu.uam.facturacion.calculator.NextNumberForYearCalculator;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;
import lombok.*;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.calculators.CurrentYearCalculator;

@Entity
@Getter @Setter
public class Factura {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    String oid;

    @Column(length = 4)
    @DefaultValueCalculator(CurrentYearCalculator.class)
    int year;

    @Column(length = 6)
    @DefaultValueCalculator(
            value = NextNumberForYearCalculator.class,
            properties = @PropertyValue(name = "year")
    )
    int number;

    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate date;

    @Stereotype("MEMO")
    String remarks;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @DescriptionsList
    Cliente cliente;

    @ElementCollection
    Collection<Detalle> detalles;

}