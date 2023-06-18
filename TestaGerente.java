public class TestaGerente {
    public static void main(String[] args){
        Gerente funcionario1 = new Gerente();
        funcionario1.setNome("Giovana");
        funcionario1.setSenha("123456");
        System.out.println(funcionario1.autenticar("123456"));
    }
}