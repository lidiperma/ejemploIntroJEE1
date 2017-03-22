/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "detalles_Curso_Asignatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallesCursoAsignatura.findAll", query = "SELECT d FROM DetallesCursoAsignatura d")
    , @NamedQuery(name = "DetallesCursoAsignatura.findByIdDetalleCurso", query = "SELECT d FROM DetallesCursoAsignatura d WHERE d.idDetalleCurso = :idDetalleCurso")})
public class DetallesCursoAsignatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDetalleCurso")
    private Integer idDetalleCurso;
    @JoinColumn(name = "idAsignatura", referencedColumnName = "idAsignatura")
    @ManyToOne
    private Asignatura idAsignatura;
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")
    @ManyToOne
    private Curso idCurso;

    public DetallesCursoAsignatura() {
    }

    public DetallesCursoAsignatura(Integer idDetalleCurso) {
        this.idDetalleCurso = idDetalleCurso;
    }

    public Integer getIdDetalleCurso() {
        return idDetalleCurso;
    }

    public void setIdDetalleCurso(Integer idDetalleCurso) {
        this.idDetalleCurso = idDetalleCurso;
    }

    public Asignatura getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Asignatura idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleCurso != null ? idDetalleCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesCursoAsignatura)) {
            return false;
        }
        DetallesCursoAsignatura other = (DetallesCursoAsignatura) object;
        if ((this.idDetalleCurso == null && other.idDetalleCurso != null) || (this.idDetalleCurso != null && !this.idDetalleCurso.equals(other.idDetalleCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebas.DetallesCursoAsignatura[ idDetalleCurso=" + idDetalleCurso + " ]";
    }
    
}
