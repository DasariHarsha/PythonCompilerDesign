package AST;

public class Comparsion extends ComparsionAbstractClass implements ASTNode {
	ASTNode t1;
	

	public Comparsion(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Comparsion(");
		t1.print();
		
		System.out.println(")");

	}

}
