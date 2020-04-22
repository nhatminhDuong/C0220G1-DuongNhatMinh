package Models;

public class Villa extends Services {
    String roomStandards;
    String otherAmenitiesDescription;
    String poolArea;
    String floors;

    public Villa(String id, String serviceName, String usedSpace, String fee, String maxPeople, String rentType,
                 String roomStandards, String otherAmenitiesDescription, String poolArea, String floors) {
        super(id, serviceName, usedSpace, fee, maxPeople, rentType);
        this.roomStandards = roomStandards;
        this.otherAmenitiesDescription = otherAmenitiesDescription;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    @Override
    public void showInfo() {
        System.out.println("1.  ID: " + id
                + "\n2.  Tên dịch vụ: " + serviceName
                + "\n3.  Diện tích sử dụng: " + usedSpace
                + "\n4.  Chi phí thuê: " + fee
                + "\n5.  Số lượng người tối đa: " + maxPeople
                + "\n6.  Kiểu thuê: " + rentType
                + "\n7.  Tiêu chuẩn phòng: " + roomStandards
                + "\n8.  Tiện nghi khác: " + otherAmenitiesDescription
                + "\n9.  Diện tích hồ bơi: " + poolArea
                + "\n10. Số tầng: " + floors);
    }
}
