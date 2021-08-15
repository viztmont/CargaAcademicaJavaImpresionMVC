package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.mUsuarios;
import modelo.oDistribucion;
import modelo.mDistribucion;
import vista.vHome;
import vista.vAula;

public class Parametros implements ActionListener {

    private final vHome vp;
    private final mUsuarios momusuarios;
    private vAula va;
    private final oDistribucion modist;
    private final mDistribucion mmdist;
    private int tipo;
    DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
    DefaultTableCellRenderer AlinearH = new DefaultTableCellRenderer();
    DefaultTableModel dtmReporte = new DefaultTableModel();

    public Parametros(vHome vp, mUsuarios momusuarios, vAula va, oDistribucion modist, mDistribucion mmdist) {
        this.vp = vp;
        this.va = va;
        this.modist = modist;
        this.mmdist = mmdist;
        this.momusuarios = momusuarios;
        this.vp.btnPrincipalParametros.addActionListener(this);
        this.vp.btbParametroAgregar.addActionListener(this);
        this.vp.btnParametroModificar.addActionListener(this);
        this.vp.btnParametroEliminar.addActionListener(this);
        this.vp.btnParametroGuardar.addActionListener(this);
        this.vp.btnParametroCancelar.addActionListener(this);
        this.vp.btnparametroCiclo.addActionListener(this);
        this.vp.btnParametroReporte.addActionListener(this);
        this.vp.btnParametroLimpiarCiclo.addActionListener(this);
        this.va.btnpdf.addActionListener(this);
    }

    private void usuarios() {
        List<mUsuarios> list = momusuarios.listarUsuarios();
        vp.cmbParametroUsuarios.removeAllItems();
        for (int i = 0; i < list.size(); i++) {
            vp.cmbParametroUsuarios.addItem(list.get(i).getUsuario());
        }
    }

    private void deshabilitar() {
        vp.txtparametroUsuario.setEnabled(false);
        vp.ptxtparametroContra.setEnabled(false);
        vp.btnParametroGuardar.setEnabled(false);
        vp.btnParametroCancelar.setEnabled(false);
    }

    private void habilitar() {
        vp.txtparametroUsuario.setEnabled(true);
        vp.ptxtparametroContra.setEnabled(true);
        vp.btnParametroGuardar.setEnabled(true);
        vp.btnParametroCancelar.setEnabled(true);
    }

    private void des() {
        vp.btbParametroAgregar.setEnabled(false);
        vp.btnParametroModificar.setEnabled(false);
        vp.btnParametroEliminar.setEnabled(false);
    }

    private void hab() {
        vp.btbParametroAgregar.setEnabled(true);
        vp.btnParametroModificar.setEnabled(true);
        vp.btnParametroEliminar.setEnabled(true);
        vp.txtparametroUsuario.setText("");
        vp.ptxtparametroContra.setText("");
    }

    private void agregarUsuario() {
        momusuarios.setUsuario(vp.txtparametroUsuario.getText());
        String usuario = "";
        if (momusuarios.buscarUsuario(momusuarios)) {
            usuario = momusuarios.getUsuario();
        }
        if (usuario.equals(vp.txtparametroUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "¡EL USUARIO YA EXISTE, POR FAVOR INGRESE UNO NUEVO!");
        } else {
            momusuarios.setUsuario(vp.txtparametroUsuario.getText());
            momusuarios.setContrasena(vp.ptxtparametroContra.getText());
            momusuarios.setTipo("normal");
            momusuarios.registrarUsuario(momusuarios);
        }
    }

    private void modificarUsuario() {
        momusuarios.setUser(vp.cmbParametroUsuarios.getSelectedItem().toString());
        momusuarios.setUsuario(vp.txtparametroUsuario.getText());
        momusuarios.setContrasena(vp.ptxtparametroContra.getText());
        momusuarios.modificarUsuario(momusuarios);
    }

    private void eliminarUsuario() {
        momusuarios.setUsuario(vp.txtparametroUsuario.getText());
        momusuarios.eliminarUsuario(momusuarios);
    }

    public void parametro() {
        momusuarios.setNomp(vp.cmbparametroCiclo.getSelectedItem().toString());
        if (momusuarios.cambioCiclo(momusuarios)) {
            vp.txtparametroCiclodb.setText(vp.cmbparametroCiclo.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "¡HA CAMBIADO DE CICLO!");
        } else {
            JOptionPane.showMessageDialog(null, "¡ERROR AL HACER CAMBIO DE CICLO!");
        }
    }

    public void ventanaReporte() {
        va = new vAula();
        va.setTitle("REPORTE");
        va.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        va.setLocationRelativeTo(null);
        va.setVisible(true);
        va.txtrAulaCiclo.setText(vp.txtparametroCiclodb.getText());
        va.txtrAula.setText(vp.cmbparametroAula.getSelectedItem().toString());
        listarTablaReporte();
        Parametros parametros = new Parametros(vp, momusuarios, va, modist, mmdist);
    }

    private void limpiarCiclo() {
        int i = vp.cmbparametroAula.getItemCount();
        for (int j = 0; j < i; j++) {
            String aula = vp.cmbparametroAula.getSelectedItem().toString();
            mmdist.limpiarAulas(aula);
        }
        String ciclo = vp.txtparametroCiclodb.getText();
        mmdist.limpiarAsignadasMG(ciclo);
        mmdist.limpiarRegistroC(ciclo);
        mmdist.eliminarRegistroTC(ciclo);
        mmdist.eliminarRegistroTM(ciclo);
    }

    public void reporte() {
        MessageFormat header;
        String titulo;
        String aulan = vp.cmbparametroAula.getSelectedItem().toString();
        String ciclon = vp.txtparametroCiclodb.getText();
        titulo = "CARGA ACADÉMICA | AULA:" + aulan + " - CICLO: " + ciclon;
        header = new MessageFormat(titulo);
        boolean fitWidth = true;
        //boolean showPrintDialog = true;
        //boolean interactive = true;
        JTable.PrintMode mode = fitWidth? JTable.PrintMode.FIT_WIDTH : JTable.PrintMode.FIT_WIDTH;
        try {
            boolean complete = va.tblReporte.print(mode, header, null, true, null, true, null);
            //
        } catch (PrinterException ex) {
            //Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeadlessException ex) {
            //Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////

    public void listarTablaReporte() {
        String[] titulo = {"Jornada", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        dtmReporte = new DefaultTableModel(null, titulo);
        vAula.tblReporte.setModel(dtmReporte);
        vAula.tblReporte.setRowHeight(120);
        TableColumn columna;
        columna = vAula.tblReporte.getColumnModel().getColumn(0);
        columna.setPreferredWidth(25);
        vAula.tblReporte.setEditingColumn(0);
        Alinear.setVerticalAlignment(SwingConstants.TOP);
        AlinearH.setHorizontalAlignment(SwingConstants.CENTER);
        vAula.tblReporte.getColumnModel().getColumn(0).setCellRenderer(AlinearH);
        vAula.tblReporte.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        vAula.tblReporte.getColumnModel().getColumn(2).setCellRenderer(Alinear);
        vAula.tblReporte.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        vAula.tblReporte.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        vAula.tblReporte.getColumnModel().getColumn(5).setCellRenderer(Alinear);
        String aula = vp.cmbparametroAula.getSelectedItem().toString();
        List<oDistribucion> lista = mmdist.listarTablaCarga(aula);
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getaHora();
            object[1] = lista.get(i).getaLunes();
            object[2] = lista.get(i).getaMartes();
            object[3] = lista.get(i).getaMiercoles();
            object[4] = lista.get(i).getaJueves();
            object[5] = lista.get(i).getaViernes();
            dtmReporte.addRow(object);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vp.btnPrincipalParametros) {            
            usuarios();
            deshabilitar();
        }
        if (e.getSource() == vp.btbParametroAgregar) {
            habilitar();
            des();
            tipo = 1;
        }
        if (e.getSource() == vp.btnParametroModificar) {
            habilitar();
            vp.txtparametroUsuario.setText(vp.cmbParametroUsuarios.getSelectedItem().toString());
            tipo = 2;
        }
        if (e.getSource() == vp.btnParametroEliminar) {
            eliminarUsuario();
            usuarios();
        }
        if (e.getSource() == vp.btnParametroGuardar) {
            if (tipo == 1) {
                agregarUsuario();
            } else if (tipo == 2) {
                modificarUsuario();
            }
            hab();
            usuarios();
        }

        if (e.getSource() == vp.btnParametroCancelar) {
            deshabilitar();
            hab();
        }

        if (e.getSource() == vp.btnparametroCiclo) {
            parametro();
        }
////////////////////////////////////////////////////////////////////////////////
        if (e.getSource() == vp.btnParametroReporte) {
            ventanaReporte();
        }
        if (e.getSource() == vp.btnParametroLimpiarCiclo) {
            limpiarCiclo();
        }
        if (e.getSource() == va.btnpdf) {
            reporte();
        }
    }

}