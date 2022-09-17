package com.farm.wagemanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmerIdSequence")
    @SequenceGenerator(name = "farmerIdSequence", sequenceName = "farmerIdSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private String address;
    private String contactNo;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "orgId",
            referencedColumnName = "id"
    )
    private Organization org;

}
