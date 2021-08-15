package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.vCarga;
import vista.vHome;
import modelo.oCarga;
import modelo.mCarga;

public class CargarFormularioCarga implements ActionListener {

    private final vHome vp;
    private vCarga vc;
    private final Controlar_Distribucion cdist;
    private final oCarga mocarga;
    private final mCarga mmcarga;
    private final Jornada joda;

    public CargarFormularioCarga(vHome vp, vCarga vc, Controlar_Distribucion cdist, oCarga mocarga, mCarga mmcarga, Jornada joda) {
        this.vp = vp;
        this.vc = vc;
        this.cdist = cdist;
        this.mocarga = mocarga;
        this.mmcarga = mmcarga;
        this.joda = joda;
        this.vp.btnPrincipalDistribucion.addActionListener(this);
        this.vp.btnDistribucionCantidadAceptar.addActionListener(this);
        this.vp.btnDistribucionAnio.addActionListener(this);
        this.vp.btnDistribucionCarrera.addActionListener(this);
        this.vp.btnDistribucionCarreraAnio.addActionListener(this);
        this.vp.btnDistribucionTodo.addActionListener(this);
        this.vp.btnPrincipalMateria.addActionListener(this);
        this.vp.btndisponibilidadAceptar.addActionListener(this);
        this.vp.btndisponibilidadModificar.addActionListener(this);
        this.vp.btnPrincipalParametros.addActionListener(this);
        this.vp.btnparametroCiclo.addActionListener(this);
    }

    public void ocultar() {
        vp.lblDistribucionAnio.setVisible(false);
        vp.lblDistribucionAula.setVisible(false);
        vp.lblDistribucionCarrera.setVisible(false);
        vp.cmbDistribucionAula.setVisible(false);
        vp.cmbDistribucionCarrera.setVisible(false);
        vp.cmbDistribucionAnio.setVisible(false);
        vp.btnDistribucionAnio.setEnabled(false);
        vp.btnDistribucionCarrera.setEnabled(false);
        vp.btnDistribucionCarreraAnio.setEnabled(false);
        vp.btnDistribucionTodo.setEnabled(false);
    }

    public void mostrar() {
        vp.lblDistribucionAnio.setVisible(true);
        vp.lblDistribucionAula.setVisible(true);
        vp.lblDistribucionCarrera.setVisible(true);
        vp.cmbDistribucionAula.setVisible(true);
        vp.cmbDistribucionCarrera.setVisible(true);
        vp.cmbDistribucionAnio.setVisible(true);
        vp.btnDistribucionAnio.setEnabled(true);
        vp.btnDistribucionCarrera.setEnabled(true);
        vp.btnDistribucionCarreraAnio.setEnabled(true);
        vp.btnDistribucionTodo.setEnabled(true);
    }

    public void abrirFormularioCarga() {
        vc = new vCarga();
        vc.setTitle("DISTRIBUCIÓN DE GRUPOS POR AULA");
        vc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vc.setLocationRelativeTo(null);
        vc.setVisible(true);
        Carga cag = new Carga(vp, vc, cdist, mocarga, mmcarga, joda);
    }

    private void verificacion() {
        if (vp.cmbparametroAula.getSelectedIndex() == -1) {
            vp.cmbparametroAula.setEnabled(false);
            vp.btnParametroReporte.setEnabled(false);
            vp.btnParametroLimpiarCiclo.setEnabled(false);
        } else {
            vp.cmbparametroAula.setEnabled(true);
            vp.btnParametroReporte.setEnabled(true);
            vp.btnParametroLimpiarCiclo.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vp.btnPrincipalDistribucion) {
            ocultar();
            try {
                cdist.aulas();
            } catch (SQLException ex) {
                Logger.getLogger(CargarFormularioCarga.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (cdist.ca == 1) {
                vp.cmbDistribucionCantidad.setEnabled(true);
                vp.btnDistribucionCantidadAceptar.setEnabled(true);
                ocultar();
            } else if (cdist.ca == 2) {
                vp.cmbDistribucionCantidad.setEnabled(false);
                vp.btnDistribucionCantidadAceptar.setEnabled(false);
                ocultar();
            }
        }
        if (e.getSource() == vp.btnPrincipalParametros) {
            vp.cmbparametroAula.removeAllItems();
            cdist.llenarParametrocmbAula();
            verificacion();
        }
        if (e.getSource() == vp.btnparametroCiclo) {
            vp.cmbparametroAula.removeAllItems();
            cdist.llenarParametrocmbAula();
            verificacion();
        }
        if (e.getSource() == vp.btnDistribucionCantidadAceptar) {
            vp.cmbDistribucionAula.removeAllItems();
            vp.cmbDistribucionCarrera.removeAllItems();
            cdist.llenarcmbAulaDistribucion();
            cdist.llenarcmbDistribucionCarrera();
            if (vp.cmbDistribucionAula.getSelectedIndex() == -1) {
                ocultar();
                JOptionPane.showMessageDialog(null, "¡NI UN AULA CUMPLE CON LA CANTIDAD DE ALUMNOS!");
            } else {
                if (vp.cmbDistribucionCarrera.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(null, "¡DEBE INGRESAR AL MENOS UNA CARRERA!");
                } else {
                    mostrar();                    
                }
            }
        }
////////////////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnDistribucionAnio) {
            ocultar();
            abrirFormularioCarga();
            cdist.limpiarTablaDistribucion();
            cdist.listarTablaCarga(vCarga.tblCarga);
            cdist.llenarcmbCargaDocente();
            vCarga.cmbCargaMateria.removeAllItems();
            cdist.distribucionAnio();
        }
        if (e.getSource() == vp.btnDistribucionCarrera) {
            ocultar();
            abrirFormularioCarga();
            cdist.limpiarTablaDistribucion();
            cdist.listarTablaCarga(vCarga.tblCarga);
            cdist.llenarcmbCargaDocente();
            vCarga.cmbCargaMateria.removeAllItems();
            cdist.distribucionCarrera();
        }
        if (e.getSource() == vp.btnDistribucionCarreraAnio) {
            ocultar();
            abrirFormularioCarga();
            cdist.limpiarTablaDistribucion();
            cdist.listarTablaCarga(vCarga.tblCarga);
            cdist.llenarcmbCargaDocente();
            vCarga.cmbCargaMateria.removeAllItems();
            cdist.distribucionCarreraAnio();
        }
        if (e.getSource() == vp.btnDistribucionTodo) {
            ocultar();
            abrirFormularioCarga();
            cdist.limpiarTablaDistribucion();
            cdist.listarTablaCarga(vCarga.tblCarga);
            cdist.llenarcmbCargaDocente();
            vCarga.cmbCargaMateria.removeAllItems();
            cdist.distribucionTodo();
        }
////////////////////////////          EXTRA            /////////////////////////
///////////          RECICLANDO METODOS PARA OTROS MODULOS          ////////////
        if (e.getSource() == vp.btnPrincipalMateria) {
            vp.cmbMateriaCarrera.removeAllItems();
            cdist.llenarcmbAulaMateria();
        }
        if (e.getSource() == vp.btndisponibilidadAceptar) {
            cdist.limpiarTablaDisponibilidad();
            cdist.listarTablaDisponibilidad(vHome.tblDisponibilidad);
        }
        if (e.getSource() == vp.btndisponibilidadModificar) {
            int f = vHome.tblDisponibilidad.getSelectedRow();
            int c = vHome.tblDisponibilidad.getSelectedColumn();
            if (f == -1) {
                JOptionPane.showMessageDialog(null, "¡DEBE SELECCIONAR UN CAMPO!");
            } else {
                if (vHome.tblDisponibilidad.getValueAt(f, c).equals("")) {
                    vHome.tblDisponibilidad.setValueAt("NO", f, c);
                    cdist.modificarDisponibilidadAula();
                    vp.btndisponibilidadModificar.setEnabled(false);
                    vp.btndisponibilidadCancelar.setEnabled(false);
                    vp.btndisponibilidadAceptar.setEnabled(true);
                } else if (vHome.tblDisponibilidad.getValueAt(f, c).equals("NO")) {
                    vHome.tblDisponibilidad.setValueAt("", f, c);
                    cdist.modificarDisponibilidadAula();
                    vp.btndisponibilidadModificar.setEnabled(false);
                    vp.btndisponibilidadCancelar.setEnabled(false);
                    vp.btndisponibilidadAceptar.setEnabled(true);
                }
            }
        }
    }

}
