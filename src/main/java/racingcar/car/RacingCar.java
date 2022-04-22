package racingcar.car;

import racingcar.strategy.RacingCarMoveStrategy;
import racingcar.strategy.RandomRacingCarMoveStrategy;

public class RacingCar {

    private static final RacingCarPosition INIT_POSITION = new RacingCarPosition(0);

    private final RacingCarName racingCarName;
    private RacingCarPosition position;
    private RacingCarMoveStrategy moveStrategy = new RandomRacingCarMoveStrategy();

    public RacingCar(RacingCarName racingCarName) {
        this.racingCarName = racingCarName;
        this.position = INIT_POSITION;
    }

    public void tryMove() {
        position = moveStrategy.tryMove(position);
    }

    public RacingCarName getRacingCarName() {
        return racingCarName;
    }

    public RacingCarPosition getRacingCarPosition() {
        return position;
    }
}
