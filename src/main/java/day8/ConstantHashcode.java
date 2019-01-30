package day8;

import java.util.Objects;

public class ConstantHashcode {
    private String value;

    public ConstantHashcode(String value) {
        this.value = value;
    }

    public ConstantHashcode() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstantHashcode that = (ConstantHashcode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return 5;
    }
}
