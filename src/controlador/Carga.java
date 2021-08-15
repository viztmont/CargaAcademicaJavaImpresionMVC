package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.vCarga;
import vista.vHome;
import modelo.oCarga;
import modelo.mCarga;

public class Carga implements ActionListener {

    private final vHome vp;
    private final vCarga vc;
    private final Controlar_Distribucion cdist;
    private final oCarga mocarga;
    private final mCarga mmcarga;
    private final Jornada joda;
    int accionCatedratico;
    int accionMateria;

    public Carga(vHome vp, vCarga vc, Controlar_Distribucion cdist, oCarga mocarga, mCarga mmcarga, Jornada joda) {
        this.vp = vp;
        this.vc = vc;
        this.cdist = cdist;
        this.mocarga = mocarga;
        this.mmcarga = mmcarga;
        this.joda = joda;
        this.vc.botonCargaEliminar.addActionListener(this);
        this.vc.botonCargaAgregar.addActionListener(this);
    }
    private int filtro;//    

    private void filtroMateria() {
        filtro = cdist.tipoDistribucion;
        vCarga.cmbCargaMateria.removeAllItems();
        switch (filtro) {
            case 1:
                cdist.distribucionAnio();
                break;
            case 2:
                cdist.distribucionCarrera();
                break;
            case 3:
                cdist.distribucionCarreraAnio();
                break;
            case 4:
                cdist.distribucionTodo();
                break;
            default:
                break;
        }
    }
////////////////////////////////////////////////////////////////////////////////
    private String jornadaCatedratico;
    private int fc;
    private int cc;
    private int idmaestroTC;
    private int idmateriaTM;
    private String codtc = "";//catedratico timpo_libre
    private String jornada = "";
    private String codm = "";
    private String codmdb = "";//codigo de la materia en la tabla T_M        
    private String dia;
    private String codigomaestroTC = "";
    private String codigomateriaTM = "";
    private String grupomateriaTM = "";
    private String grupoconsulta = "";
    private String grupocmbCarga = "";
    //private String carreracmbMateria = "";
    //private String aniocmbMateria = "";
////////////////////////////////////////////////////////////////////////////////

    public void extra() {
        fc = vCarga.tblCarga.getSelectedRow();
        cc = vCarga.tblCarga.getSelectedColumn();
        joda.matrizC(fc, cc);
        jornada = joda.timecatjor;
        dia = joda.dia;
    }
////////////////////////////////////////////////////////////////////////////////

    public void catedratico() {
        extra();
        String codigo = "";
        mocarga.setTiempocatedraticoJornada(jornada);
        mocarga.setTiempocatedraticoParidad(vp.txtparametroCiclodb.getText());
        if (mmcarga.buscarCodCatedratico(mocarga)) {
            codigo = mocarga.getTiempocatedraticoCodigo();
        }
        int ccd = vCarga.cmbCargaDocente.getSelectedIndex();
        codtc = cdist.codCatedratico[ccd];
        if (codigo.equals(codtc)) {
            JOptionPane.showMessageDialog(null, "JORNADA DOCENTE OCUPADA");
            jornadaCatedratico = "NO";
        } else {
            JOptionPane.showMessageDialog(null, "JORNADA DOCENTE LIBRE");
            jornadaCatedratico = "SI";
        }
    }
////////////////////////////////////////////////////////////////////////////////

    public void ingresarTiempoCatedratico() {
        extra();
        mocarga.setTiempocatedraticoCodigo(codtc);
        mocarga.setTiempocatedraticoJornada(jornada);
        mocarga.setTiempocatedraticoAula(vCarga.txtCargaAula.getText());
        mocarga.setTiempocatedraticoParidad(vp.txtparametroCiclodb.getText());
        mmcarga.insertarJornadaCatedratico(mocarga);
    }
///////////////////////////////////////////////////////////////////////////////

    public void buscarActuslizarHorasLibresCatedratico() {
        extra();
        int horac;
        String ciclo = "";
        if (vp.txtparametroCiclodb.getText().equals("I")) {
            ciclo = "LibresI";
        } else if (vp.txtparametroCiclodb.getText().equals("II")) {
            ciclo = "LibresII";
        }
        //////////////////////////////////AGREGAR///////////////////////////////
        if (accionCatedratico == 1) {
            mocarga.setCatedraticoCodigo(codtc);
            if (mmcarga.buscarhoraCatedratico(mocarga, ciclo)) {
                horac = mocarga.getCatedraticoLibres();
                horac = horac - 1;
                mocarga.setCatedraticoLibres(horac);
                mocarga.setCatedraticoCodigo(codtc);
                mmcarga.asignarCatedraticoHora(mocarga, ciclo);
            }
            /////////////////////////////////ELIMINAR///////////////////////////////
        } else if (accionCatedratico == 2) {
            mocarga.setCatedraticoCodigo(codigomaestroTC);
            if (mmcarga.buscarhoraCatedratico(mocarga, ciclo)) {
                horac = mocarga.getCatedraticoLibres();
                horac = horac + 1;
                mocarga.setCatedraticoLibres(horac);
                mocarga.setCatedraticoCodigo(codigomaestroTC);
                mmcarga.asignarCatedraticoHora(mocarga, ciclo);
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////

    public void buscarActualizarHoraAsignadasMG() {
        extra();
        int asignadamg;
        int idmg;
        int p = vCarga.cmbCargaMateria.getSelectedIndex();
        if (accionMateria == 1) {
            mocarga.setMGCodigo(codm);
            mocarga.setMGGrupo(cdist.grupoMG[p]);
            mocarga.setMGParidad(vp.txtparametroCiclodb.getText());
            if (mmcarga.buscarAsignadasMG(mocarga)) {
                idmg = mocarga.getMGId();
                asignadamg = mocarga.getMGAsignadas();
                asignadamg = asignadamg + 1;
                mocarga.setMGAsignadas(asignadamg);
                mocarga.setMGId(idmg);
                mmcarga.actualizarAsignadasMG(mocarga);
            }
            /////////////////////////////////ELIMINAR///////////////////////////////
        } else if (accionMateria == 2) {
            mocarga.setMGCodigo(codigomateriaTM);
            mocarga.setMGGrupo(grupomateriaTM);
            mocarga.setMGParidad(vp.txtparametroCiclodb.getText());
            if (mmcarga.buscarAsignadasMG(mocarga)) {
                asignadamg = mocarga.getMGAsignadas();
                idmg = mocarga.getMGId();
                asignadamg = asignadamg - 1;
                mocarga.setMGAsignadas(asignadamg);
                mocarga.setMGId(idmg);
                mmcarga.actualizarAsignadasMG(mocarga);
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////

    public void insertarCadena() {
        extra();
        int p = vCarga.cmbCargaMateria.getSelectedIndex();
        String cad = "<html>" + codm + ":<p>" + cdist.nombreM[p] + ":<p>" + cdist.grupoMG[p]
                + ":<p>" + vCarga.cmbCargaDocente.getSelectedItem();
        String aula = vCarga.txtCargaAula.getText();
        String cadena = "'" + cad + "'";
        mmcarga.tablax(mocarga, aula, dia, cadena, joda.hora);
        vCarga.tblCarga.setValueAt(cad, fc, cc);
    }
////////////////////////////////////////////////////////////////////////////////

    public void insertarTM() {
        extra();
        int m = vCarga.cmbCargaMateria.getSelectedIndex();
        //carreracmbMateria = cdist.carreraM[m];
        mocarga.setTMCodigo(codm);
        mocarga.setTMGrupo(cdist.grupoMG[m]);
        mocarga.setTMJornada(jornada);
        mocarga.setTMAula(vCarga.txtCargaAula.getText());
        mocarga.setTMParidad(vp.txtparametroCiclodb.getText());
        mocarga.setTMCarrera(cdist.carreraM[m]);
        mocarga.setTMAnio(cdist.anioM[m]);
        mmcarga.insertTM(mocarga);
    }
////////////////////////////////////////////////////////////////////////////////

    public void agregarMateria() {
        extra();
        catedratico();
        int m = vCarga.cmbCargaMateria.getSelectedIndex();
        codm = cdist.codM[m];
        mocarga.setTMJornada(jornada);
        mocarga.setTMParidad(vp.txtparametroCiclodb.getText());
        if (mmcarga.buscarCodigoTM(mocarga)) {
            codmdb = mocarga.getTMCodigo();
        }
        if (codmdb.equals("")) {
            if (jornadaCatedratico.equals("SI")) {
                ingresarTiempoCatedratico();
                buscarActuslizarHorasLibresCatedratico();
                buscarActualizarHoraAsignadasMG();
                insertarTM();
                insertarCadena();
            } else {
                JOptionPane.showMessageDialog(null, "¡EL CATEDRÁTICO YA TIENE LA MISMA HORA Y DÍA EN OTRA MATERIA!");
            }
            ////////////////////////////////////////////////////////////////////////
        } else {
            mocarga.setTMCodigo(codm);
            if (mmcarga.buscarCodigoxcodTM(mocarga)) {
                codmdb = mocarga.getTMCodigow();
            }
            JOptionPane.showMessageDialog(null, "cmb: " + codm + " consulta: " + codmdb);
            if (codm.equals(codmdb)) {
                grupocmbCarga = cdist.grupoMG[m];
                mocarga.setTMCodigo(codm);
                mocarga.setTMJornada(jornada);
                mocarga.setTMGrupow(grupocmbCarga);
                if (mmcarga.buscarGrupoTM(mocarga)) {
                    grupoconsulta = mocarga.getTMGrupo();
                }
                if (grupocmbCarga.equals(grupoconsulta)) {
                    JOptionPane.showMessageDialog(null, "¡ESTA MATERIA CHOCA CON ELLA MISMA EN OTRA AULA EL MISMO DÍA Y HORA!");
                } else {
                    if (jornadaCatedratico.equals("SI")) {
                        ingresarTiempoCatedratico();
                        buscarActuslizarHorasLibresCatedratico();
                        buscarActualizarHoraAsignadasMG();
                        insertarTM();
                        insertarCadena();
                    } else {
                        JOptionPane.showMessageDialog(null, "¡EL CATEDRÁTICO YA TIENE LA MISMA HORA Y DÍA EN OTRA MATERIA!");
                    }
                }
                //////////////////////////////////////////////////////////////////////////////////////////////////////
            } else {
                String codigotm = "";
                mocarga.setTMCarrera(cdist.carreraM[m]);
                mocarga.setTMAnio(cdist.anioM[m]);
                mocarga.setTMParidad(vp.txtparametroCiclodb.getText());
                if (mmcarga.buscarCarreraAnioTM(mocarga)) {
                    codigotm = mocarga.getTMCodigo();
                }
                if (codigotm.equals("")) {
                    if (jornadaCatedratico.equals("SI")) {
                        ingresarTiempoCatedratico();
                        buscarActuslizarHorasLibresCatedratico();
                        buscarActualizarHoraAsignadasMG();
                        insertarTM();
                        insertarCadena();
                    } else {
                        JOptionPane.showMessageDialog(null, "¡EL CATEDRÁTICO YA TIENE LA MISMA HORA Y DÍA EN OTRA MATERIA!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "¡ESTA MATERIA CHOCA CON OTRA MATERIA DEL MISMO AÑO Y CARRERA!");
                }
            }
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void buscarEliminarCatedratico() {
        extra();
        mocarga.setTiempocatedraticoAula(vCarga.txtCargaAula.getText());
        mocarga.setTiempocatedraticoParidad(vp.txtparametroCiclodb.getText());
        mocarga.setTiempocatedraticoJornada(jornada);
        if (mmcarga.buscarCodCatedraticoEliminar(mocarga)) {
            idmaestroTC = mocarga.getTiempocatedraticoId();
            codigomaestroTC = mocarga.getTiempocatedraticoCodigo();
            //eliminar
            mocarga.setTiempocatedraticoId(idmaestroTC);
            mmcarga.eliminarCatedraticoTC(mocarga);
        }
    }
////////////////////////////////////////////////////////////////////////////////      

    public void buscarEliminarMateria() {
        extra();
        mocarga.setTMAula(vCarga.txtCargaAula.getText());
        mocarga.setTMParidad(vp.txtparametroCiclodb.getText());
        mocarga.setTMJornada(jornada);
        if (mmcarga.buscarCodMateriaEliminar(mocarga)) {
            idmateriaTM = mocarga.getTMId();
            codigomateriaTM = mocarga.getTMCodigo();
            grupomateriaTM = mocarga.getTMGrupo();
            //eliminar
            mocarga.setTMId(idmateriaTM);
            mmcarga.eliminarMateriaTM(mocarga);
        }
    }
////////////////////////////////////////////////////////////////////////////////

    public void EliminarMateriaAula() {
        extra();
        buscarEliminarCatedratico();
        buscarEliminarMateria();
        buscarActuslizarHorasLibresCatedratico();
        buscarActualizarHoraAsignadasMG();
        String aula = vCarga.txtCargaAula.getText();
        String caden = "''";
        mmcarga.tablax(mocarga, aula, dia, caden, joda.hora);
        vCarga.tblCarga.setValueAt("", fc, cc);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vc.botonCargaAgregar) {
            int x = vc.cmbCargaMateria.getSelectedIndex();
            int z = vc.cmbCargaDocente.getSelectedIndex();
            if (x == -1 || z == -1) {
                JOptionPane.showMessageDialog(null, "¡DEBEN DE SER SELECCIONADOS LOS DOS CAMPOS!");
            } else {
                int fa = vCarga.tblCarga.getSelectedRow();
                int ca = vCarga.tblCarga.getSelectedColumn();
                if (fa == -1) {
                    JOptionPane.showMessageDialog(null, "¡DEBE DE SELECCIONAR UN CAMPO!");
                } else {
                    String tupla = (String) vCarga.tblCarga.getValueAt(fa, ca);
                    switch (tupla) {
                        case "":
                            accionCatedratico = 1;
                            accionMateria = 1;
                            agregarMateria();
                            filtroMateria();
                            cdist.llenarcmbCargaDocente();
                            break;
                        case "SI":
                            JOptionPane.showMessageDialog(null, "¡ESTA JORNADA NO ESTÁ DISPONIBLE!");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "¡ESTA JORNADA YA ESTÁ ASIGNADA!");
                            break;
                    }
                }
            }
        }
        ////////////////////////////////////////////////////////////////////////
        if (e.getSource() == vc.botonCargaEliminar) {
            int fe = vCarga.tblCarga.getSelectedRow();
            int ce = vCarga.tblCarga.getSelectedColumn();
            if (fe == -1) {
                JOptionPane.showMessageDialog(null, "¡DEBE DE SELECCIONAR UN CAMPO!");
            } else {
                String tupla = (String) vCarga.tblCarga.getValueAt(fe, ce);
                switch (tupla) {
                    case "":
                        JOptionPane.showMessageDialog(null, "!ERROR!");
                        break;
                    case "SI":
                        JOptionPane.showMessageDialog(null, "¡EROR!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "¡EIMINADA!");
                        accionCatedratico = 2;
                        accionMateria = 2;
                        EliminarMateriaAula();
                        filtroMateria();
                        cdist.llenarcmbCargaDocente();
                        break;
                }
            }
        }
    }

}
