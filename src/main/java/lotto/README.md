## 로또
####요구사항 정리✔
✔ 원래 요건 ✔
- 로또 구입 금액 입력시 구입금액에 해당하는 로또 발급
- 로또 1장 가격은 1000원
- 구입한 로또 갯수 표시 
- 로또 번호 자동 생성하여 표시
- 지난 주 당첨번호 입력 받기
- 당첨통계 표시
- 당첨통계는 번호 일치 갯수에 따라 분류
- 일치된 갯수의 복권 숫자가 몇개인지 통계
- 총 수익률 표시 => (총 당첨금액 / 구입금액) 소수점 둘째자리까지 표시
==========================

#### 요건에 맞추어 객체별 요구사항 분리

* 로또(Lotto)
>- 자동으로 로또번호 생성
>- 당첨된 로또와 비교(매칭)

* 로또번호(LottoNumber)
>- 로또번호가 범위값 내에 있는 값인지 유효성 검사

* 로또넘버s(LottoNumbers)
>- 로또번호 비교(매칭)
>- 로또번호 갯수 유효성 검사

* 로또번호 생성기(LottoNumberGenerator)
>- 자동으로 로또번호 생성

* 로또s (Lottos)
>- 로또들 비교(매칭) => 로또는 단건 비교 여기서는 다건 비교

* 로또샵(LottoShop)
>- 로또 구입금액만큼 로또 생성

* 돈(Money)
>- 입력된 금액 BigDecimal로 변환하여 추후 계산시 용이하게 해둠
>- 총 상금 합계, 통계 등의 계산처리
>- 돈 음수값 유효성 검사

* 수익률통계(ProfitStatistics)
>- (총 당첨금액 / 구입금액) 계산

* 당첨결과(WinningResult)
>- 당첨결과 갯수 세기
>- 당첨결과 총 상금액 구하기

* 당첨타입(WinningType)
>- 등수별 당첨금액, 숫자 매칭 갯수 상수화
>- 당첨결과 구하기
