package AST;

public class ArglistArgumenta extends ArgumentsClasses implements ASTNode {
	ASTNode t1,t2;
	

	public ArglistArgumenta(ASTNode t1, ASTNode t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ArglistArgumenta(C");
		t1.print();
		System.out.println(",COMMA,");
		t2.print();
		System.out.println(")");

	}

}
