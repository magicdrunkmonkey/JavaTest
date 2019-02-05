import java.util.Random;

public class DataProducer implements DataSource {

    private static Random random = new Random();

    public int produceSomeData(){
        return  random.nextInt();
    }
}
