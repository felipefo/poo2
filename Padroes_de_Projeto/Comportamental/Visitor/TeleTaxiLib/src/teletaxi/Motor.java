
package teletaxi;


public class Motor implements Visitavel{
    
    int potencia = 0;
    int pressaoOleo=0;
    int nivelAgua=0;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPressaoOleo() {
        return pressaoOleo;
    }

    public void setPressaoOleo(int pressaoOleo) {
        this.pressaoOleo = pressaoOleo;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    @Override
    public void acceptVisitor(TransportVisitor visitor) {
          visitor.visit(this);
    }
    
    
    
}
