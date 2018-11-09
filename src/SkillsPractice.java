import java.util.Random;

import javax.swing.JOptionPane;

public class SkillsPractice {
		public static void main(String[] args) {

		SkillsPractice skills = new SkillsPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		         	skills.skill5();
		}

		void skill1() {
		String input=JOptionPane.showInputDialog("how many dimes do you have");
		int inte=Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, "you have"+inte*10+"cents");
		String height=JOptionPane.showInputDialog("how tall are you");
		int a= Integer.parseInt(height);
		if(a<36){
			JOptionPane.showMessageDialog(null, "eat you Wheaties");
			
		}
		}
		void skill2() {
			
			
			for(int i=1;i<30;i++) {
			if(i%3==1) {
				System.out.println(i);
			}
			}
		}
		void skill3() {
	Random r=new Random();
	int i=r.nextInt(20);
	System.out.println(i);
	Random l= new Random();
	int j=l.nextInt(10);
	System.out.println(j);
	System.out.println(i-j);
			
			
			
		}
		void skill4() {
			String city=JOptionPane.showInputDialog("what city do you live in?");
			if (city.equals("San Diego")) {
				System.out.println("you live in America's Finest City" );
			}else {
				System.out.println("move to San Diego");
			}
			int car=1;
			String model=JOptionPane.showInputDialog("make or model of car");
			if (car==0) {
				JOptionPane.showMessageDialog(null,"I bet you use public transportation.");
			}else if(car==1) {
				JOptionPane.showMessageDialog(null, model);
			}else {

					int wheels=4;
					wheels=wheels*car;
				
				
				System.out.println(wheels);
			}
		}
		void skill5() {
			String school=JOptionPane.showInputDialog(" name of school");
			JOptionPane.showMessageDialog(null, school+" is a fantastic school");
}}
