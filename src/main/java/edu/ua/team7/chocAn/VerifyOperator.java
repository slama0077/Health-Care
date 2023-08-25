// Avery Fernandez

package edu.ua.team7.chocAn;

public class VerifyOperator {

    private StorageServer storageServer;

    public VerifyOperator(StorageServer storageServer) {
        this.storageServer = storageServer;
    }

    public boolean verifyOperator(String operatorId) {
        Operator operator = (Operator) storageServer.getData(operatorId);
        if (operator == null) {
            return false;
        }

        if (operator.getName() == null || operator.getName().isEmpty()) {
            return false;
        }

        if (operator.getId() == null || operator.getId().isEmpty()) {
            return false;
        }

        System.out.println("Operator verified: " + operator.getName());
        return true;
    }
}
