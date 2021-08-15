package modelo;

public class oMateria {

    private String Codigo;
    private String Nombre;
    private String Carrera;
    private String Anio;
    private int Grupos;
    private String Paridad;
    //
    private String mgCodigo;
    private String mgGrupo;
    private int mgAsignadas;
    //
    private String cicloNombre;

    public oMateria() {
    }

    public int getGrupos() {
        return Grupos;
    }

    public void setGrupos(int Grupos) {
        this.Grupos = Grupos;
    }

    public String getParidad() {
        return Paridad;
    }

    public void setParidad(String Paridad) {
        this.Paridad = Paridad;
    }        

    public String getCicloNombre() {
        return cicloNombre;
    }

    public void setCicloNombre(String cicloNombre) {
        this.cicloNombre = cicloNombre;
    }
    
    public int getMgAsignadas() {
        return mgAsignadas;
    }

    public void setMgAsignadas(int mgAsignadas) {
        this.mgAsignadas = mgAsignadas;
    }
    
    public String getMgCodigo() {
        return mgCodigo;
    }

    public void setMgCodigo(String mgCodigo) {
        this.mgCodigo = mgCodigo;
    }

    public String getMgGrupo() {
        return mgGrupo;
    }

    public void setMgGrupo(String mgGrupo) {
        this.mgGrupo = mgGrupo;
    }          

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }
   
}
