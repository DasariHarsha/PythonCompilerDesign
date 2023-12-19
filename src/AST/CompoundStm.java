package AST;

public class CompoundStm extends ComparsionAbstractClass implements ASTNode {
	ASTNode t1;
	
	public CompoundStm(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		System.out.println("new CompoundStm(");
		t1.print();
		System.out.print(")");

	}

}
