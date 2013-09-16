package br.com.lab.controller;

import br.com.lab.bean.Funcionario;
import br.com.lab.dao.FuncionarioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Giovani
 */
@ManagedBean(name="FuncionarioController")
@SessionScoped
public class FuncionarioController {
   private FuncionarioDAO objFuncDAO;
   private Funcionario objFunc;

    public FuncionarioController() {
        objFunc = new Funcionario();
    }

    public Funcionario getObjFunc() {
        return objFunc;
    }

    public void setObjFunc(Funcionario objFunc) {
        this.objFunc = objFunc;
    }
    
    public String autenticar(){
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuariologado", false);         
        String resultado = "/login";
        objFuncDAO = new FuncionarioDAO();
        boolean retorno = objFuncDAO.getAutenticacao(objFunc.getLogin_funcionario(), objFunc.getSenha_funcionario());
        if(retorno){
            resultado = "/adm/index";
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuariologado", true); 
            System.out.println("Logou!!!!");             
        }

        return resultado;
        
    }
    
    public String logOut(){
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuariologado", false);
        System.out.println("Saiu!!!!"); 
        return "/login";
    }
}
