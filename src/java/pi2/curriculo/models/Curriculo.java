package pi2.curriculo.models;


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
    String obs;
    
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
    
    
}
