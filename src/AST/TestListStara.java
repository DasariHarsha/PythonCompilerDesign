package AST;

public class TestListStara implements ASTNode {
	ASTNode t1,t2;
	
	

	public TestListStara(ASTNode t1, ASTNode t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}



	@Override
	public void print() {
		System.out.println("TestListStara( ,");
		t1.print();
		System.out.println(",");
		t2.print();
		System.out.println(")");

	}

}
