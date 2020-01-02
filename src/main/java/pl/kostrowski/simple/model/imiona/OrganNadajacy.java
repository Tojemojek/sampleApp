package pl.kostrowski.simple.model.imiona;

import lombok.Data;

import javax.persistence.*;

@Entity(name="organ_nadajacy")
@Data
public class OrganNadajacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kod_organu", nullable = false, unique = true)
    private Long kodOrganu;

    @Column(name = "nazwa_organu", nullable = false)
    private String nazwaOrganu;

}
