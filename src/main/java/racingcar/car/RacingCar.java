package racingcar.car;

import racingcar.strategy.RacingCarMoveStrategy;
import racingcar.strategy.RandomRacingCarMoveStrategy;

public class RacingCar {

    private static final RacingCarPosition INIT_POSITION = new RacingCarPosition(0);

    private final RacingCarName name;
    private RacingCarPosition position;
    private RacingCarMoveStrategy moveStrategy = new RandomRacingCarMoveStrategy();

    public RacingCar(RacingCarName name) {
        this.name = name;
        this.position = INIT_POSITION;
    }

    public void tryMove() {
        position = moveStrategy.tryMove(position);
    }

    public RacingCarName getName() {
        return name;
    }

    public RacingCarPosition getRacingCarPosition() {
        return position;
    }
}
