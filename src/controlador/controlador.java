package controlador;

import vista.vLogin;
import vista.vHome;
import vista.vCarga;
import modelo.mUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class controlador implements ActionListener {

    private final vLogin vl;
    private final vHome vp;
    private final vCarga vc;
    private final mUsuarios momusuarios;

    public controlador(vLogin vl, mUsuarios momusuarios, vHome vp, vCarga vc) {
        this.vl = vl;
        this.momusuarios = momusuarios;
        this.vp = vp;
        this.vc = vc;
        this.vl.btnlogginAceptar.addActionListener(this);
        this.vp.btnPrincipalAula.addActionListener(this);
        this.vp.btnPrincipalCarrera.addActionListener(this);
        this.vp.btnPrincipalCatedratico.addActionListener(this);
        this.vp.btnPrincipalDiponible.addActionListener(this);
        this.vp.btnPrincipalDistribucion.addActionListener(this);
        this.vp.btnPrincipalHome.addActionListener(this);
        this.vp.btnPrincipalMateria.addActionListener(this);
        this.vp.btnPrincipalParametros.addActionListener(this);
    }

    public void iniciarl() {
        vl.setTitle("USUARIO");
        vl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);
    }

    public void iniciar() {
        vp.setTitle("CARGA ACADÉMICA");
        vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }

    public void usuario() {
        if (vl.txtlogginUsuario.getText().equals("") || vl.txtplogginContrasena.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¡DEBE INGRESAR LOS CAMPOS CORRESPONDIENTES!");
        } else {
            momusuarios.setUsuario(vl.txtlogginUsuario.getText());
            momusuarios.setContrasena(vl.txtplogginContrasena.getText());
            String nombre = "";
            String usuario = "";
            if (momusuarios.buscar(momusuarios)) {
                nombre = momusuarios.getUsuario();
                usuario = momusuarios.getContrasena();
            }
            if (nombre.equals(vl.txtlogginUsuario.getText()) & usuario.equals(vl.txtplogginContrasena.getText())) {
                iniciar();
                ciclo();
                vl.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "¡EL USUARIO Y LA CONTRASEÑA NO COINCIDEN!");
            }
        }
    }

    private void ciclo() {
        momusuarios.buscarCiclo(momusuarios);
        String ciclo = momusuarios.getNomp();
        vp.txtparametroCiclodb.setText(ciclo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vl.btnlogginAceptar) {
            usuario();            
        }
        if (e.getSource() == vp.btnPrincipalAula) {
            vHome.tpnHome.setSelectedComponent(vp.panelHomeAula);
        }
        if (e.getSource() == vp.btnPrincipalCarrera) {
            vHome.tpnHome.setSelectedComponent(vp.panelHomeCarrera);
        }
        if (e.getSource() == vp.btnPrincipalCatedratico) {
            vHome.tpnHome.setSelectedComponent(vp.panelHomeCatedratico);
        }
        if (e.getSource() == vp.btnPrincipalDistribucion) {
            vHome.tpnHome.setSelectedComponent(vp.panelHomeDistribucion);
        }
        if (e.getSource() == vp.btnPrincipalHome) {
            vHome.tpnHome.setSelectedComponent(vp.panelHome);
        }
        if (e.getSource() == vp.btnPrincipalMateria) {
            vHome.tpnHome.setSelectedComponent(vp.panelHomeMateria);
        }
        if (e.getSource() == vp.btnPrincipalParametros) {
            vHome.tpnHome.setSelectedComponent(vp.panelHomeParametro);
        }
        if (e.getSource() == vp.btnPrincipalDiponible) {
            vHome.tpnHome.setSelectedComponent(vp.panelHomeDisponibilidad);
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
    }

}