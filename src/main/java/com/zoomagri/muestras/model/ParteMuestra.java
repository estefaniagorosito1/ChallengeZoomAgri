package com.zoomagri.muestras.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "parte_muestra")
@Data
public class ParteMuestra {

    @Id
    private Integer idParteMuestra;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "idVarietal")
    private Varietal varietal;

    @ManyToOne
    @JoinColumn(name = "idMuestra")
    private Muestra muestra;

}
