package MiniBiblioteca;

import java.util.ArrayList;

/**
 *
 * @author 205531
 */
public class Emprestimo{
    
    
    private String dataEmpre;
    private String horaEmpre;
    private ArrayList<Usuarios> us = new ArrayList<Usuarios>();
    private ArrayList<Livros> book = new ArrayList<Livros>();

    public String getDataEmpre() {
        return dataEmpre;
    }

    public void setDataEmpre(String dataEmpre) {
        this.dataEmpre = dataEmpre;
    }

    public String getHoraEmpre() {
        return horaEmpre;
    }

    public void setHoraEmpre(String horaEmpre) {
        this.horaEmpre = horaEmpre;
    }

    public Emprestimo(String dataEmpre, String horaEmpre) {
        this.dataEmpre = dataEmpre;
        this.horaEmpre = horaEmpre;
    }

    
    
    public ArrayList<Usuarios> User(){
        return us;
    } 
    
    public ArrayList<Livros> Book(){
        return book;
    } 

   
}
