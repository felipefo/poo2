package exemplo.templateestrategia;


public abstract class MatriculaSuperior implements IProcessaMatricula{            
    
    @Override
    public void processar(){        
        registrarDocumentos();    
        validarDocumentos();            
        calcularCustos();        
        gerarMatriculaAluno();                
    }            
    public abstract double validarDocumentos();    
    public abstract double registrarDocumentos();    
    public abstract void calcularCustos();        
    public abstract void gerarMatriculaAluno();       
            
}
