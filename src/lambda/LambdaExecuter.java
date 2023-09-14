package lambda;

import java.util.List;

public class LambdaExecuter {

    private LoopOutput loopOutput;
    
    public LambdaExecuter() {
        loopOutput = new LoopOutput();
    }

    public void outputData(List<String> data) {
        loopOutput.output4Loop(data, (String value) -> {
            System.out.println(value);
        });
    }
}
