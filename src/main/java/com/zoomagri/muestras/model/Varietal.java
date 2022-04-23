package com.zoomagri.muestras.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "varietal")
@Data
public class Varietal {

    @Id
    private Integer idVarietal;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

}
