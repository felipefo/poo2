import java.util.TimerTask;
import java.util.Timer;
import java.util.Date;
import javax.swing.*;

public class Relogio extends TimerTask {
	final static long MILLISECONDS_PER_SECOND = 1000;
	private Timer timer = new Timer();

	private JLabel label;
        
	public Relogio(JLabel label) {
		timer.schedule(this, 2000, 1*MILLISECONDS_PER_SECOND);                                                                
                this.label = label;
	}

	public void run() {
		Date time = new Date();		                
		label.setText(time.toString());		
	}
}

