import java.awt.*;
import java.awt.event.*;

class easting extends Frame{
	SimpleComp(String s){
		super(s);
		setLayout(null);
		Font  f = new Font("serif", Font.BOLD, 15);
		setFont(f);
		Label 11 = new Label("что желаете?", Label.CENTER);
		11.setBounds(10, 50, 120, 30); add(11);
		Label 12 = new Label("выберете способ оплаты?");
		12.setBounds(160, 50, 120, 30); add(12);
		
		Checkbox ch1 = new Checkbox("софт");
		ch1.setBounds(20, 90, 100, 30); add(ch1);
		Checkbox ch2 = new Checkbox("гайды");
		ch2.setBounds(20, 120, 100, 30); add(ch2);
		Checkbox ch3 = new Checkbox("книгу по java 2");
		ch3.setBounds(160, 50, 200, 30); add(ch3);
		
        CheckboxGroup grp = new CheckboxGroup();
		CheckboxGroup chg1 = new CheckboxGroup("visa, mastercard", grp true);
		chg1.setBounds(170, 90, 200, 30); add(chg1);
		CheckboxGroup chg2 = new Checkbox("со щёта", grp false);
		chg2.setBounds(170, 120, 200, 30); add(chg2);
		
		Button b1 = new Button("подтвердить");
		b1.setBounds(30, 220, 100, 30); add(b1);
		Button b2 = new Button("выйти");
		b2.setBounds(250, 220, 100, 30); add(b2);
		
		setSize(400, 300);
		setVisible(true);
	   }
	   public static void main(string[] args){
		   Frame f = new SimpleComp(" keyj's");
		   f.addWindowListener(new WindowEvent ev){
			   public void WindowClosing(WindowEvent ev){
				   system.exit(0);
			   }
		     });
	      }
      }

   }



		
