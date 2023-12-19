package AST;

public class SimpleStm implements ASTNode {
	ASTNode t1;
	public SimpleStm(ASTNode t1) {
		super();
		this.t1 = t1;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new SimpleStm(");
		t1.print();
		System.out.println(")");
		
		}

}
