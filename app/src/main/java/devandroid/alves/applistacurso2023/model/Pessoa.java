package devandroid.alves.applistacurso2023.model;

//OrdemDePagamento - pascalCase- CaneCase são exemplos

public class Pessoa {

    //Contrutor
    // Atributos - Objetos - Molde - modelo - template
    // Métodos de Acesso - Getts and setts

    private String primeiroNome;  //Primeiro Nome
    private String sobreNome;
    private String telefoneContato;
    private String cursoDesejado;


    public Pessoa(){}

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }
}

