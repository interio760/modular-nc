package lab1.analyzer.output;

import lab1.analyzer.AnalyzerResult;

import java.util.List;

public interface AnalyzerFormatter {

    String format(List<AnalyzerResult> resultList);

}
