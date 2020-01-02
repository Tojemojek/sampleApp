package pl.kostrowski.simple.model.adres;

import lombok.Data;
import lombok.Generated;
import org.hibernate.id.UUIDGenerator;

import javax.persistence.*;

@Entity(name="organ_meldujacy")
@Data
public class OrganMeldujacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kod_organu", nullable = false, unique = true)
    private Long kodOrganu;

    @Column(name = "nazwa_organu", nullable = false)
    private String nazwaOrganu;

}
