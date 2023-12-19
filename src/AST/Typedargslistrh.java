package AST;

public class Typedargslistrh implements ASTNode {
	
	Integer op;


	public Typedargslistrh(Integer op) {
		super();
		this.op = op;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Typedargslistrh(");
		System.out.println("** ");
		switch(op)
		{
		case 1: System.out.println("NAME, ");
				break;
		

	}
		
		System.out.println(")");

}
}
