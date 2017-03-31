package listaadapter;

import java.util.ArrayList;
import java.util.List;

public class ListaAdapterArray {
    public static void main(String[] args) {        
        String[] lista = new String[2];
        lista[0] = "Pastel";
        lista[1] = "Quibe";
        ArrayList listaArrayList = new ArrayList();
        int index =0;
        for (String valor: lista) { 
            if(valor != null)
                listaArrayList.add(valor);            
            System.out.print(index);
            index++;
        } 
        System.out.println("");
        processaLista(listaArrayList);        
    }        
    public static void  processaLista(List<String> lista){                
        for(int index=0; index<lista.size(); index++){
            String value  = lista.get(index);
            System.out.println(value);            
        }        
    }    
}

