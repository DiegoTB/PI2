/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi2.curriculo.models;

import java.util.Map;
import pi2.curriculo.dao.UniversidadeDaoImp;

/**
 *
 * @author alezonez
 */
public class Universidade {
    private int id;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
