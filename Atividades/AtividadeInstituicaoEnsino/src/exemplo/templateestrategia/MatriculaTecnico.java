
package exemplo.templateestrategia;

public abstract class MatriculaTecnico implements IProcessaMatricula{
    
     @Override
    public void processar(){                   
        registrarDocumentos();          
        gerarMatriculaAluno();                
    }                
    public abstract double registrarDocumentos();       
    public abstract void gerarMatriculaAluno();  
    
}
