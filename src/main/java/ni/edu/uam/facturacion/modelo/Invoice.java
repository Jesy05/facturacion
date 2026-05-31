package ni.edu.uam.facturacion.modelo;

import javax.ejb.Local;
import javax.persistence. *;

import lombok. *;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;
import org.openxava.annotations.Stereotype;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.calculators.CurrentYearCalculator;

import java.time.LocalDate;

@Setter @Getter @Entity


public class Invoice {
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

    int number;

    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate date;

    @Stereotype("MEMO")
    String remarks;


}
