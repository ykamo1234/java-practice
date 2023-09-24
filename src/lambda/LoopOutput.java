package lambda;

import java.util.List;
import java.util.function.Consumer;

/**
 * Javadocのためのサンプルクラス
 *
 * @author Yuto K
 * @version 1.0
 */
public class LoopOutput {
    protected void output4Loop(List<String> data, Consumer<String> output) {
        for (String value : data) {
            output.accept(value);
        }
    }
}
