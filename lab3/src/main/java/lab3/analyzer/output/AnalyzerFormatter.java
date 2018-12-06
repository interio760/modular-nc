package lab3.analyzer.output;

import lab3.analyzer.AnalyzerResult;

import java.util.List;

/**
 * Interface that defines {@link AnalyzerResult} output methods
 *
 * @author Zakh
 */
public interface AnalyzerFormatter {

    String format(List<AnalyzerResult> resultList);

}
