/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "Profesor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
    , @NamedQuery(name = "Profesor.findByIdProfesor", query = "SELECT p FROM Profesor p WHERE p.idProfesor = :idProfesor")
    , @NamedQuery(name = "Profesor.findByNombreProfesor", query = "SELECT p FROM Profesor p WHERE p.nombreProfesor = :nombreProfesor")
    , @NamedQuery(name = "Profesor.findByApellidoProfesor", query = "SELECT p FROM Profesor p WHERE p.apellidoProfesor = :apellidoProfesor")
    , @NamedQuery(name = "Profesor.findByDireccionPorfesor", query = "SELECT p FROM Profesor p WHERE p.direccionPorfesor = :direccionPorfesor")
    , @NamedQuery(name = "Profesor.findByTelefonoPorfesor", query = "SELECT p FROM Profesor p WHERE p.telefonoPorfesor = :telefonoPorfesor")
    , @NamedQuery(name = "Profesor.findByEdadProfesor", query = "SELECT p FROM Profesor p WHERE p.edadProfesor = :edadProfesor")})
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProfesor")
    private Integer idProfesor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreProfesor")
    private String nombreProfesor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellidoProfesor")
    private String apellidoProfesor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "direccionPorfesor")
    private String direccionPorfesor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "telefonoPorfesor")
    private String telefonoPorfesor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edadProfesor")
    private int edadProfesor;
    @OneToMany(mappedBy = "idProfesor")
    private Collection<DetallesCursoProfesor> detallesCursoProfesorCollection;
    @OneToMany(mappedBy = "idPorfesor")
    private Collection<DetallesProfesornivelFormativo> detallesProfesornivelFormativoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProfesor")
    private Collection<DetalleProfesorAsignatura> detalleProfesorAsignaturaCollection;

    public Profesor() {
    }

    public Profesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Profesor(Integer idProfesor, String nombreProfesor, String apellidoProfesor, String direccionPorfesor, String telefonoPorfesor, int edadProfesor) {
        this.idProfesor = idProfesor;
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.direccionPorfesor = direccionPorfesor;
        this.telefonoPorfesor = telefonoPorfesor;
        this.edadProfesor = edadProfesor;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public String getDireccionPorfesor() {
        return direccionPorfesor;
    }

    public void setDireccionPorfesor(String direccionPorfesor) {
        this.direccionPorfesor = direccionPorfesor;
    }

    public String getTelefonoPorfesor() {
        return telefonoPorfesor;
    }

    public void setTelefonoPorfesor(String telefonoPorfesor) {
        this.telefonoPorfesor = telefonoPorfesor;
    }

    public int getEdadProfesor() {
        return edadProfesor;
    }

    public void setEdadProfesor(int edadProfesor) {
        this.edadProfesor = edadProfesor;
    }

    @XmlTransient
    public Collection<DetallesCursoProfesor> getDetallesCursoProfesorCollection() {
        return detallesCursoProfesorCollection;
    }

    public void setDetallesCursoProfesorCollection(Collection<DetallesCursoProfesor> detallesCursoProfesorCollection) {
        this.detallesCursoProfesorCollection = detallesCursoProfesorCollection;
    }

    @XmlTransient
    public Collection<DetallesProfesornivelFormativo> getDetallesProfesornivelFormativoCollection() {
        return detallesProfesornivelFormativoCollection;
    }

    public void setDetallesProfesornivelFormativoCollection(Collection<DetallesProfesornivelFormativo> detallesProfesornivelFormativoCollection) {
        this.detallesProfesornivelFormativoCollection = detallesProfesornivelFormativoCollection;
    }

    @XmlTransient
    public Collection<DetalleProfesorAsignatura> getDetalleProfesorAsignaturaCollection() {
        return detalleProfesorAsignaturaCollection;
    }

    public void setDetalleProfesorAsignaturaCollection(Collection<DetalleProfesorAsignatura> detalleProfesorAsignaturaCollection) {
        this.detalleProfesorAsignaturaCollection = detalleProfesorAsignaturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfesor != null ? idProfesor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.idProfesor == null && other.idProfesor != null) || (this.idProfesor != null && !this.idProfesor.equals(other.idProfesor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebas.Profesor[ idProfesor=" + idProfesor + " ]";
    }
    
}
