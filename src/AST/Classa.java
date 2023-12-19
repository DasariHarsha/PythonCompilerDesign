package AST;

public class Classa extends DefinitionAbstractClases implements ASTNode {
	ASTNode t1;
	
	public Classa(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		System.out.println("new Classa(");
		t1.print();
		System.out.println(")");

	}

}
