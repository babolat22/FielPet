package entidades;
import java.time.LocalDate;

public class Mascota {
    private int id = -1;
    private String apodo;    // VARCHAR
    private String raza;
    private char sexo;
    private String obs;
    private boolean activo;   //TINYINT
 
    public Mascota(int id, String apodo, String raza, char sexo, String obs, boolean activo) {
        this.id = id;
        this.apodo = apodo;
        this.raza = raza;
        this.sexo=sexo;
        this.obs=obs;
        this.activo = activo;
    }

    public Mascota(String apodo, String raza, char sexo, String obs, boolean activo) {
        this.id = -1;
        this.apodo = apodo;
        this.raza = raza;
        this.sexo=sexo;
        this.obs=obs;
        this.activo = activo;
    }
    public Mascota(){
        this.id = -1;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getApodo() {
        return apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public boolean getActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    public String toString(){
        return id+"Mascota-> "+apodo+" - "+raza+". Sexo- "+sexo;
    }
    
}
