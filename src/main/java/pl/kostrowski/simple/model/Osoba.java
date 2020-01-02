package pl.kostrowski.simple.model;


import lombok.Data;
import pl.kostrowski.simple.model.adres.Adres;
import pl.kostrowski.simple.model.imiona.DaneImion;

import javax.persistence.*;
import java.util.List;

@Entity(name="osoba")
@Data
public class Osoba {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String pesel;

    @Column(nullable = false)
    private Boolean czyZyje;

    @OneToOne
    @JoinColumn(name = "dane_imion_id", unique = true, nullable = false)
    private DaneImion daneImion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "osoba_id")
    private List<Adres> adresy;

}
