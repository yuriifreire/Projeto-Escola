/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.web.bean;

import br.edu.ifrn.web.controle.CursoControle;
import br.edu.ifrn.web.modelo.Curso;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


/**
 *
 * @author yuri
 */

@Model
public class CursoBean {
    
   

    @Inject
    private CursoControle cursoDao;
    @Inject
    private Curso cursomodel;
    @Inject
    private FacesContext facesContext;
    
    private int idbean;

        public CursoControle getCursoDao() {
            return cursoDao;
        }

        public void setCursoDao(CursoControle cursoDao) {
            this.cursoDao = cursoDao;
        }

        public Curso getCursomodel() {
            return cursomodel;
        }

        public void setCursomodel(Curso cursomodel) {
            this.cursomodel = cursomodel;
        }

        public FacesContext getFacesContext() {
            return facesContext;
        }

        public void setFacesContext(FacesContext facesContext) {
            this.facesContext = facesContext;
        }

        public int getIdbean() {
            return idbean;
        }

        public void setIdbean(int idbean) {
            this.idbean = idbean;
        }
   
        
   public String salvarCurso(){
   String path = "/curso/"  ;
   String mensagem;
   if(cursomodel.getId()!= null){
       cursoDao.atualizar(cursomodel);
       mensagem = "Curso salvo com suceso";
   }else{
       cursoDao.salvar(cursomodel);
       mensagem = "Curso salvo com sucesso";
   }
   
   cursomodel = new Curso();
   facesContext.getExternalContext().getFlash().setKeepMessages(true);
   facesContext.addMessage(null,new FacesMessage(mensagem));
   
   return "curso.xhtml";
}

}
