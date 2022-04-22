package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public interface RacingGameView {
    String takeRacingCarNames();
    String takeRacingStageCount();
    void printErrorMessage(Exception e);
}
