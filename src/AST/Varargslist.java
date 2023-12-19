package AST;

public class Varargslist implements ASTNode {
	Integer op;
	ASTNode t1,t2,t3;
	

	


	public Varargslist(Integer op, ASTNode t1, ASTNode t2, ASTNode t3) {
		super();
		this.op = op;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}





	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Varargslist(");
		switch(op)
		{
		case 1: System.out.println("NAME, ");
				break;
		}
		
		t1.print();
		System.out.println(",");
		t2.print();
		System.out.println(",");
		t3.print();
		System.out.println(")");

	}

}
