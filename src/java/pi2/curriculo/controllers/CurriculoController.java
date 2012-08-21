/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi2.curriculo.controllers;

import pi2.curriculo.dao.CurriculoDao;
import pi2.curriculo.dao.CurriculoDaoImp;        
import pi2.curriculo.models.Curriculo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author alezonez
 */
@ManagedBean
@SessionScoped
public class CurriculoController {
    private Curriculo curriculo;
    private DataModel listaCurriculos;
    
    public DataModel getListarCurriculos(){
        List<Curriculo> lista = new CurriculoDaoImp().list();
        listaCurriculos = new ListDataModel(lista);
        return listaCurriculos;        
    }
    
    public Curriculo getCurriculo(){
        return curriculo;
    }
    
    public void setCurriculo(Curriculo curriculo){
        this.curriculo = curriculo;
    }
    
    public String novoCurriculo(){
        curriculo = new Curriculo();
        return "gerenciarCurriculo";
    }
    
    public String editarCurriculo(){
        curriculo = (Curriculo)(listaCurriculos.getRowData());
        return "gerenciarCurriculo";
    }
    
    public String excluirCurriculo(){
        Curriculo curriculoTemp = (Curriculo)(listaCurriculos.getRowData());
        CurriculoDao dao = new CurriculoDaoImp();
        dao.remove(curriculoTemp);
        return "index";        
    }
    
    public String criarCurriculo(){
        CurriculoDao dao = new CurriculoDaoImp();
        dao.save(curriculo);
        return "index";
    }
    public String atualizarCurriculo(){
        CurriculoDao dao = new CurriculoDaoImp();
        dao.update(curriculo);
        return "index";
    }
}
