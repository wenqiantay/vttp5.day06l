public class App {

    //compile (complile in the project root folder)
    //javac -d bin --source-path . ./*java

    //run
    //java -cp bin App

    //package to jar
    //run the jar

    
    public static void main(String[] args) {
        
        Thread th = new Thread(new Runnable() {
        
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                }
            }
        
        });
         th.start(); //this is for the thread to run
    }
}
