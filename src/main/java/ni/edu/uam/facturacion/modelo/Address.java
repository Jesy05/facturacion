package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.StringReader;


@Embeddable
@Getter @Setter


public class Address {

    @Column(length = 30)
    String street;

    @Column(length = 5)
    int zipCode;

    @Column(length = 20)
    String city;

    @Column(length = 30)
    String state;


}
