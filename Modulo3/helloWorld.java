public class helloWorld {
    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("Dev")){
            System.out.print("Executando DEV");
        }else{ambiente.equalsIgnoreCase("Teste ambiente");}

    }
}