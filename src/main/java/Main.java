import com.example.mmhcocktailsthymeleaftest.repository.RepositoryCocktails;
import com.example.mmhcocktailsthymeleaftest.service.ServiceCocktails;

public class Main {
    public static void main(String[] args) {
        ServiceCocktails sc = new ServiceCocktails(new RepositoryCocktails());

        System.out.println(sc.getListOfCocktails());
    }
}
