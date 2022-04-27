package teste;

import java.util.ArrayList;

/**
 *
 * @author 205531
 */
public class MiniBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Usuarios u = new Usuarios("José Arthur", 15, 'M', 935703249);
        Usuarios u2 = new Usuarios("André Pedro", 25, 'M', 95697056);
        
        Livros liv = new Livros("Cabra Da minha mae", "Desconhecido", "Financas", "Azul", 2019, 425);
        Livros liv2 = new Livros("Como Fazer Amigos", "Dale Carnegie", "Auto Ajuda", "VD", 1985, 475);
        
        Emprestimo empre = new Emprestimo("20/02/2022", "22h30");
        Emprestimo empre2 = new Emprestimo("31/01/2022", "12h30");
        
        empre.User().add(u2);
        empre.Book().add(liv);
        empre2.User().add(u);
        empre2.Book().add(liv2);
        
        
        System.out.println("O Usuario: " + empre.User().get(0).getNome() + " Emprestou as " + empre.getHoraEmpre() + " o livro: " + empre.Book().get(0).getTitulo());
    }

}
