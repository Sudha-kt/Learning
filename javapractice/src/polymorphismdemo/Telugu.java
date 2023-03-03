package polymorphismdemo;

public class Telugu extends English {
	public void language() {
		System.out.println("Telugu Language");
	}
	public static void main(String[] args) {
         Languageclass a=new Languageclass();
         a.language();
         Tamil b=new Tamil();
         b.language();
         English c=new English();
         c.language();
         Telugu d=new Telugu();
         d.language(); 
	}
}
