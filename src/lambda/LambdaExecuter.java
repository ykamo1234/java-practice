package lambda;

import java.util.List;

/**
 * Javadocのためのサンプルクラス
 *
 * @author Yuto K
 * @version 1.0
 */
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
