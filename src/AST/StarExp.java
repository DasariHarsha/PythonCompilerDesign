package AST;

public class StarExp implements ASTNode {
	ASTNode t1;
	

	public StarExp(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("StarExp(");
		t1.print();
		System.out.println(")");
		

	}

}
