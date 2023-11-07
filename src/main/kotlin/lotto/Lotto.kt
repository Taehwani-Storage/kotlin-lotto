package lotto

class Lotto(private val numbers: List<Int>) {
    // 로또 번호가 유효한 숫자들인지 검증
    init {
        require(numbers.size == 6) {
            "로또는 숫자 6개 입니다."
        }
        require(numbers.distinct().size == 6) {
            "로또의 숫자는 서로 중복되지 않습니다."
        }
        require(numbers.all { it in 1..45 }) {
            "로또는 1부터 45 중에서 결정됩니다."
        }
    }
    // TODO: 추가 기능 구현
    // 사용자가 구매한 로또와 당첨 번호가 얼마나 일치하는지 계산
    fun match(winningNums: List<Int>): Int {
        require(winningNums.size == 6) {
            "당첨 번호는 6개의 중복되지 않은 수입니다."
        }
        return numbers.count { it in winningNums }
    }

    // 보너스 숫자 검증
    fun bonusNum(bonusNum: Int): Boolean {
        require(bonusNum in 1..45) {
            "보너스 숫자는 1부터 45 중에 있습니다."
        }
        return bonusNum in numbers
    }
}
