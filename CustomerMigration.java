//Q4. This test is to know your problem solving ability and how well you have understood data structure and algorithms.

import java.util.*;

class CustomerProfile {
    int customerId;
    String newCustomerId;
    String name;
    String address;
    long rfidNumber;
    Date joinedDate;

    public CustomerProfile(int customerId, String name, String address, long rfidNumber, Date joinedDate) {
        this.customerId = customerId;
        this.newCustomerId = null;
        this.name = name;
        this.address = address;
        this.rfidNumber = rfidNumber;
        this.joinedDate = joinedDate;
    }

    public void generateUUID() {
        this.newCustomerId = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "CustomerProfile{" +
                "customerId=" + customerId +
                ", newCustomerId='" + newCustomerId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rfidNumber=" + rfidNumber +
                ", joinedDate=" + joinedDate +
                '}';
    }
}

public class CustomerMigration {
    public static List<CustomerProfile> migrateToUUID(List<CustomerProfile> profiles) {
        List<CustomerProfile> newProfiles = new ArrayList<>();
        for (CustomerProfile profile : profiles) {
            CustomerProfile newProfile = new CustomerProfile(profile.customerId, profile.name, profile.address,
                    profile.rfidNumber, profile.joinedDate);
            newProfile.generateUUID();
            newProfiles.add(newProfile);
        }
        return newProfiles;
    }

    public static void main(String[] args) {
        List<CustomerProfile> profiles = Arrays.asList(
                new CustomerProfile(1002, "Omkar", "Biratnagar", 2003L, new Date()),
                new CustomerProfile(1003, "Ram", "Kathmandu", 2004L, new Date()));
        List<CustomerProfile> newProfiles = migrateToUUID(profiles);
        newProfiles.forEach(System.out::println);
    }
}
