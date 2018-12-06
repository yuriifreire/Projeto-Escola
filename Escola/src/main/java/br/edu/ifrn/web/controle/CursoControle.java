/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.web.controle;


import br.edu.ifrn.web.modelo.Curso;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author yuri
 */
public class CursoControle {
    

    @PersistenceContext
    private EntityManager entityManeger;

    @Transactional
    public void salvar(Curso curso) {
        entityManeger.persist(curso);
    }
    @Transactional
    public void atualizar (Curso curso) {
        entityManeger.merge(curso);
    }
    
    public void excluir(Curso curso){
        entityManeger.remove(curso);
    }
    
}
