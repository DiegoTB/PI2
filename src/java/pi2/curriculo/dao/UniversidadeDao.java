/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi2.curriculo.dao;

import pi2.curriculo.models.Universidade;
import java.util.List;
/**
 *
 * @author alezonez
 */
public interface UniversidadeDao {
    public void save (Universidade curriculo);
    public Universidade getUniversidade(int id);
    public List<Universidade> list();
    public void remove(Universidade universidade);
    public void update(Universidade universidade);
}

