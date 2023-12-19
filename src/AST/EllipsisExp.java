package AST;

public class EllipsisExp extends ElifExpressionAbstract implements ASTNode {
	String Text;
	
	public EllipsisExp(String text) {
		super();
		Text = text;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new EllipsisExp( "+Text+")");
		

	}

}
