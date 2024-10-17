import day06.MyImplementation;
import day06.Person;
import day06.Product;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class App {

    //compile (complile in the project root folder)
    //javac -d bin --source-path . ./*java
    //javac -d bin --source-path . ./*java day 06/* */.java

    //run
    //java -cp bin App

    //package to jar
    //run the jar

    
    public static void main(String[] args) {
    
        MyImplementation my1 = new MyImplementation();
        MyImplementation my2 = new MyImplementation();
        MyImplementation my3 = new MyImplementation();
        MyImplementation my4 = new MyImplementation();
        MyImplementation my5 = new MyImplementation();

        //execute the tasks using a single thread
        // ExecutorService es = Executors.newSingleThreadExecutor();
        // es.execute(my1);
        // es.execute(my2);
        // es.shutdown();

        // //execute the tasks using a fixed thread pool
        // ExecutorService es1 = Executors.newFixedThreadPool(5);
        // es1.execute(my1);
        // es1.execute(my2);
        // es1.execute(my3);
        // es1.execute(my4);
        // es1.execute(my5);
        // es1.shutdown(); //release the memory

        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1L, "Apple ipad", "Tablet", "Electronics"));
        products.add(new Product(2L, "Apple MacBookPro", "Laptop", "Electronics"));
        products.add(new Product(3L, "Logitech Mouse", "Mouse", "Electronics"));
        products.add(new Product(4L, "32 inch Monitor", "Monitor", "Electronics"));
        products.add(new Product(5L, "Apple Iphone 16", "Phone", "Mobile"));
        products.add(new Product(6L, "Samsung Flip 5", "Phone", "Mobile"));
        products.add(new Product(7L, "Oppo Reno 11", "Phone", "Mobile"));
        products.add(new Product(8L, "HuaWei 6", "Phone", "Mobile"));

        // products.forEach(prod -> {
        //     System.out.println(prod);
        // });

        products.forEach(Product::toString);

        //only retrieve products with category "mobile"
        //using stream and lambda functions
        List<Product> filteredProducts = products.stream()
            .filter(prod -> prod.getCategory().equals("Mobile"))
            .collect(Collectors.toList());

        filteredProducts.forEach(Product::print);

        List<Person> persons = new ArrayList<Person>();
        LocalDate ld = LocalDate.of(1990, 1, 12);
        Date currentDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
        persons.add(new Person(1L, "Janet", "Tan", 3600.00, currentDate));
        persons.add(new Person(2L, "Jeanette", "Ho", 3650.00, currentDate));
        persons.add(new Person(3L, "Mary", "Tan", 3700.00, currentDate));
        persons.add(new Person(4L, "Ben", "Tan", 3600.00, currentDate));
        persons.add(new Person(5L, "John", "Ho", 7000.00, currentDate));
        persons.add(new Person(6L, "Harry", "Tan", 3600.00, currentDate));
        persons.add(new Person(7L, "Samira", "Ho", 5000.00, currentDate));
        persons.add(new Person(8L, "Darius", "Tan", 6000.00, currentDate));

        //Use the comparator to sort using the first name
        Comparator<Person> compare = Comparator.comparing(p -> p.getFirstName());
        persons.sort(compare.reversed());
        persons.forEach(p -> { //within the curly bracket is the functions
            System.out.println(p.toString());
        });

        //Sorting multiple column
        Comparator<Person> compareMultiple = Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName);
        persons.sort(compareMultiple);
        persons.forEach(p -> {
            System.out.println(p.toString());

        });

    }
}
