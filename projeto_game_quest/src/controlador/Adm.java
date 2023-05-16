/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

public class Adm {
    
    private String nomeLogin;
    private int idUsuario;
    private String senha;
    private String tipoUsuario;
    
    public Adm(){
        
    }
    
    public Adm(String nomeLogin, int idUsuario, String senha, String tipoUsuario){
        this.nomeLogin = nomeLogin;
        this.idUsuario = idUsuario;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
    
    

    /**
     * @return the nomeLogin
     */
    public String getNomeLogin() {
        return nomeLogin;
    }

    /**
     * @param nomeLogin the nomeLogin to set
     */
    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    /**
     * @return the idFuncionario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdUsuario(int IdUsuario) {
        this.idUsuario = IdUsuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
}
