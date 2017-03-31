package listaadapter;

import java.util.List;

public class ListaAdapterArrayComAdapter {
    
    public static void main(String[] args) {        
        String[] lista = new String[2];
        lista[0] = "Pastel";
        lista[1] = "Quibe";
        ArrayStringAdapter  listaAdapter = new ArrayStringAdapter(lista);        
        processaLista(listaAdapter);        
    }        
    public static void  processaLista(List<String> lista){                
        for(int index=0; index<lista.size(); index++){
            String value  = lista.get(index);
            System.out.println(value);            
        }        
    }    
}

