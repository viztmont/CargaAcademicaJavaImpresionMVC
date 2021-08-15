package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.mAula;
import vista.vHome;

public class Disponibilidad implements ActionListener {
    
    private final vHome vp;
    private final mAula momaula;

    public Disponibilidad(vHome vp, mAula momaula) {
        this.vp = vp;
        this.momaula = momaula;
        this.vp.btnPrincipalDiponible.addActionListener(this);
        this.vp.btndisponibilidadAceptar.addActionListener(this);
        this.vp.btndisponibilidadModificar.addActionListener(this);
        this.vp.btndisponibilidadCancelar.addActionListener(this);
        this.vp.btnparametroCiclo.addActionListener(this);
    }

    public void deshabilitar() {
        vp.btndisponibilidadModificar.setEnabled(false);
        vp.btndisponibilidadCancelar.setEnabled(false);
        vp.btndisponibilidadAceptar.setEnabled(true);
    }

    public void habilitar() {
        vp.btndisponibilidadModificar.setEnabled(true);
        vp.btndisponibilidadCancelar.setEnabled(true);
        vp.btndisponibilidadAceptar.setEnabled(false);
    }

    public void aula() {
        String paridad = vp.txtparametroCiclodb.getText();
        List<mAula> list = momaula.llenarcmbAula(paridad);
        for (int i = 0; i < list.size(); i++) {
            vp.cmbdisponibilidadAula.addItem(list.get(i).getCodigo());
        }
    }

    public void modificar() {
        int f = vHome.tblDisponibilidad.getSelectedRow();
        int c = vHome.tblDisponibilidad.getSelectedColumn();
        if (f == -1) {
            JOptionPane.showMessageDialog(null, "¡DEBE SELECCIONAR UN CAMPO!");
        } else {
            deshabilitar();
            if (vHome.tblDisponibilidad.getValueAt(f, c).equals("")) {
                vHome.tblDisponibilidad.setValueAt("NO", f, c);
            } else if (vHome.tblDisponibilidad.getValueAt(f, c).equals("")) {
                vHome.tblDisponibilidad.setValueAt("", f, c);
            }
        }
    }
    
    public void limpiarTabla() {
        DefaultTableModel mTDisponibilidad = (DefaultTableModel)vHome.tblDisponibilidad.getModel();
        for (int i = 0; i < vHome.tblDisponibilidad.getRowCount(); i++) {            
            mTDisponibilidad.removeRow(i);
            
            i = i - 1;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vp.btnPrincipalDiponible) {
            limpiarTabla();
            vp.cmbdisponibilidadAula.removeAllItems();
            aula();
            if (vp.cmbdisponibilidadAula.getSelectedIndex() == -1) {
                vp.btndisponibilidadModificar.setEnabled(false);
                vp.btndisponibilidadCancelar.setEnabled(false);
                vp.btndisponibilidadAceptar.setEnabled(false);
                vp.cmbdisponibilidadAula.setEnabled(false);
            } else {
                vp.cmbdisponibilidadAula.setEnabled(true);
                vp.btndisponibilidadAceptar.setEnabled(true);
                vp.txtdisponibilidadAula.setText(vp.cmbdisponibilidadAula.getSelectedItem().toString());
                deshabilitar();
            }
        }
        if (e.getSource() == vp.btndisponibilidadAceptar) {
            habilitar();
        }

        if (e.getSource() == vp.btndisponibilidadCancelar) {
            deshabilitar();
            limpiarTabla();
        }
    }

}
