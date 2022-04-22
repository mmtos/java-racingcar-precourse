package racingcar;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import racingcar.car.RacingCar;
import racingcar.car.RacingCarName;
import racingcar.car.RacingCarPosition;

public class RacingCarTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 자동차_전진(){
        try (final MockedStatic<Randoms> mock = mockStatic(Randoms.class)) {
            mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(MOVING_FORWARD);
            RacingCar racingCar = new RacingCar(new RacingCarName("test"));
            racingCar.tryMove();
            assertThat(racingCar.getRacingCarPosition()).isEqualTo(new RacingCarPosition(1));
        }
    }

}
