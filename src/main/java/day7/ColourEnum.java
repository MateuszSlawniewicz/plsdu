package day7;

public enum ColourEnum {
    BLACK(8,"czarny"), WHITE(2,"biały");

    private Integer colournumber;
    private String plName;

    ColourEnum(int colournumber, String plName) {   // domyślnie private
        this.colournumber = colournumber;
        this.plName = plName;
    }

    @Override
    public String toString() {
        return plName;
    }

    public Integer getColournumber() {
        return colournumber;
    }


    public String getPlName() {
        return plName;
    }


}
