public class Cliente implements Autenticavel{
    private int senha = 2222;

    @Override
    public void setSenha(int senha){
            this.senha = senha;
    }

    @Override
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }
        return false;
    }
}
