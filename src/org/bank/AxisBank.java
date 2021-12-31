package org.bank;

public class AxisBank extends CanaraBank {
@Override
	public void savings() {
		// TODO Auto-generated method stub
System.out.println("8%");	

}
public static void main(String[] args) {
AxisBank a=new AxisBank();
a.deposite();
a.savings();
a.fixed();

}
}


