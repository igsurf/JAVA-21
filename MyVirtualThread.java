public class MyVirtualThread {

    public static void main(String[] args) throws InterruptedException {

        // Create a new virtual thread using Thread.Builder
        Thread thread = Thread
                .ofVirtual()
                .name("my-vt")
                .start(() -> {
                    System.out.println("Hello from virtual thread!");
                });

        // Wait for the virtual thread to finish executing
        thread.join();
        System.out.println("Main thread completed.");

    }

}