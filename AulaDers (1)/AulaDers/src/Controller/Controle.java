package Controller;

import Model.AmigosBEAN;
import Model.AmigosDAO;
import Model.AutoresBEAN;
import Model.AutoresDAO;
import Model.CategoriaBEAN;
import Model.CategoriaDAO;
import Model.EditoraBEAN;
import Model.EditoraDAO;
import Model.EmprestimosBEAN;
import Model.EmprestimosDAO;
import Model.Emprestimos_has_livrosBEAN;
import Model.Emprestimos_has_livrosDAO;
import Model.LivrosBEAN;
import Model.LivrosDAO;
import Model.Livros_has_autoresBEAN;
import Model.Livros_has_autoresDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controle {

    public Controle() {
    }

    //Categoria
    public long addCategoria(CategoriaBEAN categoria){
        return CategoriaDAO.getInstance().createCategoria(categoria); 
    }
    
    public void updateCategoria(CategoriaBEAN categoria){
        CategoriaDAO.getInstance().updateCategoria(categoria);
    }

    public CategoriaBEAN findCategoria(int idCategoria) {
        return CategoriaDAO.getInstance().findCategoria(idCategoria);
    }

    public static ArrayList<CategoriaBEAN> getListaCategoria() {
        return CategoriaDAO.getInstance().getAllCategorias();
    }
    
    public static ArrayList<CategoriaBEAN> pesquisarCategoria(String pesquisar, boolean inativa){
        return CategoriaDAO.getInstance().pesquisarCategoria(pesquisar, inativa);
    }    
    
    
    //Editora
    public long addEditora(EditoraBEAN editora){
        return EditoraDAO.getInstance().createEditora(editora); 
    }
          
    public void updateEditora(EditoraBEAN editora){
        EditoraDAO.getInstance().updateEditora(editora);
    }
    
    public EditoraBEAN findEditora(int idEditora) {
        return EditoraDAO.getInstance().findEditora(idEditora);
    }
    
    public static ArrayList<EditoraBEAN> getListaEditora() {
        return EditoraDAO.getInstance().getAllEditora();
    }
    
    public static ArrayList<EditoraBEAN> pesquisarEditora(String pesquisar, boolean inativa){
        return EditoraDAO.getInstance().pesquisarEditora(pesquisar, inativa);
    }

    
    //Autores
    public long addAutores(AutoresBEAN autores){
        return AutoresDAO.getInstance().createAutores(autores); 
    }
    
    public void updateAutores(AutoresBEAN autores){
        AutoresDAO.getInstance().updateAutores(autores);
    }

    public ArrayList<Livros_has_autoresBEAN> findAutores(int idAutores) {
        return Livros_has_autoresDAO.getInstance().findAutores(idAutores);
    }
    
      public AutoresBEAN findAutoresNome(int idAutores) {
        return AutoresDAO.getInstance().findAutores(idAutores);
    }
      
    public static ArrayList<AutoresBEAN> getListaAutores() {
        return AutoresDAO.getInstance().getAllAutores();
    }
    
    public static ArrayList<AutoresBEAN> pesquisarAutores(String pesquisar, boolean inativa){
        return AutoresDAO.getInstance().pesquisarAutores(pesquisar, inativa);
    }
        
    
    //Livros
    public void addLivros(LivrosBEAN livros, ArrayList<Integer> contaAutores) throws SQLException{
        LivrosDAO.getInstance().createLivros(livros, contaAutores); 
    }
    
    public void updateLivros(LivrosBEAN livros, ArrayList<Integer> contaAutores) throws SQLException{
        LivrosDAO.getInstance().updateLivros(livros, contaAutores);
    }
    
    public static ArrayList<LivrosBEAN> getListaLivros() {
        return LivrosDAO.getInstance().getAllLivros();
    }
    
    public static ArrayList<LivrosBEAN> pesquisarLivros(String pesquisar, boolean inativa){
        return LivrosDAO.getInstance().pesquisarLivros(pesquisar, inativa);
    }

    public ArrayList<Emprestimos_has_livrosBEAN> findLivros(int idEmprestimos) {
        return Emprestimos_has_livrosDAO.getInstance().findLivros(idEmprestimos);
    }
    
    public LivrosBEAN findLivrosNomes(int idLivros) {
        return LivrosDAO.getInstance().findLivros(idLivros);
    }
    
    //Amigos 
    public long addAmigos(AmigosBEAN amigos){
        return AmigosDAO.getInstance().createAmigos(amigos); 
    }
    
    public void updateAmigos(AmigosBEAN amigos){
        AmigosDAO.getInstance().updateAmigos(amigos);
    } 
         
    public AmigosBEAN findAmigosNome(int idAmigos) {
        return AmigosDAO.getInstance().findAmigos(idAmigos);
    }
      
    public static ArrayList<AmigosBEAN> getListaAmigos() {
        return AmigosDAO.getInstance().getAllAmigos();
    }
    
    public static ArrayList<AmigosBEAN> pesquisarAmigos(String pesquisar, boolean inativa){
        return AmigosDAO.getInstance().pesquisarAmigos(pesquisar, inativa);
    }

    
    //Emprestimos
    public void addEmprestimos(EmprestimosBEAN emprestimos, ArrayList<Integer> contaLivros) throws SQLException{
        EmprestimosDAO.getInstance().createEmprestimos(emprestimos, contaLivros); 
    }
    
    public void updateEmprestimos(EmprestimosBEAN emprestimos, ArrayList<Integer> contaLivros) throws SQLException{
        EmprestimosDAO.getInstance().updateEmprestimos(emprestimos, contaLivros);
    }
    
    public static ArrayList<EmprestimosBEAN> getListaEmprestimos() {
        return EmprestimosDAO.getInstance().getAllEmprestimos();
    }
    
    public static ArrayList<EmprestimosBEAN> pesquisarEmprestimos(String pesquisar, boolean inativa){
        return EmprestimosDAO.getInstance().pesquisarEmprestimos(pesquisar, inativa);
    }
    
    public Date converterData(String data){
        return EmprestimosDAO.getInstance().converterData(data);
    }
    
}
