public class TestaGerente {
    public static void main(String[] args){
        Gerente funcionario1 = new Gerente();
        funcionario1.setNome("Giovana");
        funcionario1.setSenha(2222);
        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(funcionario1);
    }
}