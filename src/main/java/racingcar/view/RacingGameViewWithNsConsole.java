package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.StringJoiner;
import racingcar.car.RacingCarDTO;
import racingcar.car.RacingCarName;

public class RacingGameViewWithNsConsole implements RacingGameView{
    private static final String DASH = "-";

    @Override
    public String takeRacingCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    @Override
    public String takeRacingStageCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Console.readLine();
    }

    @Override
    public void printStageStart() {
        System.out.println("실행 결과");
    }

    @Override
    public void printStageResult(List<RacingCarDTO> racingCarDTOList) {
        for(RacingCarDTO racingCarDTO: racingCarDTOList){
            System.out.println(racingCarDTO.getName() + " : " + makeLineMessageFromPosition(racingCarDTO.getPosition()));
        }
        System.out.println();
    }

    @Override
    public void printWinner(List<RacingCarName> winners) {
        StringJoiner joiner = new StringJoiner(", ");
        for(RacingCarName winner : winners){
            joiner.add(winner.getName());
        }
        System.out.println("최종 우승자: "+ joiner.toString());
    }

    private String makeLineMessageFromPosition(int position) {
        String lineMessage = "";
        for(int i=0; i<position;i++){
            lineMessage += DASH;
        }
        return lineMessage;
    }


    @Override
    public void printErrorMessage(Exception e) {
        System.out.println("[ERROR] " + e.getMessage());
    }
}
