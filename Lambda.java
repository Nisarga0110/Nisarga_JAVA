package Nisarga;

interface msg{
	int  add(int a,int b);
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		msg m = (x,y) ->x+y;
		System.out.println(m.add(2,4));

	}

}
