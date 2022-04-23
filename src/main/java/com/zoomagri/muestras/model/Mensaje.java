package com.zoomagri.muestras.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mensaje")
@Data
public class Mensaje {

    @Id
    private Integer idMensaje;

    private String texto;

    @ManyToOne
    @JoinColumn(name = "idVarietal")
    private Varietal varietal;

    private Integer cantidadMaxima;

    private Integer cantidadMinima;

    @Enumerated(value = EnumType.STRING)
    private TipoCantidad tipoCantidad;

}
