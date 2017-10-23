<http://www.antlr.org/download.html>
<http://www.antlr.org/download/antlr-4.7-complete.jar>

tree layout: <http://code.google.com/p/treelayout>
StringTemplate: <http://www.stringtemplate.org>

```
$ export CLASSPATH=".:/usr/local/lib/antlr-4.0-complete.jar:$CLASSPATH"
$ java -jar /usr/local/lib/antlr-4.0-complete.jar
$ java org.antlr.v4.Tool
$ alias antlr4='java -jar /usr/local/lib/antlr-4.0-complete.jar'
```

```
#!/bin/sh
java -cp "/usr/local/lib/antlr4-complete.jar:$CLASSPATH" org.antlr.v4.Tool $*
```

install/antlr4.bat
```
java -cp C:\libraries\antlr-4.0-complete.jar;%CLASSPATH% org.antlr.v4.Tool %*
```

install/Hello.g4
```
grammar Hello;
r  : 'hello' ID ;
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip ;
```

```
$ alias grun='java org.antlr.v4.runtime.misc.TestRig'
```

```
$ grun Hello r -tokens
hello parrt
EOF
```

```
hello parrt
^Z
[@0,0:4='hello',<'hello'>,1:0]
[@1,6:10='parrt',<ID>,1:6]
[@2,13:12='<EOF>',<EOF>,2:0]
```

```
$ grun Hello r -tree
hello parrt
EOF
```

```
grun Hello r -gui
```

```
-tokens     prints out the token stream
-tree       prints out the parse tree in LISP form
-gui        displays the parse tree visually in a dialog box
-ps file.ps generates a visual representation of the parse tree in PostScript and stores it in file.ps.
-encoding encodingname
-trace      prints the rule name and current token upon rule entry and exit.
-diagnostics 
-SLL
```

starter/ArrayInit.g4
```
grammar ArrayInit;

init : '{' value (',' value)* '}' ;

value : init
      | INT
      ;

INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
```

```
$ grun ArrayInit init -tokens
{99, 3, 451}
EOF
```

```
$ grun ArrayInit init -tree
{99, 3, 451}
EOF
```

```
$ grun ArrayInit init -gui
{1,{2,3},4}
EOF
```

```java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        // create a lexer that feeds off of input CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
```

```
$ javac ArrayInit*.java Test.java
$ java Test
{1,{2,3},4}
EOF
```

ShortToUnicodeString.java
```java
/** Convert short array inits like {1,2,3} to "\u0001\u0002\u0003" */
public class ShortToUnicodeString extends ArrayInitBaseListener {
    /** Translate { to " */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /** Translate } to " */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /** Translate integers to 4-digit hexadecimal strings prefixed with \\u */
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        // Assumes no nested array initializers
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
```
