import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu {
	
	private JFrame window;
	private ImageIcon bImage;
	private JLabel backgroundeContainer;
	private JButton startGame;
	private volatile boolean isImageVisible;
	
	public MainMenu(JFrame theWindow){
		window = theWindow;
		bImage = new ImageIcon("battleTitle.png");
		backgroundeContainer = new JLabel(bImage);
		isImageVisible = true;
	}
	
	// create loading screen as first screen
	public void loadTitleScreen() {
		backgroundeContainer.setSize(window.getContentPane().getWidth(),
				window.getContentPane().getHeight()/2);
		backgroundeContainer.setLocation(0, 0); 
		backgroundeContainer.setVisible(true);
		
		
		startGame = new JButton("Start Game");
		startGame.setSize(200, 100);
		startGame.setLocation(350, backgroundeContainer.getHeight() + 50);
		startGame.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				window.getContentPane().remove(startGame);
				window.getContentPane().remove(backgroundeContainer);
				window.getContentPane().revalidate();
				window.getContentPane().repaint();
				window.getContentPane().setBackground(Color.WHITE);
				isImageVisible = false;
			}	
		});
		
		startGame.setVisible(true);

		window.getContentPane().add(startGame);
		window.getContentPane().add(backgroundeContainer);
		
		
		window.getContentPane().setBackground(Color.BLACK);
		window.setVisible(true);
		window.getContentPane().revalidate();
		window.getContentPane().repaint();
	}

	public boolean isImageVisible(){
		return isImageVisible;
	}
	
}
