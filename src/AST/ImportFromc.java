package AST;

public class ImportFromc implements ASTNode {
	Integer op;
	

	public ImportFromc(Integer op) {
		super();
		this.op = op;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
       System.out.println("new ImportFromc( ");
		
		
		switch(op)
		{
		case 1: System.out.println("DOT, ");
				break;
		case 2: System.out.println("ELLIPSIS, ");
				break;
		

	}

	}

}
