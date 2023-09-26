public class Honda extends Carro{
    public Honda (String modelo) {
        super("Honda", "modelo");
    }

    public Honda(String honda, String accord) {
        super("Honda", "Accord");
    }

    public static class Civic extends Carro{
        public Civic(){
            super("Honda","Civic");
        }
    }
}
