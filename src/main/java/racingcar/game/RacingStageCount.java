package racingcar.game;

public class RacingStageCount {

    private final int stageCount;

    public RacingStageCount(String stageCount) {
        try{
            this.stageCount = Integer.parseInt(stageCount);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("시도횟수는 숫자여야 한다.");
        }
    }

    public int getStageCount() {
        return stageCount;
    }
}
