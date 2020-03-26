@@ -21,16 +21,15 @@ public static void main(String[] args) {
            // get the input from the user
            action = Console.getString("Enter a command: ");
            System.out.println();

            if (action.equalsIgnoreCase("list")) {
 if (action.equalsIgnoreCase("1")) {
                displayAllCustomers();
            } else if (action.equalsIgnoreCase("add")) {
            } else if (action.equalsIgnoreCase("2")) {
                addCustomer();
            } else if (action.equalsIgnoreCase("del") || action.equalsIgnoreCase("delete")) {
            } else if (action.equalsIgnoreCase("3")) {
                deleteCustomer();
            } else if (action.equalsIgnoreCase("help") || action.equalsIgnoreCase("menu")) {
            } else if (action.equalsIgnoreCase("4")) {
                displayMenu();
            } else if (action.equalsIgnoreCase("exit")) {
            } else if (action.equalsIgnoreCase("5")) {
                System.out.println("Bye.\n");
            } else {
                System.out.println("Error! Not a valid command.\n");
@@ -40,11 +39,11 @@ public static void main(String[] args) {

    public static void displayMenu() {
        System.out.println("COMMAND MENU");
        System.out.println("list    - List all customers");
        System.out.println("add     - Add a customer");
        System.out.println("del     - Delete a customer");
        System.out.println("help    - Show this menu");
        System.out.println("exit    - Exit this application\n");
        System.out.println("1    - List all customers");
        System.out.println("2    - Add a customer");
        System.out.println("3    - Delete a customer");
        System.out.println("4    - Show this menu");
        System.out.println("5    - Exit this application\n");
    }

    public static void displayAllCustomers() {
@@ -93,4 +92,4 @@ public static void deleteCustomer() {
            System.out.println("No customer matches that email.\n");
        }
    }
} 
}
