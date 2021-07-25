package InterfaceLes11.details;
//Класс Engine содержит поля - мощность, производитель.
//
public class EngineClass  implements Engine{
    private int power;
    private String producer;

    public EngineClass (int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return  +power +"\nProducer is " +producer;
    }
}
