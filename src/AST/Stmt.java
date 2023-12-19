package AST;

public class Stmt implements ASTNode {
	Integer op;
	ASTNode t1;
	

	


	public Stmt(Integer op, ASTNode t1) {
		super();
		this.op = op;
		this.t1 = t1;
	}





	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Stmt(");
		switch(op)
		{
		case 1: System.out.println("NAME, ");
				break;
		case 2: System.out.println(" ");
				break;
		}
		t1.print();
		
		System.out.println(")");

	}

}
