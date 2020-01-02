package pl.kostrowski.simple.model.imiona;

import lombok.Data;
import pl.kostrowski.simple.model.adres.HistoryczneNazwyUlic;
import pl.kostrowski.simple.model.adres.OrganMeldujacy;

import javax.persistence.*;
import java.util.List;

@Entity(name="dane_imion")
@Data
public class DaneImion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String imiePierwsze;
    private String imieDrugie;
    private String imionaKolejne;

    @ManyToOne()
    @JoinColumn(name = "fk_organ_nadajacy", nullable = false)
    private OrganMeldujacy organNadajacy;

}
