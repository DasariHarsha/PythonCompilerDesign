package AST;

public class Vfpdef implements ASTNode {
	Integer op;


	public Vfpdef(Integer op) {
		super();
		this.op = op;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Vfpdef(");
		switch(op)
		{
		case 1: System.out.println("NAME");
				break;
		

		}
		System.out.println(")");

}
}

