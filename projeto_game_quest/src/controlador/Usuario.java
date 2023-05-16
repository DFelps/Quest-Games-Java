package controlador;

public class Usuario 
{
    private int id;
    private String nick;
    private String email;
    private String senha;
    
    public Usuario(){
        
    }

    public Usuario(int id,String nick, String email, String senha) {
        this.id = id;
        this.nick = nick;
        this.email = email; 
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nick=" + nick + ", email=" + email + '}';
    }
}
