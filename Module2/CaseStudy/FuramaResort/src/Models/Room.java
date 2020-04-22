package Models;

public class Room extends Services {
    String includedFreeServices;

    public Room(String id, String serviceName, String usedSpace, String fee, String maxPeople, String rentType,
                String includedFreeServices) {
        super(id, serviceName, usedSpace, fee, maxPeople, rentType);
        this.includedFreeServices = includedFreeServices;
    }

    @Override
    public void showInfo() {
        System.out.println("1.  ID: " + id
                + "\n2.  Tên dịch vụ: " + serviceName
                + "\n3.  Diện tích sử dụng: " + usedSpace
                + "\n4.  Chi phí thuê: " + fee
                + "\n5.  Số lượng người tối đa: " + maxPeople
                + "\n6.  Kiểu thuê: " + rentType
                + "\n7.  Dịch vụ miễn phí đi kèm: " + includedFreeServices);
    }
}
