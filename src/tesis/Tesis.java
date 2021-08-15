package tesis;

import controlador.controlador;
import vista.vHome;
import vista.vCarga;
import vista.vLogin;
import vista.vAula;
//
import modelo.oDistribucion;
import modelo.mDistribucion;
import modelo.oCarga;
import modelo.mCarga;
import controlador.Controlar_Distribucion;
import controlador.CargarFormularioCarga;
import controlador.Carga;
import controlador.Jornada;
import modelo.mUsuarios;
//
import modelo.oMateria;
import modelo.mMateria;
import controlador.Materia;
//
import modelo.mAula;
import controlador.Aula;
//
import modelo.mCarrera;
import controlador.Carrera;
//
import modelo.mCatedratico;
import controlador.Catedratico;
//
import controlador.Parametros;
//
import controlador.Disponibilidad;

public class Tesis {

    public static void main(String[] args) {
        vLogin vl = new vLogin();
        vHome vp = new vHome();
        vCarga vc = new vCarga(); 
        vAula va = new vAula();
        mUsuarios momusuarios = new mUsuarios();
        controlador c = new controlador(vl, momusuarios, vp, vc);
        c.iniciarl();
        //
        oDistribucion modist = new oDistribucion();
        mDistribucion mmdist = new mDistribucion();
        Controlar_Distribucion cdist = new Controlar_Distribucion(vp, vc, modist, mmdist);                
        oCarga mocarga = new oCarga();
        mCarga mmcarga = new mCarga();  
        Jornada joda = new Jornada();
        CargarFormularioCarga cfc = new CargarFormularioCarga(vp, vc, cdist, mocarga, mmcarga, joda);
        Carga cag = new Carga(vp, vc, cdist, mocarga, mmcarga, joda); 
        //
        oMateria momateria = new oMateria();
        mMateria mmmateria = new mMateria();
        Materia materia = new Materia(momateria, mmmateria, vp, joda);
        //
        mAula mmaula = new mAula();
        Aula aula = new Aula(mmaula, vp);
        //
        mCarrera momcarrera = new mCarrera();
        Carrera carrera = new Carrera(momcarrera, vp);
        //
        mCatedratico momcatedratico = new mCatedratico();
        Catedratico catedratico = new Catedratico(momcatedratico, vp);
        //        
        Parametros parametros = new Parametros(vp, momusuarios, va, modist, mmdist);
        Disponibilidad disponibible = new Disponibilidad(vp, mmaula);
    }

}
