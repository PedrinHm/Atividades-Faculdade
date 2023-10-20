package Model;

import java.util.Date;

public class EmprestimosBEAN {
    
    private int idEmprestimos;
    private Date data;
    private int amigos_idAmigos;
    private String status;
    
    public EmprestimosBEAN(int idEmprestimos, Date data, int amigos_idAmigos, String status){
                 this.idEmprestimos = idEmprestimos;
                 this.data = data;
                 this.amigos_idAmigos = amigos_idAmigos;
                 this.status = status;
    }

    public int getIdEmprestimos() {
        return idEmprestimos;
    }
    
    public void setIdEmprestimos(int idEmprestimos) {
        this.idEmprestimos = idEmprestimos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getAmigos_idAmigos() {
        return amigos_idAmigos;
    }

    public void setAmigos_idAmigos(int amigos_idAmigos) {
        this.amigos_idAmigos = amigos_idAmigos;
    } 

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
