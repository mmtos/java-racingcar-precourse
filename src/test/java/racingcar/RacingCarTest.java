package racingcar;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import racingcar.car.RacingCar;
import racingcar.car.RacingCarName;
import racingcar.car.RacingCarPosition;
import racingcar.car.RacingCars;

public class RacingCarTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 자동차_전진(){
        try (final MockedStatic<Randoms> mock = mockStatic(Randoms.class)) {
            mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(MOVING_FORWARD);
            RacingCar racingCar = new RacingCar(new RacingCarName("test"));
            RacingCarPosition prevRacingCarPosition = racingCar.getRacingCarPosition();
            racingCar.tryMove();
            assertThat(racingCar.getRacingCarPosition()).isEqualTo(new RacingCarPosition(prevRacingCarPosition.getPosition()+1));
        }
    }

    @Test
    void N대_자동차_전진(){
        try (final MockedStatic<Randoms> mock = mockStatic(Randoms.class)) {
            mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(MOVING_FORWARD);
            RacingCars racingCars = new RacingCars();
            racingCars.addRacingCar(new RacingCar(new RacingCarName("test1")));
            racingCars.addRacingCar(new RacingCar(new RacingCarName("test2")));
            racingCars.tryMove();
            List<RacingCar> racingCarList = racingCars.getRacingCarList();
            for(RacingCar racingCar : racingCarList){
                assertThat(racingCar.getRacingCarPosition()).isEqualTo(new RacingCarPosition(1));
            }
        }
    }

    @Test
    void 이름_중복_오류_테스트(){
        assertThatIllegalArgumentException().isThrownBy(() -> {
            RacingCars racingCars = new RacingCars();
            racingCars.addRacingCar(new RacingCar(new RacingCarName("test1")));
            racingCars.addRacingCar(new RacingCar(new RacingCarName("test1")));
        });
    }




}
