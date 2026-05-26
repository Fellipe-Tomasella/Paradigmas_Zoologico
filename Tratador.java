class Tratador {
    int matricula;
    String nome;

    Tratador(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    void imprimir() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
    }
}
