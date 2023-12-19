package AST;

public class ImportFromb implements ASTNode {
	Integer op;
	ASTNode t1;
	

	public ImportFromb(Integer op, ASTNode t1) {
		super();
		this.op = op;
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ImportFromb( ");
		
		
		switch(op)
		{
		case 1: System.out.println("DOT, ");
				break;
		case 2: System.out.println("ELLIPSIS, ");
				break;
		

	}
		System.out.println(", ");
		t1.print();
	}

}
