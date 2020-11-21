import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StartSign_Main {

  
  
	public static void main(String[] args) {
		MyJFrame mf=new MyJFrame();

	}
}
	
	class MyJFrame extends JFrame{
		  public final String ARIES="Aries";
		  public final String TAURUS="Tairus";
		  public final String GEMINI="Gemini";
		  public final String CANCER="Cancer";
		  public final String LEO="Leo";
		  public final String VIRGO="Virgo";
		  public final String LIBRA ="Libra";
		  public final String SCORPIO="Scorpio";
		  public final String SAGITTARIUS="Sagittarius";
		  public final String CAPRICORN="Capricorn";
		  public final String AQUARIUS="Aquarius ";
		  public final String PISCES="Pisces ";
		  
		private int day;
		private boolean errorB=false;;
		private String monString, startSign;
		JTextField dayOfBirth, monthOfBirth;
		JLabel result, statement, error;
		JButton b;
		
		public MyJFrame() {
			dayOfBirth=new JTextField(5);
			monthOfBirth=new JTextField(15);
			b=new JButton("See the result");
			result=new JLabel("Result");
			statement=new JLabel("Enter your date of birth");
			error=new JLabel("The format is not correct,\n"
					+ "plrease retype(ex. day:13  month:august)");
			
			
			add(statement);
			add(dayOfBirth);
			add(monthOfBirth);
			add(b);
			add(result);
			
				
				b.addActionListener(click->{
					day=Integer.parseInt(dayOfBirth.getText());
					monString=(monthOfBirth.getText());
					result.setText(calculatestartSign());
					while(errorB==true) {
						result.setText(calculatestartSign());
					}
					
				});
			
			
			
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
		}
		protected String calculatestartSign() {
			
		 switch(monString) {
			case("March"):
			case("march"):
			case("MARCH"):
			  if(day>=21) {
				  startSign=ARIES;
			  }else{
				  startSign=PISCES; 
			  }
			 break;
			case("April"):
			case("april"):
			case("APRIL"):
				if(day<=19) {
					startSign=ARIES;
				}else {
					startSign=TAURUS;
				}
			 break;
			case ("May"):
			case ("MAY"):
			case ("may"):
				if(day<=20) {
					startSign=TAURUS;
				}else {
					startSign=GEMINI;
				}
			 break;
			case ("June"):
			case ("june"):
			case ("JUNE"):
				if(day<=20) {
					startSign=GEMINI;
				}else {
					startSign=CANCER;
				}
			 break;
			case("july"):
			case("July"):
			case("JULY"):
				if(day<=22) {
					startSign=CANCER;
				}else {
					startSign=LEO;
				}
			 break;
			case("August"):
			case("august"):
			case("AUGUST"):
				if(day<=22) {
					startSign=LEO;
				}else {
					startSign=VIRGO;
				}
			break;
			case("September"):
			case("september"):
			case("SEPTEMBER"):
				if(day<=22) {
					startSign=VIRGO;
				}else {
					startSign=LIBRA;
				}
			 break;
			case("October"):
			case("october"):
			case("OCTOBER"):
				if(day<=22) {
					startSign=LIBRA;
				}else {
					startSign=SCORPIO;
				}
			 break;
			case("November"):
			case("november"):
			case("NOVEMBER"):	
				if(day<=21) {
					startSign=SCORPIO;
				}else {
					startSign=SAGITTARIUS;
				}
			 break;
			case("December"):
			case("december"):
			case("DECEMBER"):
				if(day<=21) {
					startSign=SAGITTARIUS;
				}else {
					startSign=CAPRICORN;
				}
			 break;
			case("January"):
			case("january"):
			case("JANUARY"):
				if(day<=19) {
					startSign=CAPRICORN;
				}else {
					startSign=AQUARIUS;
				}
			 break;
			case("February"):
			case("february"):
			case("FEBRUARY"):
				if(day<=18) {
					startSign=AQUARIUS;
				}else {
					startSign=PISCES;
				}
			 break;
			default:
				add(error);
				errorB=true;
			 break;
			}	
		  return startSign;
		}
	}