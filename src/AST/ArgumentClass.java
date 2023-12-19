package AST;

public class ArgumentClass extends ArgumentsClasses implements ASTNode {
	ASTNode t1;
	

	public ArgumentClass(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ArgumentClass(");
		t1.print();
		System.out.println(")");

	}

}
