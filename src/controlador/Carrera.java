package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.mCarrera;
import vista.vHome;

public class Carrera implements ActionListener {

    DefaultTableModel dtmCarrera = new DefaultTableModel();
    private final mCarrera momcarrera;
    private final vHome vp;
    private int tipo;

    public Carrera(mCarrera momcarrera, vHome vp) {
        this.momcarrera = momcarrera;
        this.vp = vp;
        this.vp.btnPrincipalCarrera.addActionListener(this);
        this.vp.btnCarreraAgregar.addActionListener(this);
        this.vp.btnCarreraModificar.addActionListener(this);
        this.vp.btnCarreraEliminar.addActionListener(this);
        this.vp.btnCarreraGuardar.addActionListener(this);
        this.vp.btnCarreraCancelar.addActionListener(this);
    }

    public void ocultarPanel() {
        vp.panelCarreraDatos.setVisible(false);
        vp.lblCarreraRegistrar.setVisible(false);
        vp.lblCarreraModificar.setVisible(false);
        vp.lblCarreraCodigo.setVisible(false);
        vp.txtCarreraCodigo.setVisible(false);
        vp.lblCarreraNombre.setVisible(false);
        vp.txtCarreraNombre.setVisible(false);
        vp.lblCarreraDescripcion.setVisible(false);
        vp.btnCarreraAgregar.setVisible(true);
        vp.btnCarreraModificar.setVisible(true);
        vp.btnCarreraEliminar.setVisible(true);
        vp.btnCarreraGuardar.setVisible(false);
        vp.btnCarreraCancelar.setVisible(false);
        //
        vp.btnCarreraAgregar.setEnabled(true);
        vp.btnCarreraModificar.setEnabled(true);
        vp.btnCarreraEliminar.setEnabled(true);
    }

    public void mostrarPanel() {
        vp.panelCarreraDatos.setVisible(true);
        vp.lblCarreraCodigo.setVisible(true);
        vp.txtCarreraCodigo.setVisible(true);
        vp.lblCarreraNombre.setVisible(true);
        vp.txtCarreraNombre.setVisible(true);
        vp.lblCarreraDescripcion.setVisible(true);
        vp.btnCarreraAgregar.setVisible(true);
        vp.btnCarreraModificar.setVisible(true);
        vp.btnCarreraEliminar.setVisible(true);
        vp.btnCarreraGuardar.setVisible(true);
        vp.btnCarreraCancelar.setVisible(true);
    }

    public void deshabilitar() {
        vp.btnCarreraAgregar.setEnabled(false);
        vp.btnCarreraModificar.setEnabled(false);
        vp.btnCarreraEliminar.setEnabled(false);
    }

    public void habilitar() {
        vp.btnCarreraAgregar.setEnabled(true);
        vp.btnCarreraModificar.setEnabled(true);
        vp.btnCarreraEliminar.setEnabled(true);
        vp.txtCarreraCodigo.setText("");
        vp.txtCarreraNombre.setText("");
        vp.txtCarreraCodigo.setEditable(true);
    }

    public void listarCarrera(JTable tabla) {
        String[] titulo = {"Código", "Nombre", "Descripción"};
        dtmCarrera = new DefaultTableModel(null, titulo);
        List<mCarrera> lista = momcarrera.listarCarrera();
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getCarreraCodigo();
            object[1] = lista.get(i).getCarreraNombre();
            object[2] = lista.get(i).getCarreraDescripcion();
            dtmCarrera.addRow(object);
        }
        vHome.tblCarrera.setModel(dtmCarrera);
    }

    public void agregarCarrera() {
        momcarrera.setCarreraCodigo(vp.txtCarreraCodigo.getText());
        momcarrera.setCarreraNombre(vp.txtCarreraNombre.getText());
        momcarrera.setCarreraDescripcion(vp.txtCarreraDescripcion.getText());
        if (momcarrera.registrarCarrera(momcarrera)) {
            listarCarrera(vHome.tblCarrera);
        } else {
            JOptionPane.showMessageDialog(null, "¡ERROR AL GUARDAR LA CARRERA!");
        }
    }

    public void modificarCarrera() {
        momcarrera.setCarreraCodigo(vp.txtCarreraCodigo.getText());
        momcarrera.setCarreraNombre(vp.txtCarreraNombre.getText());
        momcarrera.setCarreraDescripcion(vp.txtCarreraDescripcion.getText());
        if (momcarrera.modificarCarrera(momcarrera)) {
            listarCarrera(vHome.tblCarrera);
        } else {
            JOptionPane.showMessageDialog(null, "¡ERROR AL MODIFICAR LA CARRERA!");
        }
    }

    public void modificarMateriascarrera() {
        int f = vHome.tblCarrera.getSelectedRow();
        String nom = (String) vHome.tblCarrera.getValueAt(f, 1);
        momcarrera.setCarreraNombre(nom);
        momcarrera.setCarreraNombreNuevo(vp.txtCarreraNombre.getText());
        if (momcarrera.modificarMateriaCarrera(momcarrera)) {            
        }else{
            JOptionPane.showMessageDialog(null, "¡ERROR AL CAMBIAR EL NOMBRE DE LA CARRERA EN MATERIAS!");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vp.btnPrincipalCarrera) {
            listarCarrera(vHome.tblCarrera);
            ocultarPanel();
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCarreraAgregar) {
            mostrarPanel();
            deshabilitar();
            vp.lblCarreraRegistrar.setVisible(true);
            tipo = 1;
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCarreraModificar) {
            int fila = vHome.tblCarrera.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "¡DEBE SELECCIONAR UN CAMPO!");
            } else {
                vp.txtCarreraCodigo.setText((String) vHome.tblCarrera.getValueAt(fila, 0));
                vp.txtCarreraCodigo.setEditable(false);
                mostrarPanel();
                deshabilitar();
                vp.lblCarreraModificar.setVisible(true);
                tipo = 2;
            }
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCarreraEliminar) {
            int fila = vHome.tblCarrera.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "¡DEBE SELECCIONAR UN CAMPO!");
            } else {
                String Codigo = (String) vHome.tblCarrera.getValueAt(fila, 0);
                momcarrera.setCarreraCodigo(Codigo);
                if (momcarrera.eliminarCarrera(momcarrera)) {
                    String nom = (String) vHome.tblCarrera.getValueAt(fila, 1);
                    momcarrera.setCarreraNombre(nom);
                    if (momcarrera.eliminarMateriaCarrera(momcarrera)) {
                    }else{
                        JOptionPane.showMessageDialog(null, "¡ERROR AL ELIMINAR MATERIAS");
                    }
                    listarCarrera(vHome.tblCarrera);
                } else {
                    JOptionPane.showMessageDialog(null, "¡ERROR AL ELIMINAR CARRERA!");
                }
            }
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCarreraGuardar) {
            if (vp.txtCarreraCodigo.getText().equals("") || vp.txtCarreraNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "¡DEBE INGRESAR LOS CAMPOS CORRESPONDIENTES!");
            } else {
                if (tipo == 1) {
                    agregarCarrera();
                } else if (tipo == 2) {
                    modificarMateriascarrera();
                    modificarCarrera();
                }
                ocultarPanel();
                habilitar();
                listarCarrera(vHome.tblCarrera);
            }

        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCarreraCancelar) {
            ocultarPanel();
            habilitar();
        }///////////////////////////////////////////////////////////////////////
    }

}
