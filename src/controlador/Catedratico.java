package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.vHome;
import modelo.mCatedratico;

public class Catedratico implements ActionListener {

    DefaultTableModel dtmCatedratico = new DefaultTableModel();
    private final mCatedratico momcatedratico;
    private final vHome vp;
    private int tipo;

    public Catedratico(mCatedratico momcatedratico, vHome vp) {
        this.momcatedratico = momcatedratico;
        this.vp = vp;
        this.vp.btnPrincipalCatedratico.addActionListener(this);
        this.vp.btnCatedraticoAgregar.addActionListener(this);
        this.vp.btnCatedraticoModificar.addActionListener(this);
        this.vp.btnCatedraticoEliminar.addActionListener(this);
        this.vp.btnCatedraticoGuardar.addActionListener(this);
        this.vp.btnCatedraticoCancelar.addActionListener(this);
    }

    public void ocultarPanel() {
        vp.panelCatedraticoDatos.setVisible(false);
        vp.lblCatedraticoRegistrar.setVisible(false);
        vp.lblCatedraticoModificar.setVisible(false);
        vp.lblCatedraticoCodigo.setVisible(false);
        vp.txtCatedraticoCodigo.setVisible(false);
        vp.lblCatedraticoNombres.setVisible(false);
        vp.txtCatedraticoNombres.setVisible(false);
        vp.lblCarreraDescripcion.setVisible(false);
        vp.lblCatedraticoApellidos.setVisible(false);
        vp.txtCatedraticoApellidos.setVisible(false);
        vp.lblCatedraticoMaterias.setVisible(false);
        vp.txtCatedraticoMateriasxCiclo.setVisible(false);
        vp.btnCatedraticoAgregar.setVisible(true);
        vp.btnCatedraticoModificar.setVisible(true);
        vp.btnCatedraticoEliminar.setVisible(true);
        vp.btnCatedraticoGuardar.setVisible(false);
        vp.btnCatedraticoCancelar.setVisible(false);
        //       
        vp.btnCatedraticoAgregar.setEnabled(true);
        vp.btnCatedraticoModificar.setEnabled(true);
        vp.btnCatedraticoEliminar.setEnabled(true);
    }

    public void mostrarPanel() {
        vp.panelCatedraticoDatos.setVisible(true);
        vp.lblCatedraticoCodigo.setVisible(true);
        vp.txtCatedraticoCodigo.setVisible(true);
        vp.lblCatedraticoNombres.setVisible(true);
        vp.txtCatedraticoNombres.setVisible(true);
        vp.lblCarreraDescripcion.setVisible(true);
        vp.lblCatedraticoApellidos.setVisible(true);
        vp.txtCatedraticoApellidos.setVisible(true);
        vp.lblCatedraticoMaterias.setVisible(true);
        vp.txtCatedraticoMateriasxCiclo.setVisible(true);
        vp.btnCatedraticoAgregar.setEnabled(false);
        vp.btnCatedraticoModificar.setEnabled(false);
        vp.btnCatedraticoEliminar.setEnabled(false);
        vp.btnCatedraticoGuardar.setVisible(true);
        vp.btnCatedraticoCancelar.setVisible(true);
    }

    private void habilitar() {
        vp.btnCatedraticoAgregar.setEnabled(true);
        vp.btnCatedraticoModificar.setEnabled(true);
        vp.btnCatedraticoEliminar.setEnabled(true);
        vp.txtCatedraticoCodigo.setText("");
        vp.txtCatedraticoNombres.setText("");
        vp.txtCatedraticoApellidos.setText("");
        vp.txtCatedraticoMateriasxCiclo.setText("");
    }

    private void listarCatedratico() {
        String[] titulo = {"Código", "Nombres", "Apellidos", "Utilizadas"};
        dtmCatedratico = new DefaultTableModel(null, titulo);
        List<mCatedratico> lista = momcatedratico.listarCatedratico();
        Object[] object = new Object[4];
        if (vp.txtparametroCiclodb.getText().equals("I")) {
            for (int i = 0; i < lista.size(); i++) {
                object[0] = lista.get(i).getCodigo();
                object[1] = lista.get(i).getNombres();
                object[2] = lista.get(i).getApellidos();
                object[3] = lista.get(i).getPrimero();
                dtmCatedratico.addRow(object);
            }
        } else if (vp.txtparametroCiclodb.getText().equals("II")) {
            for (int i = 0; i < lista.size(); i++) {
                object[0] = lista.get(i).getCodigo();
                object[1] = lista.get(i).getNombres();
                object[2] = lista.get(i).getApellidos();
                object[3] = lista.get(i).getSegundo();
                dtmCatedratico.addRow(object);
            }
        }

        vHome.tblCatedratico.setModel(dtmCatedratico);
    }

    public void agregarCatedratico() {
        momcatedratico.setCodigo(vp.txtCatedraticoCodigo.getText());
        momcatedratico.setNombres(vp.txtCatedraticoNombres.getText());
        momcatedratico.setApellidos(vp.txtCatedraticoApellidos.getText());
        int casig = Integer.parseInt(vp.txtCatedraticoMateriasxCiclo.getText());
        casig = casig * 5;
        momcatedratico.setPrimero(casig);
        momcatedratico.setSegundo(casig);
        if (momcatedratico.registrarCatedratico(momcatedratico)) {
            listarCatedratico();
        }
    }

    public void modificarCatedratico() {
        momcatedratico.setCodigo(vp.txtCatedraticoCodigo.getText());
        momcatedratico.setNombres(vp.txtCatedraticoNombres.getText());
        momcatedratico.setApellidos(vp.txtCatedraticoApellidos.getText());
        int horas = Integer.parseInt(vp.txtCatedraticoMateriasxCiclo.getText()) * 5;
        String ciclo = "";
        if (vp.txtparametroCiclodb.getText().equals("I")) {ciclo = "LibresI";} 
        else if (vp.txtparametroCiclodb.getText().equals("II")) {ciclo = "LibresII";}
        if (momcatedratico.modificarCatedratico(momcatedratico, ciclo, horas)) {
            listarCatedratico();
        }
    }

    public void eleminarCatedratico() {
        int f = vHome.tblCatedratico.getSelectedRow();
        if (f == -1) {
            JOptionPane.showMessageDialog(null, "¡DEBE SELECCIONAR UN CAMPO!");
        } else {
            momcatedratico.setCodigo((String) vHome.tblCatedratico.getValueAt(f, 0));
            if (momcatedratico.eliminarCatedratico(momcatedratico)) {
                listarCatedratico();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vp.btnPrincipalCatedratico) {
            ocultarPanel();
            listarCatedratico();
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCatedraticoAgregar) {
            mostrarPanel();
            vp.lblCatedraticoRegistrar.setVisible(false);
            vp.txtCatedraticoCodigo.setEnabled(true);
            tipo = 1;
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCatedraticoModificar) {
            int f = vHome.tblCatedratico.getSelectedRow();
            if (f == -1) {
                JOptionPane.showMessageDialog(null, "¡DEBE SELECCIONAR UN CAMPO!");
            } else {
                mostrarPanel();
                vp.lblCatedraticoModificar.setVisible(false);
                vp.txtCatedraticoCodigo.setEnabled(false);
                tipo = 2;
                vp.txtCatedraticoCodigo.setText((String) vHome.tblCatedratico.getValueAt(f, 0));
                vp.txtCatedraticoNombres.setText((String) vHome.tblCatedratico.getValueAt(f, 1));
                vp.txtCatedraticoApellidos.setText((String) vHome.tblCatedratico.getValueAt(f, 2));
                Object d = vHome.tblCatedratico.getValueAt(f, 3);
                String materias = String.valueOf(d);
                int tuplatre = Integer.parseInt(materias);
                tuplatre = tuplatre / 5;
                vp.txtCatedraticoMateriasxCiclo.setText("" + tuplatre);
            }
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCatedraticoEliminar) {
            eleminarCatedratico();
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCatedraticoGuardar) {
            if (vp.txtCatedraticoCodigo.getText().equals("") || vp.txtCatedraticoNombres.getText().equals("")
                    || vp.txtCatedraticoApellidos.getText().equals("") || vp.txtCatedraticoMateriasxCiclo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "¡DEBE INGRESAR LOS CAMPOS CORRESPONDIENTES!");
            } else {
                if (tipo == 1) {
                    agregarCatedratico();
                } else if (tipo == 2) {
                    modificarCatedratico();
                }
                ocultarPanel();
                habilitar();
            }
        }///////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnCatedraticoCancelar) {
            ocultarPanel();
            habilitar();
        }///////////////////////////////////////////////////////////////////////
    }

}
