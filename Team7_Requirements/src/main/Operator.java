
//by sonam
public class Operator {
    private String name;
    private int operatorNumber;
    private String operatorEmail;

    public Operator() {
        name = "unassigned";
        operatorNumber = -1;
        operatorEmail = "unassigned";
    }

    public Operator(String n, int on, String oe) {
        name = n;
        operatorNumber = on;
        operatorEmail = oe;
    }
    
    public String returnName() {
        return name;
    }
    public int returnNumber() {
        return operatorNumber;
    }
    public String returnEmail() {
        return operatorEmail;
    }
    public void printInfo() {
        System.out.println("name: ");
        System.out.println(name);
        System.out.println("email: ");
        System.out.println(operatorEmail);
        System.out.println("number: ");
        System.out.println(operatorNumber);
        
    }
    
}
