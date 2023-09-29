import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Tabela {
    String nome();
}

@Tabela(nome="Leitura da tabela")
class TabelaExemplo {
    public static void main(String[] args) {
        Class<?> tabelaExemploClass = TabelaExemplo.class;

        try {
            Tabela tabela = tabelaExemploClass.getAnnotation(Tabela.class);
            if (tabela != null) {
                System.out.println("Nome da tabela: " + tabela.nome());
            } else {
                System.out.println("A anotação @Tabela não está presente na classe TabelaExemplo.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}