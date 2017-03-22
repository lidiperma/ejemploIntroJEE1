/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "Curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")
    , @NamedQuery(name = "Curso.findByIdCurso", query = "SELECT c FROM Curso c WHERE c.idCurso = :idCurso")
    , @NamedQuery(name = "Curso.findByNombreCurso", query = "SELECT c FROM Curso c WHERE c.nombreCurso = :nombreCurso")
    , @NamedQuery(name = "Curso.findByFechaInicio", query = "SELECT c FROM Curso c WHERE c.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Curso.findByFechaFin", query = "SELECT c FROM Curso c WHERE c.fechaFin = :fechaFin")
    , @NamedQuery(name = "Curso.findByPrecio", query = "SELECT c FROM Curso c WHERE c.precio = :precio")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCurso")
    private Integer idCurso;
    @Size(max = 50)
    @Column(name = "nombreCurso")
    private String nombreCurso;
    @Size(max = 50)
    @Column(name = "fechaInicio")
    private String fechaInicio;
    @Size(max = 50)
    @Column(name = "fechaFin")
    private String fechaFin;
    @Column(name = "precio")
    private Integer precio;
    @OneToMany(mappedBy = "idCurso")
    private Collection<DetallesCursoProfesor> detallesCursoProfesorCollection;
    @OneToMany(mappedBy = "idCurso")
    private Collection<DetallesCursoAlumno> detallesCursoAlumnoCollection;
    @OneToMany(mappedBy = "idCurso")
    private Collection<DetallesCursoAsignatura> detallesCursoAsignaturaCollection;

    public Curso() {
    }

    public Curso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @XmlTransient
    public Collection<DetallesCursoProfesor> getDetallesCursoProfesorCollection() {
        return detallesCursoProfesorCollection;
    }

    public void setDetallesCursoProfesorCollection(Collection<DetallesCursoProfesor> detallesCursoProfesorCollection) {
        this.detallesCursoProfesorCollection = detallesCursoProfesorCollection;
    }

    @XmlTransient
    public Collection<DetallesCursoAlumno> getDetallesCursoAlumnoCollection() {
        return detallesCursoAlumnoCollection;
    }

    public void setDetallesCursoAlumnoCollection(Collection<DetallesCursoAlumno> detallesCursoAlumnoCollection) {
        this.detallesCursoAlumnoCollection = detallesCursoAlumnoCollection;
    }

    @XmlTransient
    public Collection<DetallesCursoAsignatura> getDetallesCursoAsignaturaCollection() {
        return detallesCursoAsignaturaCollection;
    }

    public void setDetallesCursoAsignaturaCollection(Collection<DetallesCursoAsignatura> detallesCursoAsignaturaCollection) {
        this.detallesCursoAsignaturaCollection = detallesCursoAsignaturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.idCurso == null && other.idCurso != null) || (this.idCurso != null && !this.idCurso.equals(other.idCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebas.Curso[ idCurso=" + idCurso + " ]";
    }
    
}
