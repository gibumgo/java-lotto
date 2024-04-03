package lotto.domain;


import java.util.List;

public class LottoGame {
    private Lottos userLottos;
    private Money amount;

    public LottoGame(int money) {
        this.userLottos = new Lottos();
        this.amount = Money.from(money);
    }

    public List<Lotto> createLotto(NumberStrategy numberStrategy) {
        return this.userLottos.createLottos(countOfLotto(), numberStrategy);
    }

    public int countOfLotto() {
        return this.amount.countOfBuyLotto();
    }

    public List<Lotto> getLottos() {
        return this.userLottos.getLottos();
    }

    public List<Rank> match(String winningNumbers, int inputBonusNumber) {
        Lotto winningLotto = Lotto.createFromString(winningNumbers);
        LottoNumber bonusNumber = LottoNumber.of(inputBonusNumber);
        return this.userLottos.match(winningLotto, bonusNumber);
    }

    public double calculateProfit(List<Rank> ranks) {
        Money totalPrize = Money.from(0);
        for (Rank rank : ranks) {
            totalPrize = totalPrize.plus(rank.getPrize());
        }
        return this.amount.calculateProfitRatio(totalPrize);
    }
}
