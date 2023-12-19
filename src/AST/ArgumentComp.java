package AST;

public class ArgumentComp extends ArgumentsClasses implements ASTNode {
	ASTNode t1,t2;
	

	public ArgumentComp(ASTNode t1, ASTNode t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ArgumentComp(");
		t1.print();
		System.out.println(",");
		t1.print();
		System.out.println(")");

	}

}
