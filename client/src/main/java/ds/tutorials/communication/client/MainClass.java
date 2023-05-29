package ds.tutorials.communication.client;

import ds.tutorial.communication.grpc.generated.CheckBalanceResponse;
import ds.tutorial.inventory.grpc.generated.CheckInventoryResponse;
import ds.tutorials.communication.client.model.BalanceResponse;
import ds.tutorials.communication.client.model.InventoryResponse;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        if (args.length > 4 || args.length < 3) {
            System.out.println("Usage <host> <port> <s(et)|c(heck)");
            System.exit(1);
        }

        String host = args[0];
        int port = Integer.parseInt(args[1].trim());
        String operation = args[2];

        if (args.length == 4) {
            int portBank = Integer.parseInt(args[2].trim());

            CheckInventoryServiceClient inventoryServiceClient = new CheckInventoryServiceClient(host, port);
            inventoryServiceClient.initializeConnection();
            InventoryResponse cir = inventoryServiceClient.processUserRequests();
            CheckBalanceServiceClient client = new CheckBalanceServiceClient(host, portBank);
            client.initializeConnection();
            BalanceResponse cbr = client.processUserRequests();
            if (cir.isAvailable()) {
                if (cir.getCost() <= cbr.getCheckBalanceResponse().getBalance()) {
                    System.out.println( "Payment proceeded for the " + cir.getProductId() + "  of " + cir.getQuantity() + " for " + cir.getCost() + " LKR" );
                    SetBalanceServiceClient setBalanceServiceClient = new SetBalanceServiceClient( host, portBank );
                    setBalanceServiceClient.initializeConnection();
                    setBalanceServiceClient.processUserRequests( cbr.getAccountId(), ( cbr.getCheckBalanceResponse().getBalance() - cir.getCost() ) );
                    setBalanceServiceClient.closeConnection();
                    SetInventoryServiceClient setInventoryServiceClient = new SetInventoryServiceClient( host, port );
                    setInventoryServiceClient.initializeConnection();
                    setInventoryServiceClient.processUserRequests( cir.getProductId(), ( cir.getCheckInventoryResponse().getInventory() - cir.getQuantity() ) );
                    setInventoryServiceClient.closeConnection();
                } else {
                    System.out.println( "Insufficient balance to proceed the payment" );
                }
            } else {
                System.out.println("Insufficient inventory to proceed the payment");
            }
            inventoryServiceClient.closeConnection();
            client.closeConnection();
        } else if ("sp".equals(operation)) {
            SetInventoryServiceClient client = new SetInventoryServiceClient(host, port);
            client.initializeConnection();
            client.processUserRequests();
            client.closeConnection();
        } else if ("s".equals(operation)) {
            SetBalanceServiceClient client = new SetBalanceServiceClient(host, port);
            client.initializeConnection();
            client.processUserRequests();
            client.closeConnection();
        } else {
            CheckBalanceServiceClient client = new CheckBalanceServiceClient(host,
                    port);
            client.initializeConnection();
            client.processUserRequests();
            client.closeConnection();
        }
    }

//    public static void main(String[] args) throws InterruptedException {
//        String host = args[0];
//        int port = Integer.parseInt(args[1].trim());
//        String operation = args[2];
//
//        if (args.length != 3) {
//            System.out.println("Usage CheckBalanceServiceClient <host> <port> <s(et)|c(heck)");
//            System.exit(1);
//        }
//
//        if ("s".equals(operation)) {
//            SetBalanceServiceClient client = new SetBalanceServiceClient(host, port);
//            client.initializeConnection();
//            client.processUserRequests();
//            client.closeConnection();
//        } else {
//            CheckBalanceServiceClient client = new CheckBalanceServiceClient(host,
//                    port);
//            client.initializeConnection();
//            client.processUserRequests();
//            client.closeConnection();
//        }
//    }
}
