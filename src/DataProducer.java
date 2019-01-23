import java.util.Random;

public class DataProducer extends DataSource {

    private static Random random = new Random();

    public int produceSomeData(){
        return  random.nextInt();
    }
}
