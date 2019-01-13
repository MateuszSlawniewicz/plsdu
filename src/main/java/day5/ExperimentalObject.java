package day5;

public class ExperimentalObject {

    private Integer notFinalImmutable;              // można podmienić wartość na nowy obiekt(wcześniej utworzyć i referencja)
    private final Integer finalImmutable;                     // tylko odczytać, nic się nie zmieni, nie ma settera!!!!!
    private final TestPerson finalMutable;                   //referencja do obiektu pozostaje, nie możemy stworzyć nowego obiektu i go przypisać, ale można zmienić wartości w obiekcie


    public ExperimentalObject(Integer notFinalImmutable, Integer finalImmutable, TestPerson finalMutable) {
        this.notFinalImmutable = notFinalImmutable;
        this.finalImmutable = finalImmutable;
        this.finalMutable = finalMutable;
    }

    public TestPerson getFinalMutable() {
        return finalMutable;
    }

    public Integer getNotFinalImmutable() {
        return notFinalImmutable;
    }

    public void setNotFinalImmutable(Integer notFinalImmutable) {
        this.notFinalImmutable = notFinalImmutable;
    }

    public Integer getFinalImmutable() {
        return finalImmutable;
    }
}
