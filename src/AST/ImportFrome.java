package AST;

public class ImportFrome implements ASTNode {

	ASTNode t1;
	
	public ImportFrome(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ImportFrome(");
		
		t1.print();
		
		
		System.out.println(")");

	}

}
