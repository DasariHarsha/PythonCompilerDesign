package AST;

public class Typedargsliste implements ASTNode {
	Integer op;
	ASTNode t1,t2;
	
	
	


	public Typedargsliste(Integer op, ASTNode t1, ASTNode t2) {
		super();
		this.op = op;
		this.t1 = t1;
		this.t2 = t2;
	}





	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Typedargsliste(");
		
		switch(op)
		{
		case 1: System.out.println("NAME, ");
				break;
		
		}
		t1.print();
		System.out.println(",");
		t2.print();
		
		
		System.out.println(")");

	}

}
