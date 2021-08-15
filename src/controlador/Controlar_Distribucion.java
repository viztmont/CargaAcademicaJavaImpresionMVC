package controlador;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.mDistribucion;
import modelo.oDistribucion;
import vista.vCarga;
import vista.vHome;

public class Controlar_Distribucion {

    private final vHome vp;
    private final vCarga vc;
    private final oDistribucion modist;
    private final mDistribucion mmdist;
    DefaultTableModel mTDistribucion = new DefaultTableModel();
    DefaultTableModel dtmDisponible = new DefaultTableModel();
    DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
    DefaultTableCellRenderer AlinearH = new DefaultTableCellRenderer();
    public String[] codCatedratico;    
    public int tamanoM;
    public String[] codM;
    public String[] nombreM;
    public String[] carreraM;
    public String[] anioM;
    public String[] grupoMG;
    public int tipoDistribucion;
    public int tamanoc;
    public int ca;

    public Controlar_Distribucion(vHome vp, vCarga vc, oDistribucion modist, mDistribucion mmdist) {
        this.vp = vp;
        this.vc = vc;
        this.modist = modist;
        this.mmdist = mmdist;
    }

    public void llenarcmbAulaDistribucion() {
        String cantidad = vp.cmbDistribucionCantidad.getSelectedItem().toString();
        String paridad = vp.txtparametroCiclodb.getText();
        List<oDistribucion> list = mmdist.llenarcmbDistribucion_Aula(cantidad, paridad);
        for (int i = 0; i < list.size(); i++) {
            vp.cmbDistribucionAula.addItem(list.get(i).getAulaCodigo());
        }
    }
    
    public void llenarParametrocmbAula() {
        String paridad = vp.txtparametroCiclodb.getText();
        List<oDistribucion> list = mmdist.llenarParametrocmbAula(paridad);
        for (int i = 0; i < list.size(); i++) {
            vp.cmbparametroAula.addItem(list.get(i).getAulaCodigo());
        }
    }

    public void llenarcmbDistribucionCarrera() {
        List<oDistribucion> list = mmdist.llenarcmbDistribucion_Carrera();
        for (int i = 0; i < list.size(); i++) {
            vp.cmbDistribucionCarrera.addItem(list.get(i).getCarreraNombre());
        }
    }

    public void llenarcmbAulaMateria() {
        vp.cmbMateriaCarrera.removeAll();
        List<oDistribucion> list = mmdist.llenarcmbDistribucion_Carrera();
        for (int i = 0; i < list.size(); i++) {
            vp.cmbMateriaCarrera.addItem(list.get(i).getCarreraNombre());
        }
    }

    public void limpiarTablaDistribucion() {
        for (int i = 0; i < vCarga.tblCarga.getRowCount(); i++) {
            mTDistribucion.removeRow(i);
            i = i - 1;
        }
    }

    public void listarTablaCarga(JTable tabla) {
        vCarga.tblCarga.setRowHeight(120);
        TableColumn columna;
        columna = vCarga.tblCarga.getColumnModel().getColumn(0);
        columna.setPreferredWidth(20);
        vCarga.tblCarga.setEditingColumn(0);
        Alinear.setVerticalAlignment(SwingConstants.TOP);
        AlinearH.setHorizontalAlignment(SwingConstants.CENTER);
        vCarga.tblCarga.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        vCarga.tblCarga.getColumnModel().getColumn(0).setCellRenderer(AlinearH);
        vCarga.tblCarga.getColumnModel().getColumn(2).setCellRenderer(Alinear);
        vCarga.tblCarga.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        vCarga.tblCarga.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        vCarga.tblCarga.getColumnModel().getColumn(5).setCellRenderer(Alinear);
        mTDistribucion = (DefaultTableModel) tabla.getModel();
        String aula = vp.cmbDistribucionAula.getSelectedItem().toString();
        List<oDistribucion> lista = mmdist.listarTablaCarga(aula);
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getaHora();
            object[1] = lista.get(i).getaLunes();
            object[2] = lista.get(i).getaMartes();
            object[3] = lista.get(i).getaMiercoles();
            object[4] = lista.get(i).getaJueves();
            object[5] = lista.get(i).getaViernes();
            mTDistribucion.addRow(object);
        }
        vCarga.tblCarga.setModel(mTDistribucion);
        vCarga.txtCargaAula.setText(aula);
    }

    public void llenarcmbCargaDocente() {
        String ciclo = "";
        if (vp.txtparametroCiclodb.getText().equals("I")) {ciclo = "LibresI";} 
        else if (vp.txtparametroCiclodb.getText().equals("II")) {ciclo = "LibresII";}
        List<oDistribucion> listca = mmdist.llenarcmbCarga_Catedratico(ciclo);
        String[] cons = new String[4];
        tamanoc = listca.size();
        codCatedratico = new String[tamanoc];
        vCarga.cmbCargaDocente.removeAllItems();
        for (int i = 0; i < listca.size(); i++) {
            cons[0] = listca.get(i).getCatedraticoCodigo();
            codCatedratico[i] = listca.get(i).getCatedraticoCodigo();
            cons[1] = listca.get(i).getCatedraticoNombres();
            cons[2] = listca.get(i).getCatedraticoApellidos();
            cons[3] = cons[1] + " " + cons[2] + " " + cons[0];
            vCarga.cmbCargaDocente.addItem(cons[3]);
        }
    }

    public void distribucionAnio() {
        String anio = vp.cmbDistribucionAnio.getSelectedItem().toString();
        String paridad = vp.txtparametroCiclodb.getText();
        List<oDistribucion> list = mmdist.llenarcmbCarga_Anio(anio, paridad);
        tamanoM = list.size();
        grupoMG = new String[tamanoM];
        nombreM = new String[tamanoM];
        codM = new String[tamanoM];
        carreraM = new String[tamanoM];
        anioM = new String[tamanoM];
        for (int i = 0; i < list.size(); i++) {
            grupoMG[i] = list.get(i).getMGGrupo();
            nombreM[i] = list.get(i).getMateriaNombre();
            vCarga.cmbCargaMateria.addItem(nombreM[i] +" "+grupoMG[i]);
            codM[i] = list.get(i).getMateriaCodigo();
            carreraM[i] = list.get(i).getMateriaCarrera();
            anioM[i] = list.get(i).getMateriaAnio();
        }
        tipoDistribucion = 1;
    }

    public void distribucionCarrera() {
        String carrera = vp.cmbDistribucionCarrera.getSelectedItem().toString();
        String paridad = vp.txtparametroCiclodb.getText();
        List<oDistribucion> list = mmdist.llenarcmbCarga_Carrera(carrera, paridad);
        tamanoM = list.size();
        grupoMG = new String[tamanoM];
        nombreM = new String[tamanoM];
        codM = new String[tamanoM];
        carreraM = new String[tamanoM];
        anioM = new String[tamanoM];
        for (int i = 0; i < list.size(); i++) {
            grupoMG[i] = list.get(i).getMGGrupo();
            nombreM[i] = list.get(i).getMateriaNombre();
            vCarga.cmbCargaMateria.addItem(nombreM[i] +" "+grupoMG[i]);
            codM[i] = list.get(i).getMateriaCodigo();
            carreraM[i] = list.get(i).getMateriaCarrera();
            anioM[i] = list.get(i).getMateriaAnio();
        }
        tipoDistribucion = 2;
    }

    public void distribucionCarreraAnio() {
        String carrera = vp.cmbDistribucionCarrera.getSelectedItem().toString();
        String anio = vp.cmbDistribucionAnio.getSelectedItem().toString();
        String paridad = vp.txtparametroCiclodb.getText();
        List<oDistribucion> list = mmdist.llenarcmbCarga_CarreraAnio(carrera, anio, paridad);
        tamanoM = list.size();
        grupoMG = new String[tamanoM];
        nombreM = new String[tamanoM];
        codM = new String[tamanoM];
        carreraM = new String[tamanoM];
        anioM = new String[tamanoM];
        for (int i = 0; i < list.size(); i++) {
            grupoMG[i] = list.get(i).getMGGrupo();
            nombreM[i] = list.get(i).getMateriaNombre();
            vCarga.cmbCargaMateria.addItem(nombreM[i] +" "+grupoMG[i]);
            codM[i] = list.get(i).getMateriaCodigo();
            carreraM[i] = list.get(i).getMateriaCarrera();
            anioM[i] = list.get(i).getMateriaAnio();
        }
        tipoDistribucion = 3;
    }

    public void distribucionTodo() {
        String paridad = vp.txtparametroCiclodb.getText();
        List<oDistribucion> list = mmdist.llenarcmbCarga_Materias(paridad);
        tamanoM = list.size();
        grupoMG = new String[tamanoM];
        nombreM = new String[tamanoM];
        codM = new String[tamanoM];
        carreraM = new String[tamanoM];
        anioM = new String[tamanoM];
        for (int i = 0; i < list.size(); i++) {
            grupoMG[i] = list.get(i).getMGGrupo();
            nombreM[i] = list.get(i).getMateriaNombre();
            vCarga.cmbCargaMateria.addItem(nombreM[i] +" "+grupoMG[i]);
            codM[i] = list.get(i).getMateriaCodigo();
            carreraM[i] = list.get(i).getMateriaCarrera();
            anioM[i] = list.get(i).getMateriaAnio();
        }
        tipoDistribucion = 4;
    }

    public void limpiarTablaDisponibilidad() {
        for (int i = 0; i < vHome.tblDisponibilidad.getRowCount(); i++) {
            dtmDisponible.removeRow(i);
            i = i - 1;
        }
    }

    public void listarTablaDisponibilidad(JTable tabla) {
        String[] titulo = {"Jornada", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        dtmDisponible = new DefaultTableModel(null, titulo);
        String aula = vp.cmbdisponibilidadAula.getSelectedItem().toString();
        List<oDistribucion> lista = mmdist.listarTablaCarga(aula);
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getaHora();
            object[1] = lista.get(i).getaLunes();
            object[2] = lista.get(i).getaMartes();
            object[3] = lista.get(i).getaMiercoles();
            object[4] = lista.get(i).getaJueves();
            object[5] = lista.get(i).getaViernes();
            dtmDisponible.addRow(object);
        }
        vHome.tblDisponibilidad.setModel(dtmDisponible);
        vHome.tblDisponibilidad.setRowHeight(120);
        TableColumn columna;
        columna = vHome.tblDisponibilidad.getColumnModel().getColumn(0);
        columna.setPreferredWidth(25);
        vHome.tblDisponibilidad.setEditingColumn(0);
        Alinear.setVerticalAlignment(SwingConstants.TOP);
        AlinearH.setHorizontalAlignment(SwingConstants.CENTER);
        vHome.tblDisponibilidad.getColumnModel().getColumn(0).setCellRenderer(AlinearH);
        vHome.tblDisponibilidad.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        vHome.tblDisponibilidad.getColumnModel().getColumn(2).setCellRenderer(Alinear);
        vHome.tblDisponibilidad.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        vHome.tblDisponibilidad.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        vHome.tblDisponibilidad.getColumnModel().getColumn(5).setCellRenderer(Alinear);
    }

    public void modificarDisponibilidadAula() {
        int f = vHome.tblDisponibilidad.getSelectedRow();
        modist.setaHora((String) vHome.tblDisponibilidad.getValueAt(f, 0).toString());
        modist.setaLunes((String) vHome.tblDisponibilidad.getValueAt(f, 1).toString());
        modist.setaMartes((String) vHome.tblDisponibilidad.getValueAt(f, 2).toString());
        modist.setaMiercoles((String) vHome.tblDisponibilidad.getValueAt(f, 3).toString());
        modist.setaJueves((String) vHome.tblDisponibilidad.getValueAt(f, 4).toString());
        modist.setaViernes((String) vHome.tblDisponibilidad.getValueAt(f, 5).toString());
        String aula = vp.cmbdisponibilidadAula.getSelectedItem().toString();
        if (mmdist.modificarDisponibilidadAula(modist, aula)) {
            JOptionPane.showMessageDialog(null, "¡REGISTRO O REGISTROS MODIFICADOS!");
        } else {
            JOptionPane.showMessageDialog(null, "¡ERROR AL MODIFICAR!");
        }
    }   
    
    public void aulas() throws SQLException{
        String paridad = vp.txtparametroCiclodb.getText();
        mmdist.aulas(paridad);       
        if (mmdist.aulas(paridad)>0) {
            ca=1;
        }if (mmdist.aulas(paridad)==0) {
            ca=2;
            JOptionPane.showMessageDialog(null, "¡DEBE HABER AL MENOS UN AULA!");
        }
    }
}