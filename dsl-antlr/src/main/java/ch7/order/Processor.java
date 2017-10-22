// Listing 7.5 Processor.java – The driver code for our parser module

package ch7.order;

import java.io.*;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class Processor {

    public static void main(String[] args) throws IOException, RecognitionException {
        List<Order> os = new Processor().processFile("/Users/sunyan/github/dsl/dsl-antlr/data/sample.txt");
        for (Order o : os) {
            System.out.println(o);
        }
    }

    /**
     * 从文件中读取DSL脚本
     */
    private List<Order> processFile(String filePath) throws IOException, RecognitionException {
        // 语法分析器读入词法单元流
        OrderParser p = new OrderParser(getTokenStream(new FileReader(filePath)));
        p.orders();
        return p.getOrders();
    }

    private CommonTokenStream getTokenStream(Reader reader) throws IOException {
        //OrderLexer lexer = new OrderLexer(new ANTLRReaderStream(reader));
        OrderLexer lexer = new OrderLexer(new ANTLRInputStream(reader));
        // 词法分析器生成的词法单元流
        return new CommonTokenStream(lexer);
    }
}