package io;

import java.util.Scanner;

import checker.ManagedChecker;

/**
 * Javadocのためのサンプルクラス
 *
 * @author Yuto K
 * @version 1.0
 */
public class UserScanner {
    private Scanner scanner;

    /**
     * コンストラクタ
     */
    public UserScanner() {
        scanner = new Scanner(System.in);
    }

    /**
     * UserScannerクラスが使用されなくなった時の処理
     * ストリームを確実にcloseする
     */ 
    @Override
    protected void finalize() throws Throwable {
        if(scanner != null) {
            scanner.close();
        }
    }

    /**
     * 標準入力と入力値チェック（数値か　正の整数か）を行い
     * int型に変換し返却
     * @return 正の整数以外の場合-1 正の整数の場合入力値を返却
     */
    public int inputPositiveNumber() {
        String data = scanner.nextLine();
        //数値であるかチェック
        if(!ManagedChecker.isNumeric(data)){
            return -1;
        } 
        //正の整数であるかチェック
        int number = Integer.parseInt(data);
        if(number < 0) {
            return -1;
        }
        return number;
    }

    /**
     * inputPositiveNumber()を無限ループで処理する
     * @param loopFlag ループする場合true　しない場合false
     * @return　int型の正の整数を返却
     */
    public int inputPositiveNumber(boolean loopFlag) {
        int number = inputPositiveNumber();
        while(number == -1 && loopFlag) {
            System.out.println("半角数字で正の整数を入力してください。入力をやめる場合はCtrlとCを同時押ししてください。");
            number = inputPositiveNumber();
        }
        return number;
    }

    /**
     * 引数の最大ループ数までinputInt()を実行する（最大数であり正常に正の整数が入力されればループを抜ける）
     * @param maxLoopCount 最大ループ回数
     * @return　正の整数以外の場合-1 正の整数の場合入力値を返却
     */
    public int inputPositiveNumber(int maxLoopCount) {
        int count = 0;
        int number = inputPositiveNumber();
        while(number == -1 && count < maxLoopCount) {
            System.out.println("半角数字で正の整数を入力してください。残り入力可能回数：" + (maxLoopCount - count) + "回");
            number = inputPositiveNumber();
            count++;
        }
        return number;
    }
}
