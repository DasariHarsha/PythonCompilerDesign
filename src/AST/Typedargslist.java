package AST;

public class Typedargslist implements ASTNode {
	ASTNode t1,t2,t3,t4;
	
	
	public Typedargslist(ASTNode t1, ASTNode t2, ASTNode t3, ASTNode t4) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Typedargslist(");
		t1.print();
		System.out.println(",");
		t2.print();
		System.out.println(",");
		t3.print();
		System.out.println(",");
		t4.print();
		System.out.println(")");
		

	}

}
