package AST;

public class ForStmta implements ASTNode {
	ASTNode t1,t2,t3,t4,t5,t6;
	

	public ForStmta(ASTNode t1, ASTNode t2, ASTNode t3, ASTNode t4, ASTNode t5, ASTNode t6) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.t6 = t6;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ForStmta(FOR,");
		t1.print();
		System.out.println(",");
		System.out.println("IN,");
		t2.print();
		System.out.println(",");
		
		t3.print();
		System.out.println(",");
		t4.print();
		System.out.println(",");
		System.out.println(":,");
		t5.print();
		System.out.println(",");
		t6.print();
		System.out.println(")");
		

	}

}
