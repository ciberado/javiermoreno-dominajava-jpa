package com.javiermoreno.herencia;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PROY_DES")
@AttributeOverride(name = "id", column = @Column(name = "ID_DES_PR"))
public class ProyectoDesarrollo extends Proyecto {

    private static final long serialVersionUID = 1L;
    @Column(name = "PLAT_PR")
    private PlataformaSoftwareType plataforma;

    public ProyectoDesarrollo() {
        super();
    }

    public ProyectoDesarrollo(int id, String nombre,
            int horasEstimadas, Empleado responsable,
            PlataformaSoftwareType plataforma) {
        super(id, nombre, horasEstimadas, responsable);
        this.plataforma = plataforma;
    }

    public PlataformaSoftwareType getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(PlataformaSoftwareType plataforma) {
        this.plataforma = plataforma;
    }
}
