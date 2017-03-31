package listaadapter;

import java.util.ArrayList;
import java.util.List;

public class ListaAdapterArrayList {
    public static void main(String[] args) {        
        ArrayList lista = new ArrayList();
        lista.add("Pastel");
        lista.add("Quibe");
        processaLista(lista);        
    }        
    public static void  processaLista(List<String> lista){                
        for(int index=0; index<lista.size(); index++){
            String value  = lista.get(index);
            System.out.println(value);            
        }        
    }    
}

