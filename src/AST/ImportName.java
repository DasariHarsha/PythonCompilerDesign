package AST;

public class ImportName implements ASTNode {
	ASTNode t1;
	

	public ImportName(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("ImportName( ");
		t1.print();
		System.out.println(")");
	}

}
