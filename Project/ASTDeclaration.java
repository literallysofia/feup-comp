/* Generated By:JJTree: Do not edit this line. ASTDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTDeclaration extends SimpleNode {
  public String operator = "";
  public String integer = "";

  public ASTDeclaration(int id) {
    super(id);
  }

  public ASTDeclaration(yal2jvm p, int id) {
    super(p, id);
  }

  public String toString() {
    return yal2jvmTreeConstants.jjtNodeName[id] + " " + this.operator + " " + this.integer;
  }

}
/* JavaCC - OriginalChecksum=4b4e22395d9d11972af4aab2ca4601f4 (do not edit this line) */
