/* Generated By:JJTree: Do not edit this line. ASTTerm.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTTerm extends SimpleNode {
  public String operator = "";
  public String integer = "";

  public ASTTerm(int id) {
    super(id);
  }

  public ASTTerm(yal2jvm p, int id) {
    super(p, id);
  }

  public String toString() {
    return yal2jvmTreeConstants.jjtNodeName[id] + " " + this.operator + " " + this.integer;
  }

}
/* JavaCC - OriginalChecksum=3129482f6a8e342c5938a44683759faf (do not edit this line) */
