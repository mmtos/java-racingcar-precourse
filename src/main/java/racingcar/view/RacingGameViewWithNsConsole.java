package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class RacingGameViewWithNsConsole implements RacingGameView{
    @Override
    public String takeRacingCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    @Override
    public String takeRacingStageCount() {
        System.out.println("시도할 회수");
        return Console.readLine();
    }

    @Override
    public void printErrorMessage(Exception e) {
        System.out.println("[ERROR] " + e.getMessage());
    }
}
