package lab1;

import lab1.analyzer.output.*;
import lab1.analyzer.*;
import lab1.fillers.*;
import lab1.sorters.*;

import java.util.Arrays;
import java.util.List;

public class Lab1 {
    public static void main(String[] args) {
        Sorter quickSort = new QuickSort();

        Filler sortedAsc = new AscFiller(quickSort);

        Filler sortedAscWithRandom = new AscFiller(quickSort);
        sortedAscWithRandom.addOption(new LastRandomOption(100, 200));

        Filler sortedDesc = new DescFiller(quickSort);

        Filler trueRandom = new RandomFiller();

        AnalyzerImpl analyzer = new AnalyzerImpl();

        List<AnalyzerResult> resultList = analyzer.analyzeDifficulty(
                Arrays.asList(
                        sortedAsc,
                        sortedAscWithRandom,
                        sortedDesc,
                        trueRandom
                )
                , 1000, 10000, 20000);

        AnalyzerFormatterImpl analyzerFormatter = new AnalyzerFormatterImpl();
        String report = analyzerFormatter.format(resultList);

        System.out.println(report);
    }
}