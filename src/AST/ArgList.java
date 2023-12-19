package AST;

public class ArgList extends ArgumentsClasses implements ASTNode {
	ASTNode t1;
	

	public ArgList(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ArgList(");
		t1.print();
		System.out.println(")");

	}

}
