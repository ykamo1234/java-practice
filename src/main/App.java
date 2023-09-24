package main;

import java.util.Arrays;

import io.UserScanner;
import lambda.LambdaExecuter;

public class App {

    private static int funcNumber;

    public static void main(String[] args) throws Exception {

        init();

        if(funcNumber == -1) {
            System.out.println("不正な入力が続いたので終了します。");
            return;
        }
        
        switch (funcNumber) {
            case 1:
            executeLambda();
            break;
            
            case 2:
            executeThread();
            
            default:
            break;
        }
        
        
    }
    
    public static void init() {
        System.out.println("機能呼び出し 1：ラムダ　2：スレッド");
        System.out.println("呼び出したい機能番号を半角数字で入力してください。 >");
        UserScanner scanner = new UserScanner();
        funcNumber = scanner.inputPositiveNumber(5);
    }

    public static void executeLambda() {
        // TODO write lambdaCode
        LambdaExecuter lambda = new LambdaExecuter();
        lambda.outputData(Arrays.asList("aaa", "bbb", "ccc"));
    }

    public static void executeThread() {
        // TODO write threadCode
    }
}
