package pl.kostrowski.simple.model.adres;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name="adres")
@Data
public class Adres {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    private String ulica;
    private String numerDomu;
    private String numerMieszkania;
    private String miejscowosc;
    private String kodPocztowy;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "adres_to_historyczne")
    private List<HistoryczneNazwyUlic> historyczneNazwyUlic;

    @ManyToOne()
    @JoinColumn(name = "fk_organ_meldujacy")
    private OrganMeldujacy organMeldujacy;

}
