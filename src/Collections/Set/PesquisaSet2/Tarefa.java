package Collections.Set.PesquisaSet2;

public class Tarefa {
    private String descricao;
    private boolean concluido;


    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = false;
    }


    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa: " +
                 descricao + "\n" +
                "Concluída: " + concluido + "\n";
    }

    public boolean isConcluido() {
        return concluido;
    }


}
