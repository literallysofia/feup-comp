/* Generated By:JJTree: Do not edit this line. ASTArraySize.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTArraySize extends SimpleNode {
  public String name = "";
  public String value = "";

  public ASTArraySize(int id) {
    super(id);
  }

  public ASTArraySize(yal2jvm p, int id) {
    super(p, id);
  }

  public String toString() {
    return yal2jvmTreeConstants.jjtNodeName[id] + " " + this.name + " " + this.value;
  }

}
/* JavaCC - OriginalChecksum=1f81afe50921da3a6c4726d5fd8fe4dc (do not edit this line) */
