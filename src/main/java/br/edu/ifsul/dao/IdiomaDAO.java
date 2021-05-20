/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.dao;

import br.edu.ifsul.converters.ConverterOrdem;
import br.edu.ifsul.modelo.Idioma;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author marco
 */

@Stateful
public class IdiomaDAO<TIPO>  extends DAOGenerico<Idioma> implements Serializable {
    
    public IdiomaDAO(){
        super();
        classePersistente = Idioma.class;
        //definir as ordens possíveis
        listaOrdem.add(new Ordem("id", "ID", "="));
        listaOrdem.add(new Ordem("nome", "Nome", "like"));
        listaOrdem.add(new Ordem("sigla", "Sigla", "like"));
        
        //definir ordem inicial
        ordemAtual = listaOrdem.get(1);
        
        //inicializar o conversor de dados
        converterOrdem = new ConverterOrdem();
        converterOrdem.setListaOrdem(listaOrdem);  
    }

}
