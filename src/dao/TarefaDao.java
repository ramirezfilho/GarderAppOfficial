/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Model.Tarefa;
import java.util.List;

/**
 *
 * @author José Alexandre
 */
public interface TarefaDao {

    public void save(Tarefa tarefa);
    public Tarefa getLivro(long id);
    public List<Tarefa> list();
    public void remove(Tarefa livro);
    public void update(Tarefa livro);

}
