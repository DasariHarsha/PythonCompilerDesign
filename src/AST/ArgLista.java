package AST;

public class ArgLista extends ArgumentsClasses implements ASTNode {
	ASTNode t1;
	

	public ArgLista(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ArgLista( (");
		t1.print();
		System.out.println(") )");

	}

}
