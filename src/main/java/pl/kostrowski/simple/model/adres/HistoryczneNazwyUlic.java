package pl.kostrowski.simple.model.adres;

import lombok.Data;

import javax.persistence.*;

@Entity(name="historyczne_nazwy_ulic")
@Data
public class HistoryczneNazwyUlic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "stara_nazwa",nullable = false)
    private String staraNazwa;

    @Column(name = "nowa_nazwa",nullable = false)
    private String nowaNazwa;

}
