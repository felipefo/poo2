
package mementoexamplo;

/**
 *
 * @author felipe
 */
public class ConfiguracaoSO implements Cloneable{
    
    private boolean usb  = false;
    private boolean wifi  = false;    
    private double versaoSO = 1.0;
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean isUsb() {
        return usb;
    }

    public void setUsb(boolean usb) {
        this.usb = usb;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    
    public double getVersaoSO() {
        return versaoSO;
    }

    public void setVersaoSO(double versaoSO) {
        this.versaoSO = versaoSO;
    }    
    
    
}
