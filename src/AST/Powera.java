package AST;

public class Powera implements ASTNode {
	
	ASTNode t1;
	

	public Powera(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Powera(**,");
		t1.print();
		System.out.println(")");

	}

}
