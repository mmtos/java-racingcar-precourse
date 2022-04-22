package racingcar.game;

public class RacingStageCount {

    private final int stageCount;

    public RacingStageCount(String stageCount) {
        try {
            this.stageCount = Integer.parseInt(stageCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도횟수는 1 이상의 숫자여야 합니다.");
        }
        if (this.stageCount == 0) {
            throw new IllegalArgumentException("시도횟수는 1 이상의 숫자여야 합니다.");
        }
    }

    public int getStageCount() {
        return stageCount;
    }
}
