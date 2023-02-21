//добавила лебедя
package zoo;

public class Swan extends Herbivores implements Flyable, Swimable {
    private int flightSpeed = 80;
    private int flightHing = 5;
    private int swimSpeed = 3;

    public Swan(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Кхо- ко - Кхо!";
    }


    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHigh() {
        return this.flightHing;
    }

    @Override
    public int getSpeedSwim() {
        return this.swimSpeed;
    }
}



