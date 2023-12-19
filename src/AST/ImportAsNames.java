package AST;

public class ImportAsNames implements ASTNode {
	ASTNode t1;
	

	public ImportAsNames(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ImportAsNames(");
		t1.print();
		System.out.println(")");

	}

}
