package racingcar.car;

import java.util.Objects;

public class RacingCarName {
    private final String name;

    public RacingCarName(String name) {
        if(name == null || name.length() > 5){
            throw new IllegalArgumentException("이름은 5자까지만 허용됩니다.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RacingCarName that = (RacingCarName) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
