package com.zoomagri.muestras.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "muestra")
@Data
public class Muestra {

    @Id
    private Integer idMuestra;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

}
