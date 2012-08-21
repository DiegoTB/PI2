package pi2.curriculo.models;

import pi2.curriculo.dao.UniversidadeDaoImp;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alezonez
 */


public class Curriculo {
    
    public Curriculo(){}

    int id;
    int uni_id;
    String obs;
    Universidade universidade;
    
    public int getId(){
        return id;
    }
    
    private void setId(int id){
        this.id = id;
    }
    
    public String getObs(){
        return obs;
    }
    
    public void setObs(String obs){
        this.obs = obs;
    }

    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
    }
    
    public Universidade getUniversidade(){
        return universidade = new UniversidadeDaoImp().getUniversidade(uni_id);
    }
    
}
