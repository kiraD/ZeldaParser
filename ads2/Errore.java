
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Errore extends JPanel{
	/*
	 * composant qui va afficher dans un JTextArea les exceptions capturés
	 */
	private JTextArea jtf ;
	String error ="";
	
	public Errore() {
		jtf = new JTextArea("Y A T-IL UNE ERREURE ?") ;
		   this.setBackground(new Color(15, 5, 107));
		   jtf.setBackground(new Color(15, 5, 107));
		   jtf.setBackground(Color.WHITE);
		   this.setBackground(Color.WHITE);
		   Font police = new Font("Arial", Font.BOLD, 15);
		   jtf.setFont(police);
		   
		    jtf.setForeground(Color.RED);
		    jtf.setEditable(false);
		    this.add(jtf);
	}
	  public void setTexte(String texte) {
		    this.jtf.setText(texte);
	  }

	  public String getTexte(){
		  return this.jtf.getText();
	  }


}
