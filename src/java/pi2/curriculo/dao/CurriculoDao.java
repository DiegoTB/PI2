/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi2.curriculo.dao;

import pi2.curriculo.models.Curriculo;
import java.util.List;

/**
 *
 * @author alezonez
 */
public interface CurriculoDao {
    public void save (Curriculo curriculo);
    public Curriculo getCurriculo(int id);
    public List<Curriculo> list();
    public void remove(Curriculo curriculo);
    public void update(Curriculo curriculo);
}
