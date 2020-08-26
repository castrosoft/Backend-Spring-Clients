package com.mybusiness.springboot.backend.apirest.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Pedro Castro
 * Esta clase es una "clase Entity" que esta mapeada a una DB.
 * Cada atributo es una columna de la tabla de la DB.
 *
 */

@Entity
//La anotacion @Table es necesario si la tabla no tiene el mismo nombre de la clase
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column es analogo a @Table
    private String nombre;
    private String apellido;
    private String email;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    //Id necesario por implementar Serializable
    private static final long serialVersionUID = 1L;

}
