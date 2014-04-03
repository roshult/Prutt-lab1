import java.awt.Color;

import javax.swing.JButton;

//buttonclass
public class MyButton extends JButton{	
	JButton button;
	String text1;
	String text2;
	Color color1;
	Color color2;
	
	MyButton(Color c1, Color c2, String s1, String s2){
		this.setText(s1);
		this.setBackground(c1);
		text1 = s1;
		text2 = s2;
		color1 = c1;
		color2 = c2;
	}
	
	public void toggle(){
		if (this.getText().equals(this.text1)){
			this.setText(this.text2);
			this.setBackground(this.color2);
		}
		else{
			this.setText(this.text1);
			this.setBackground(this.color1);
		}
	}
}
