package lab1.analyzer;

import lab1.fillers.Filler;
import lab1.sorters.Sorter;

import java.util.List;

public interface Analyzer {

    List<AnalyzerResult> analyzeDifficulty(List<Sorter> sorters, List<Filler> fillers,  int ... sizes);

    List<AnalyzerResult> analyzeDifficulty(List<Filler> fillers,  int ... sizes);

}
