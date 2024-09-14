package OOP_Inheritance;

public class TestFamily {

	public static void main(String[] args) {
		
		Munu mn = new Munu();
		mn.hair();
		mn.voice();
		mn.height();
		Munu.designation();
		
		System.out.println("papa======================");
		
		Papa pp = new Papa();
		pp.face();
		pp.height();
		Papa.designation();
		
		System.out.println("mummy======================");
		Papa pp1 = new Munu();
	//	pp1.hair(); papa can't access this method bcoz it is the method of munu
		pp1.face();
		pp1.height();
		
		
	}
}
