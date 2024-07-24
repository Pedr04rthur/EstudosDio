package Collections.List.PesquisaLista;

import java.util.ArrayList;
import java.util.List;

public class CatologoLivros {

    private List<Livro> livroList;

    public CatologoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        //Adicionando um novo livro
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        //Esse método Empty é "se a lista vazia"
        //EXCLAMAÇÃO PARA NEGAÇÃO
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervaloAno.add(l);
                }
            }
        }
        return livroPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo =null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;

    }

    public static void main(String[] args) {
        CatologoLivros livros = new CatologoLivros();
        livros.adicionarLivro("Livro 1","Pedro",2004);
        livros.adicionarLivro("Livro 2","Arthur",2008);
        livros.adicionarLivro("Livro 3","Holanda",2012);
        livros.adicionarLivro("Livro 1","Nery",2016);

        System.out.println(livros.pesquisarPorIntervaloAnos(2004,2016));

    }

}
