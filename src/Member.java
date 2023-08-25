// by dylan

public class Member {

    private String memberName, memberAddress, memberCity, memberState, memberStatus, memberEmail;
    private int ZIP, memberNum;
    private Service[] serviceArray = new Service[50];

    public int numServices;

    public String getName() {
        return this.memberName;
    }

    public String getAddress() {
        return this.memberAddress;
    }

    public String getCity() {
        return this.memberCity;
    }

    public String getState() {
        return this.memberState;
    }

    public String getStatus() {
        return this.memberStatus;
    }

    public String getEmail() {
        return this.memberEmail;
    }

    public int getZIP() {
        return this.ZIP;
    }

    public int getMemberNum() {
        return this.memberNum;
    }

    public void addServiceToMember(Service newService) {
        serviceArray[numServices] = newService;
        numServices++;
    }

    public void getReportInfo() {
        System.out.println("Send to" + this.getEmail());
        System.out.println(this.getName());
        System.out.println(this.getMemberNum());
        System.out.println(this.getAddress());
        System.out.println(this.getCity());
        System.out.println(this.getState());
        System.out.println(this.getZIP());
        System.out.println("Services:");
        for (int i = 0; i < numServices; i++) {
            System.out.println(serviceArray[i].printService());
        }
    }
    
}