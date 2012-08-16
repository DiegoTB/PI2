package pi2.curriculo.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alezonez
 */

@Entity
@Table(name = "curriculos")


public class Curriculo {
    
    public Curriculo(){}
    
    @Id
    @Column(name = "id")
    Integer id;
    
    @Column(name = "obs")
    String obs;
    
    public Integer getId(){
        return id;
    }
    
    private void setId(Integer id){
        this.id = id;
    }
    
    public String getObs(){
        return obs;
    }
    
    public void setObs(String obs){
        this.obs = obs;
    }
    
    
}
