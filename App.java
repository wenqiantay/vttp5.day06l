import day06.MyImplementation;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    //compile (complile in the project root folder)
    //javac -d bin --source-path . ./*java
    //javac -d bin --source-path . ./*java day 06*/.java

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

        //execute the tasks using a fixed thread pool
        ExecutorService es1 = Executors.newFixedThreadPool(5);
        es1.execute(my1);
        es1.execute(my2);
        es1.execute(my3);
        es1.execute(my4);
        es1.execute(my5);
        es1.shutdown(); //release the memory
    }
}
