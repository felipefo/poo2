
package teletaxi;

public interface TransportVisitor {    
    
    public void visit(Taxi taxi);
    public void visit(GPS gps);
    public void visit(Velocidade velocidade);
    public void visit(Motor motor);
}
