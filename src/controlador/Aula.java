package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.mAula;
import vista.vHome;

public class Aula implements ActionListener {

    DefaultTableModel dtmAula = new DefaultTableModel();
    private final mAula mmaula;
    private final vHome vp;
    private int tipo;

    public Aula(mAula mmaula, vHome vp) {
        this.mmaula = mmaula;
        this.vp = vp;
        this.vp.btnPrincipalAula.addActionListener(this);
        this.vp.btnAulaAgregar.addActionListener(this);
        this.vp.btnAulaModificar.addActionListener(this);
        this.vp.btnAulaEliminar.addActionListener(this);
        this.vp.btnAulaGuardar.addActionListener(this);
        this.vp.btnAulaCancelar.addActionListener(this);
    }

    public void ocultarPanel() {
        vp.panelAulaDatos.setVisible(false);
        vp.lblAulaRegistrar.setVisible(false);
        vp.lblAulaModificar.setVisible(false);
        vp.lblAulaCodigo.setVisible(false);
        vp.txtAulaCodigo.setVisible(false);
        vp.txtAulaCodigo.setEnabled(false);
        vp.lblAulaNombre.setVisible(false);
        vp.txtAulaNombre.setVisible(false);
        vp.lblAulaDescripcion.setVisible(false);
        vp.cmbAulaDescripcion.setVisible(false);
        vp.btnAulaGuardar.setVisible(false);
        vp.btnAulaCancelar.setVisible(false);
        vp.btnAulaAgregar.setEnabled(true);
        vp.btnAulaModificar.setEnabled(true);
        vp.btnAulaEliminar.setEnabled(true);
    }

    public void mostrarPanel() {
        vp.panelAulaDatos.setVisible(true);
        vp.lblAulaRegistrar.setVisible(true);
        vp.lblAulaModificar.setVisible(true);
        vp.lblAulaCodigo.setVisible(true);
        vp.txtAulaCodigo.setVisible(true);
        vp.txtAulaCodigo.setEnabled(true);
        vp.lblAulaNombre.setVisible(true);
        vp.txtAulaNombre.setVisible(true);
        vp.lblAulaDescripcion.setVisible(true);
        vp.cmbAulaDescripcion.setVisible(true);
        vp.btnAulaGuardar.setVisible(true);
        vp.btnAulaCancelar.setVisible(true);
        vp.btnAulaAgregar.setEnabled(true);
        vp.btnAulaModificar.setEnabled(true);
        vp.btnAulaEliminar.setEnabled(true);
    }

    public void deshabilitar() {
        vp.btnAulaAgregar.setEnabled(false);
        vp.btnAulaModificar.setEnabled(false);
        vp.btnAulaEliminar.setEnabled(false);
        vp.txtAulaCodigo.setText("");
        vp.txtAulaNombre.setText("");
    }

    public void habilitar() {
        vp.btnAulaAgregar.setEnabled(true);
        vp.btnAulaModificar.setEnabled(true);
        vp.btnAulaEliminar.setEnabled(true);        
    }

    public void listarAula(JTable tabla) {
        String[] titulo = {"Código", "Nombre", "Descripción"};
        dtmAula = new DefaultTableModel(null, titulo);
        String paridad = vp.txtparametroCiclodb.getText();
        List<mAula> lista = mmaula.listarAula(paridad);
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getCodigo();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getTamano();
            dtmAula.addRow(object);
        }
        vHome.tblAula.setModel(dtmAula);
    }

    public void agregarAula() {
        mmaula.setCodigo(vp.txtAulaCodigo.getText());        
        mmaula.setNombre(vp.txtAulaNombre.getText());
        mmaula.setTamano(vp.cmbAulaDescripcion.getSelectedItem().toString());
        mmaula.setParidad(vp.txtparametroCiclodb.getText());        
        if (mmaula.registrarAula(mmaula)) {
            String aulax = vp.txtAulaCodigo.getText();
            mmaula.crearTAX(aulax);
            mmaula.registrarTAX(aulax);
            listarAula(vHome.tblAula);
        } else {
            JOptionPane.showMessageDialog(null, "¡ERROR AL GUARDAR!");
        }
    }

    public void modificarAula() {
        mmaula.setCodigo(vp.txtAulaCodigo.getText());
        mmaula.setNombre(vp.txtAulaNombre.getText());
        mmaula.setTamano(vp.cmbAulaDescripcion.getSelectedItem().toString());
        if (mmaula.modificar(mmaula)) {
            listarAula(vHome.tblAula);
        }
    }

    public void eliminarAula() {
        int fila = vHome.tblAula.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "¡DEBE DE SELECCIONAR UN CAMPO!");
        } else {
            String Codigo = (String) vHome.tblAula.getValueAt(fila, 0);
            mmaula.setCodigo(Codigo);
            if (mmaula.eliminar(mmaula)) {
                JOptionPane.showMessageDialog(null, "¡AULA ELIMINADA CORRECTAMENTE!");
                listarAula(vHome.tblAula);
                mmaula.eliminarTAX(Codigo);
            } else {
                JOptionPane.showMessageDialog(null, "¡ERROR AL ELIMINAR AULA!");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vp.btnPrincipalAula) {
            ocultarPanel();
            listarAula(vHome.tblAula);
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnAulaAgregar) {
            mostrarPanel();
            deshabilitar();
            vp.lblAulaModificar.setVisible(false);
            vp.txtAulaCodigo.setEditable(true);
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnAulaModificar) {
            int fila = vHome.tblAula.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "¡DEBE DE SELECCIONAR UN CAMPO!");
            } else {
                vp.lblAulaModificar.setVisible(true);
                vp.txtAulaCodigo.setEditable(false);
                mostrarPanel();
                deshabilitar();
                String codigoa = (String) vHome.tblAula.getValueAt(fila, 0);
                String nombrea = (String) vHome.tblAula.getValueAt(fila, 1);
                vp.txtAulaCodigo.setText(codigoa);
                vp.txtAulaNombre.setText(nombrea);
                tipo = 2;
            }
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnAulaEliminar) {
            eliminarAula();
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnAulaGuardar) {
            if (vp.txtAulaCodigo.getText().equals("") || vp.txtAulaNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "¡DEBE INGRESAR LOS CAMPOS CORRESPONDIENTES!");
            } else {
                if (tipo == 1) {
                    agregarAula();
                } else if (tipo == 2) {
                    modificarAula();
                }
                ocultarPanel();
                agregarAula();
            }
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnAulaCancelar) {
            ocultarPanel();
        }
    }

}
