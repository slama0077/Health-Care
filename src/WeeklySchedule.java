import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface ServiceRecord {
    public void setServiceDate(LocalDate date);
    public LocalDate getServiceDate();
    public void setServiceName(String name);
    public String getServiceName();
    public void setServiceDescription(String description);
    public String getServiceDescription();
}

public class WeeklySchedule {
    private Date startDate;
    private Date endDate;
    private List<ServiceRecord> serviceRecords;
    
    public WeeklySchedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        serviceRecords = new ArrayList<ServiceRecord>();
    }
    
    public void addServiceRecord(ServiceRecord record) {
        serviceRecords.add(record);
    }
    
    public List<ServiceRecord> getServiceRecords() {
        return serviceRecords;
    }
    
    public void printMemberReport(Member member) {
        System.out.println("Weekly Services Provided for Member " + member.getName() + " (Member No. " + member.getMemberNumber() + ")");
        for (ServiceRecord record : serviceRecords) {
            if (record.getMember().equals(member)) {
                System.out.println("Date of Service: " + record.getServiceDate());
                System.out.println("Provider: " + record.getProvider().getName() + " (Provider No. " + record.getProvider().getProviderNumber() + ")");
                System.out.println("Service: " + record.getServiceName() + " (Service Code " + record.getServiceCode() + ")");
                System.out.println("Fee: " + record.getServiceFee());
                System.out.println("Comments: " + record.getComments());
                System.out.println();
            }
        }
    }
    
    public void printProviderReport(Provider provider) {
        System.out.println("Weekly Services Provided by Provider " + provider.getName() + " (Provider No. " + provider.getProviderNumber() + ")");
        double totalFee = 0;
        for (ServiceRecord record : serviceRecords) {
            if (record.getProvider().equals(provider)) {
                System.out.println("Date of Service: " + record.getServiceDate());
                System.out.println("Member: " + record.getMember().getName() + " (Member No. " + record.getMember().getMemberNumber() + ")");
                System.out.println("Service: " + record.getServiceName() + " (Service Code " + record.getServiceCode() + ")");
                System.out.println("Fee: " + record.getServiceFee());
                System.out.println("Comments: " + record.getComments());
                System.out.println();
                totalFee += record.getServiceFee();
            }
        }
        System.out.println("Number of consultations: " + serviceRecords.size());
        System.out.println("Total fee for the week: " + totalFee);
    }
}
