package lotto.view;

import lotto.domain.*;

import java.util.List;

public class ResultView {
    public static final String BUY_LOTTO_MESSAGE = "개를 구매했습니다.";
    public static final String WiNNING_RESULT_MESSAGE = "당첨 통계";
    public static final String SEPARATE_BAR = "---------";
    public static final String RESULT_MESSAGE = "%d개 일치%s(%d원)- %d개\n";
    public static final String TOTAL_PROFIT_MESSAGE = "총 수익률은 %.2f입니다.";
    public static final String BONUS_MESSAGE = ", 보너스 볼 일치";
    public static final String SPACE = " ";

    public void printOfBuyLotto(LottoGame lottoGame) {
        System.out.println(lottoGame.countOfLotto() + BUY_LOTTO_MESSAGE);
        for (Lotto lotto : lottoGame.getLottos()) {
            System.out.println(lotto.sortNumbers());
        }
    }

    public void printWinningResult(List<Rank> ranks) {
        System.out.println(WiNNING_RESULT_MESSAGE);
        System.out.println(SEPARATE_BAR);
        for (LottoResult result : LottoResult.matchResult(ranks)) {
            System.out.printf(RESULT_MESSAGE,
                    result.getMatchCount(), bonusMessage(result), result.getPrize(), result.countWinningLotto());
        }
    }

    private static String bonusMessage(LottoResult result) {
        if (result.isSecond()) {
            return BONUS_MESSAGE;
        }
        return SPACE;
    }

    public void printProfit(double winningProfit) {
        System.out.printf(TOTAL_PROFIT_MESSAGE, winningProfit);
    }
}
