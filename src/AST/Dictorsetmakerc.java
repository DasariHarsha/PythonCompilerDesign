package AST;

public class Dictorsetmakerc extends DecoratorAbstractClass implements ASTNode {
	
	ASTNode t1,t2,t3;
	

	public Dictorsetmakerc(ASTNode t1, ASTNode t2, ASTNode t3) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Dictorsetmakerc(,");
		t1.print();
		System.out.println(",:,");
		t2.print();
		System.out.println(",");
		t3.print();
		System.out.println(")");

	}

}
