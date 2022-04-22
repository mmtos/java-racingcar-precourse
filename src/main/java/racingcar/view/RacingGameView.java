package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.car.RacingCarDTO;

public interface RacingGameView {
    String takeRacingCarNames();
    String takeRacingStageCount();
    void printStageStart();
    void printStageResult(List<RacingCarDTO> racingCarDTOList);
    void printErrorMessage(Exception e);
}
