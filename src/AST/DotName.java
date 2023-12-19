package AST;

public class DotName extends DecoratorAbstractClass implements ASTNode {
	String t1,t2;
	

	public DotName(String t1, String t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new NumExp( "+t1+t2+")");

	}

}
