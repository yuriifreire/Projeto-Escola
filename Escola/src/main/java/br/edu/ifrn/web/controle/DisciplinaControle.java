/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.web.controle;

import br.edu.ifrn.web.modelo.Disciplina;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author yuri
 */
public class DisciplinaControle {
    

    @PersistenceContext
    private EntityManager entityManeger;

    @Transactional
    public void salvar(Disciplina disciplina) {
        entityManeger.persist(disciplina);
    }
    @Transactional
    public void atualizar (Disciplina disciplina) {
        entityManeger.merge(disciplina);
    }
    
    /*public List<disciplina> listar(){
        
        return entityManeger.createQuery("from disciplina").getResultList();
    }*/
    
    public void excluir(Disciplina disciplina){
        entityManeger.remove(disciplina);
    }
    
}
