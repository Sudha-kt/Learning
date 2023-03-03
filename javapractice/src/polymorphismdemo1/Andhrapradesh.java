package polymorphismdemo1;

public class Andhrapradesh extends Kerala {
	public void india() {
		System.out.println("Language in Andhrapradesh: Telugu");
	}

	public static void main(String[] args) {
		India a=new India();
		a.india();
		Tamilnadu b=new Tamilnadu();
		b.india();
		Kerala c=new Kerala();
		c.india();
        Andhrapradesh d=new Andhrapradesh();
        d.india();
	}
}
