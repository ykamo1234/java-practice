package checker;

/**
 * Javadocのためのサンプルクラス
 *
 * @author Yuto K
 * @version 1.0
 */
public class ManagedChecker {
    /**
     * 引数の文字列が整数かチェックする。
     * 左の桁が0である場合はfalse（例：001）
     * @param data 文字列
     * @return boolean 整数である場合true　整数でない場合false
     */
    public static boolean isNumeric(String data) {
        return data != null && data.matches("^0|[1-9][0-9]*");
    }
}
