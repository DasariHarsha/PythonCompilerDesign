package AST;

public class StarExpa implements ASTNode {
	Integer op;
	ASTNode t1;
	
	

	public StarExpa(Integer op, ASTNode t1) {
		super();
		this.op = op;
		this.t1 = t1;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new StarExpa( ");
		
		switch(op)
		{
		case 1: System.out.println("*, ");
				break;
		case 2: System.out.println(" ");
				break;
		}
		t1.print();
		System.out.println(")");
		

	}

}
