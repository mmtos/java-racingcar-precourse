package racingcar.car;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RacingCars {
    //RacingCar 등록 순서 보존
    private Map<RacingCarName, RacingCar> racingCars = new LinkedHashMap<>();

    public void addRacingCar(RacingCar racingCar) {
        RacingCar car = racingCars.putIfAbsent(racingCar.getName(),racingCar);
        if(car != null){
            throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
        }
    }

    public void tryMove() {
        for(RacingCar racingCar : racingCars.values()){
           racingCar.tryMove();
        }
    }

    public List<RacingCar> getRacingCarList() {
        List<RacingCar> racingCarList = new ArrayList<>();
        for(RacingCar racingCar : racingCars.values()){
            racingCarList.add(racingCar);
        }
        return racingCarList;
    }
}
