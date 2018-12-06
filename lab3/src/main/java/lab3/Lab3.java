package lab3;

import lab3.analyzer.output.*;
import lab3.analyzer.*;

import java.util.List;

public class Lab3 {
    public static void main(String[] args) {

        AnalyzerImpl analyzer = new AnalyzerImpl(new ReflectionProvider(
                "lab3.sorters", "lab3.fillers"));

        List<AnalyzerResult> resultList = analyzer.analyzeDifficulty(1000, 10000, 20000);

        AnalyzerFormatterImpl analyzerFormatter = new AnalyzerFormatterImpl();
        String report = analyzerFormatter.format(resultList);

        System.out.println(report);

    }
}