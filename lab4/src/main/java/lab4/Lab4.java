package lab4;

import lab3.analyzer.AnalyzerImpl;
import lab3.analyzer.AnalyzerResult;
import lab3.analyzer.ReflectionProvider;
import lab3.analyzer.output.AnalyzerFormatterImpl;
import lab4.analyzer.output.AnalyzerExcelOutput;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Lab4 {
    public static void main(String[] args) throws IOException {

        AnalyzerImpl analyzer = new AnalyzerImpl(new ReflectionProvider(
                "lab3.sorters", "lab3.fillers"));

        List<AnalyzerResult> resultList = analyzer.analyzeDifficulty(10000, 20000, 30000, 40000, 50000);

        AnalyzerFormatterImpl analyzerFormatter = new AnalyzerFormatterImpl();
        String report = analyzerFormatter.format(resultList);

        System.out.println(report);

        AnalyzerExcelOutput excelOutput = new AnalyzerExcelOutput();
        excelOutput.writeToExcel(resultList, new File("result.xlsx"));
    }
}