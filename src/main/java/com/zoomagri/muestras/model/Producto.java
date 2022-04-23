package com.zoomagri.muestras.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
@Data
public class Producto {

    @Id
    private Integer idProducto;

    private String descripcion;

}
