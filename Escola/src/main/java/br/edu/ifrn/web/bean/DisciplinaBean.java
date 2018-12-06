/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.web.bean;

import br.edu.ifrn.web.controle.DisciplinaControle;
import br.edu.ifrn.web.modelo.Disciplina;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


/**
 *
 * @author yuri
 */

@Model
public class DisciplinaBean {
    
   

    @Inject
    private DisciplinaControle disciplinaDao;
    @Inject
    private Disciplina disciplinamodel;
    @Inject
    private FacesContext facesContext;
    
    private int idbean;

        public DisciplinaControle getDisciplinaDao() {
            return disciplinaDao;
        }

        public void setDisciplinaDao(DisciplinaControle disciplinaDao) {
            this.disciplinaDao = disciplinaDao;
        }

        public Disciplina getDisciplinamodel() {
            return disciplinamodel;
        }

        public void setDisciplinamodel(Disciplina disciplinamodel) {
            this.disciplinamodel = disciplinamodel;
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
   
        
   public String salvarDisciplina(){
   String path = "/disciplina/"  ;
   String mensagem;
   if(disciplinamodel.getId()!= null){
       disciplinaDao.atualizar(disciplinamodel);
       mensagem = "Disciplina atualizada com suceso";
   }else{
       disciplinaDao.salvar(disciplinamodel);
       mensagem = "Disciplina salva com sucesso";
   }
   
   disciplinamodel = new Disciplina();
   facesContext.getExternalContext().getFlash().setKeepMessages(true);
   facesContext.addMessage(null,new FacesMessage(mensagem));
   
   return "disciplina.xhtml";
}

}