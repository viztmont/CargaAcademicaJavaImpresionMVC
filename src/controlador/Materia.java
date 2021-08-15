package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.mMateria;
import modelo.oMateria;
import vista.vHome;

public class Materia implements ActionListener, MouseListener, KeyListener {

    DefaultTableModel dtmmateria;
    DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
    private final oMateria momateria;
    private final mMateria mmmateria;
    private final vHome vp;
    private final Jornada jornada;
    private int tipo;
    private String[] grupos;

    public Materia(oMateria momateria, mMateria mmmateria, vHome vp, Jornada jornada) {
        this.momateria = momateria;
        this.mmmateria = mmmateria;
        this.vp = vp;
        this.jornada = jornada;
        this.vp.btnPrincipalMateria.addActionListener(this);
        this.vp.btnMateriaAgregar.addActionListener(this);
        this.vp.btnMateriaModificar.addActionListener(this);
        this.vp.btnMateriaCancelar.addActionListener(this);
        this.vp.btnMateriaGuardar.addActionListener(this);
        this.vp.btnMateriaEliminar.addActionListener(this);
        this.vp.txtMaterianombrefiltrar.addKeyListener(this);
        this.vp.txtMateriaaniofiltrar.addKeyListener(this);
        this.vp.txtMateriacarrerafiltrar.addKeyListener(this);
        this.vp.txtMaterianombrefiltrar.addMouseListener(this);
        this.vp.txtMateriaaniofiltrar.addMouseListener(this);
        this.vp.txtMateriacarrerafiltrar.addMouseListener(this);
    }

    public void ocultar() {
        vp.lblMateriaRegistrar.setVisible(false);
        vp.lblMateriaModificar.setVisible(false);
        vp.lblMateriaAnio.setVisible(false);
        vp.lbMateriaCarrera.setVisible(false);
        vp.lblMateriaCodigo.setVisible(false);
        vp.lblMateriaGrupos.setVisible(false);
        vp.lbMaterialNombre.setVisible(false);
        vp.txtMateriaCodigo.setVisible(false);
        vp.txtMateriaNombre.setVisible(false);
        vp.cmbMateriaAnio.setVisible(false);
        vp.cmbMateriaCarrera.setVisible(false);
        vp.cmbMateriaGrupos.setVisible(false);
        vp.btnMateriaGuardar.setVisible(false);
        vp.btnMateriaCancelar.setVisible(false);
        vp.txtMateriaCodigo.setEditable(true);
        vp.panelMateriaPaleta.setVisible(false);
        vp.btnMateriaAgregar.setEnabled(true);
        vp.btnMateriaModificar.setEnabled(true);
        vp.btnMateriaEliminar.setEnabled(true);
    }

    public void mostrar() {
        vp.lblMateriaAnio.setVisible(true);
        vp.lbMateriaCarrera.setVisible(true);
        vp.lblMateriaCodigo.setVisible(true);
        vp.lblMateriaGrupos.setVisible(true);
        vp.lbMaterialNombre.setVisible(true);
        vp.txtMateriaCodigo.setVisible(true);
        vp.txtMateriaNombre.setVisible(true);
        vp.cmbMateriaAnio.setVisible(true);
        vp.cmbMateriaCarrera.setVisible(true);
        vp.cmbMateriaGrupos.setVisible(true);
        vp.btnMateriaGuardar.setVisible(true);
        vp.btnMateriaCancelar.setVisible(true);
        vp.panelMateriaPaleta.setVisible(true);
    }

    public void deshabilitar() {
        vp.btnMateriaAgregar.setEnabled(false);
        vp.btnMateriaModificar.setEnabled(false);
        vp.btnMateriaEliminar.setEnabled(false);
    }

    public void habilitar() {
        vp.btnMateriaAgregar.setEnabled(true);
        vp.btnMateriaModificar.setEnabled(true);
        vp.btnMateriaEliminar.setEnabled(true);
        vp.txtMateriaCodigo.setText("");
        vp.txtMateriaNombre.setText("");
    }

    public void ordenarTabla() {
        TableColumn columna;
        columna = vHome.tblMateria.getColumnModel().getColumn(0);
        columna.setMaxWidth(75);
        columna = vHome.tblMateria.getColumnModel().getColumn(3);
        columna.setMaxWidth(75);
        columna = vHome.tblMateria.getColumnModel().getColumn(4);
        columna.setMaxWidth(75);
    }

    public void listarMateria(JTable tabla) {
        String[] titulo = {"Código", "Nombre", "Carrera", "Año", "Grupos"};
        dtmmateria = new DefaultTableModel(null, titulo);
        String paridad = vp.txtparametroCiclodb.getText();
        List<oMateria> lista = mmmateria.listar(paridad);
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getCodigo();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getCarrera();
            object[3] = lista.get(i).getAnio();
            object[4] = lista.get(i).getGrupos();
            dtmmateria.addRow(object);
        }
        vHome.tblMateria.setModel(dtmmateria);
        ordenarTabla();
    }

    public void filtrarNombre(JTable tabla) {
        String[] titulo = {"Código", "Nombre", "Carrera", "Año", "Grupos"};
        dtmmateria = new DefaultTableModel(null, titulo);
        String nombre = vp.txtMaterianombrefiltrar.getText();
        String paridad = vp.txtparametroCiclodb.getText();
        List<oMateria> lista = mmmateria.filtrarNombre(nombre, paridad);
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getCodigo();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getCarrera();
            object[3] = lista.get(i).getAnio();
            object[4] = lista.get(i).getGrupos();
            dtmmateria.addRow(object);
        }
        vHome.tblMateria.setModel(dtmmateria);
        ordenarTabla();
    }

    public void filtrarAnio(JTable tabla) {
        String[] titulo = {"Código", "Nombre", "Carrera", "Año", "Grupos"};
        dtmmateria = new DefaultTableModel(null, titulo);
        String anio = vp.txtMateriaaniofiltrar.getText();
        String paridad = vp.txtparametroCiclodb.getText();
        List<oMateria> lista = mmmateria.filtrarAnio(anio, paridad);
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getCodigo();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getCarrera();
            object[3] = lista.get(i).getAnio();
            object[4] = lista.get(i).getGrupos();
            dtmmateria.addRow(object);
        }
        vHome.tblMateria.setModel(dtmmateria);
        ordenarTabla();
    }

    public void filtrarCarrera(JTable tabla) {
        String[] titulo = {"Código", "Nombre", "Carrera", "Año", "Grupos"};
        dtmmateria = new DefaultTableModel(null, titulo);
        String carrera = vp.txtMateriacarrerafiltrar.getText();
        String paridad = vp.txtparametroCiclodb.getText();
        List<oMateria> lista = mmmateria.filtrarCarrera(carrera, paridad);
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getCodigo();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getCarrera();
            object[3] = lista.get(i).getAnio();
            object[4] = lista.get(i).getGrupos();
            dtmmateria.addRow(object);
        }
        vHome.tblMateria.setModel(dtmmateria);
        ordenarTabla();
    }

    public void ingresar() {
        momateria.setCodigo(vp.txtMateriaCodigo.getText());
        momateria.setNombre(vp.txtMateriaNombre.getText());
        momateria.setCarrera(vp.cmbMateriaCarrera.getSelectedItem().toString());
        momateria.setAnio(vp.cmbMateriaAnio.getSelectedItem().toString());
        momateria.setGrupos(Integer.parseInt(vp.cmbMateriaGrupos.getSelectedItem().toString()));
        momateria.setParidad(vp.txtparametroCiclodb.getText());
        mmmateria.registrar(momateria);
    }

    public void datosTabla() {
        int fila = vHome.tblMateria.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "¡DEBE DE SELECCIONAR UN CAMPO!");
        } else {
            String codigoc = (String) vHome.tblMateria.getValueAt(fila, 0);
            String nombrec = (String) vHome.tblMateria.getValueAt(fila, 1);
            vp.txtMateriaCodigo.setText(codigoc);
            vp.txtMateriaNombre.setText(nombrec);
        }
    }

    public void modificar() {
        momateria.setCodigo(vp.txtMateriaCodigo.getText());
        momateria.setNombre(vp.txtMateriaNombre.getText());
        momateria.setCarrera(vp.cmbMateriaCarrera.getSelectedItem().toString());
        momateria.setAnio(vp.cmbMateriaAnio.getSelectedItem().toString());
        momateria.setGrupos(Integer.parseInt(vp.cmbMateriaGrupos.getSelectedItem().toString()));
        if (mmmateria.modificarM(momateria)) {
            eliminarGrupo();
            ingresargrupos();
        }
    }

    public void eliminarGrupo() {
        int fila = vHome.tblMateria.getSelectedRow();
        String mn = ((String) vHome.tblMateria.getValueAt(fila, 0).toString());
        int tam = Integer.parseInt(((String) vHome.tblMateria.getValueAt(fila, 5).toString()));
        for (int i = 0; i < tam; i++) {
            momateria.setMgGrupo(mn);
            if (mmmateria.eliminarGruposxMateria(momateria)) {
            }
        }
    }

    public void eliminarMateria() {
        int fila = vHome.tblMateria.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "¡DEBE DE SELECCIONAR UN CAMPO!");
        } else {
            String m = ((String) vHome.tblMateria.getValueAt(fila, 0).toString());
            int tam = Integer.parseInt(((String) vHome.tblMateria.getValueAt(fila, 4).toString()));
            momateria.setCodigo(m);
            if (mmmateria.eliminar(momateria)) {
                for (int i = 0; i < tam; i++) {
                    momateria.setMgGrupo(m);
                    mmmateria.eliminarGruposxMateria(momateria);
                }
                listarMateria(vHome.tblMateria);
                JOptionPane.showMessageDialog(null, "¡ELIMINADO CORRECTAMENTE!");
            } else {
                JOptionPane.showMessageDialog(null, "¡ERROR AL ELIMINAR!");
            }
        }
    }

    public void ingresargrupos() {
        int tam = Integer.parseInt(vp.cmbMateriaGrupos.getSelectedItem().toString());
        jornada.gruposMateria(tam);
        grupos = new String[tam];
        System.arraycopy(jornada.grupos, 0, grupos, 0, tam);
        for (int i = 0; i < tam; i++) {
            momateria.setMgCodigo(vp.txtMateriaCodigo.getText());
            String grup = grupos[i];
            momateria.setMgGrupo(grup);
            momateria.setMgAsignadas(0);
            momateria.setParidad(vp.txtparametroCiclodb.getText());
            if (mmmateria.insertarGruposxMateria(momateria)) {
            } else {
                JOptionPane.showMessageDialog(null, "¡ERROR AL INGRESAR LOS GRUPOS!");
            }
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vp.btnPrincipalMateria) {
            ocultar();
            listarMateria(vHome.tblMateria);
        }
        if (e.getSource() == vp.btnMateriaAgregar) {
            int a = vp.cmbMateriaCarrera.getSelectedIndex();
            if (a == -1) {
                JOptionPane.showMessageDialog(null, "¡NO HA INGRESADO CARRERAS!");
            } else {
                vp.lblMateriaRegistrar.setVisible(true);
                mostrar();
                deshabilitar();
                tipo = 1;
            }
        }
        if (e.getSource() == vp.btnMateriaModificar) {
            int fila = vHome.tblMateria.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "¡DEBE DE SELECCIONAR UN CAMPO!");
            } else {
                vp.lblMateriaModificar.setVisible(true);
                vp.txtMateriaCodigo.setEditable(false);
                mostrar();
                deshabilitar();
                datosTabla();
                tipo = 2;
            }
        }
        if (e.getSource() == vp.btnMateriaCancelar) {
            ocultar();
            habilitar();
        }
        if (e.getSource() == vp.btnMateriaGuardar) {
            if (vp.txtMateriaCodigo.getText().equals("") || vp.txtMateriaNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "¡DEBE INGRESAR LOS CAMPOS CORRESPONDIENTES!");
            } else {
                if (tipo == 1) {
                    ingresar();
                    ingresargrupos();
                } else if (tipo == 2) {
                    modificar();
                }
                ocultar();
                habilitar();
                listarMateria(vHome.tblMateria);
            }
        }
        if (e.getSource() == vp.btnMateriaEliminar) {
            eliminarMateria();
            listarMateria(vHome.tblMateria);
        }

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == vp.txtMaterianombrefiltrar) {
            filtrarNombre(vHome.tblMateria);
        }
        if (e.getSource() == vp.txtMateriacarrerafiltrar) {
            filtrarCarrera(vHome.tblMateria);
        }
        if (e.getSource() == vp.txtMateriaaniofiltrar) {
            filtrarAnio(vHome.tblMateria);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == vp.txtMaterianombrefiltrar) {
            vp.txtMaterianombrefiltrar.setText("");
        }
        if (e.getSource() == vp.txtMateriacarrerafiltrar) {
            vp.txtMateriacarrerafiltrar.setText("");
        }
        if (e.getSource() == vp.txtMateriaaniofiltrar) {
            vp.txtMateriaaniofiltrar.setText("");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
