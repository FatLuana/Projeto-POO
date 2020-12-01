/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmcontrol.model.dao;

import br.com.farmcontrol.model.vo.LoteAves;
import br.com.farmcontrol.model.vo.Ovo;

/**
 *
 * @author viniciuslopes
 */
public class OvoDAODemo {
    public static void main(String[] args){
        
        LoteAves lote = new LoteAves();
        lote.setId_animal(1);
        
        Ovo o = new Ovo();
        OvoDao dao = new OvoDao();
                
        o.setLote(lote);
        o.setQtd_ovos(20);
        o.setValor_unidade((float) 0.3);
        
        System.out.println(o.getLote().getId_animal());
        System.out.println(o.getQtd_ovos());
        System.out.println(o.getValor_unidade());
        
        dao.create(o);
    }
    
}
