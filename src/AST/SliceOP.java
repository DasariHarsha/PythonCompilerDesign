package AST;

public class SliceOP implements ASTNode {
	ASTNode t1;
	
	
	public SliceOP(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SliceOP(:,");
		t1.print();
		System.out.println(")");
	}

}
