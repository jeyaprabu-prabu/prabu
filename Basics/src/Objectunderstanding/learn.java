package Objectunderstanding;

public class learn extends strict {
	
	transfer t =new transfer();
	//strict k=new strict();
	
	void m() {
		System.out.println("I Am Fine");
	}

	void n() {
		System.out.println("I Am bad");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		learn obj = new learn();
		obj.m();
		// learn obj1=new learn();
		// learn obj2=obj1;
		// obj1. equals(obj2);
		obj.t.j();
		obj.k.m();

	}

}

class transfer {
	void j() {
		System.out.println("ok");
	}
}
class strict{
	void m(){
		System.out.println("thank u");
	}
}