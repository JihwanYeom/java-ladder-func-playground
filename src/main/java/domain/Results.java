package domain;

import java.util.ArrayList;
import java.util.List;

public class Results {
    private final List<Result> results;

    private Results(List<Result> results) {
        this.results = results;
    }

    public static Results of(List<String> results) {
        List<Result> resultList = new ArrayList<>();
        for(String result : results) {
            resultList.add(new Result(result));
        }
        return new Results(resultList);
    }

    public List<Result> getResults() {
        return results;
    }
}
