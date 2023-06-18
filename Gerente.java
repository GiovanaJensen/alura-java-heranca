public class Gerente extends Funcionario{
    private String senha;

    public boolean autenticar(String senha){
        if(this.senha == senha){
            return true;
        }
        return false;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}