package AST;

public class Testa implements ASTNode {
	
	ASTNode t1;
	

	public Testa(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Testa(FROM ");
		t1.print();
		System.out.println(")");

	}

}
