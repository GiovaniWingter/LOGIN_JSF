

package br.com.lab.bean;

import br.com.lab.util.CripografiatUtil;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Giovani
 */

@ManagedBean(name="FuncionarioBean")
@RequestScoped
public class Funcionario {
    
    private int idFuncionario;
    private String nome_funcionario ;
    private String sexo ;
    private String cpf_funcionario;
    private String rg_funcionario;
    private String email_funcionario;
    private String login_funcionario;
    private String senha_funcionario ;

    public Funcionario() {
    }

    public String getCpf_funcionario() {
        return cpf_funcionario;
    }

    public void setCpf_funcionario(String cpf_funcionario) {
        this.cpf_funcionario = cpf_funcionario;
    }

    public String getEmail_funcionario() {
        return email_funcionario;
    }

    public void setEmail_funcionario(String email_funcionario) {
        this.email_funcionario = email_funcionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getLogin_funcionario() {
        return login_funcionario;
    }

    public void setLogin_funcionario(String login_funcionario) {
        this.login_funcionario = login_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getRg_funcionario() {
        return rg_funcionario;
    }

    public void setRg_funcionario(String rg_funcionario) {
        this.rg_funcionario = rg_funcionario;
    }

    public String getSenha_funcionario() {
        return senha_funcionario;
    }
        
    public void setSenha_funcionario(String senha_funcionario) {
        this.senha_funcionario = senha_funcionario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   
}
