public class TestDataProducer implements DataSource {

    //Can be called fake, dummy, stub, mock object
    //Depending on diffrence
    //https://site.mockito.org/

    @Override
    public int produceSomeData() {
        return 11;
    }
}