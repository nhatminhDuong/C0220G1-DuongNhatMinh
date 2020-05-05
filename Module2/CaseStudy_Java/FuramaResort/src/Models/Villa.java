package Models;

public class Villa extends Services {
    public String roomStandards;
    public String otherAmenitiesDescription;
    public String poolArea;
    public String floors;

    public Villa(String id, String serviceName, String usedSpace, String fee, String maxPeople, String rentType,
                 String accompaniedServiceName, String unit, String unitPrice,
                 String roomStandards, String otherAmenitiesDescription, String poolArea, String floors) {
        super(id, serviceName, usedSpace, fee, maxPeople, rentType, accompaniedServiceName, unit, unitPrice);
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
                + "\n6.  Tên dịch vụ đi kèm: " + accompaniedService.name
                + "\n7.  Đơn vị của dịch vụ đi kèm: " + accompaniedService.unit
                + "\n8.  Đơn giá dịch vụ đi kèm: " + accompaniedService.unitPrice
                + "\n9.  Kiểu thuê: " + rentType
                + "\n10. Tiêu chuẩn phòng: " + roomStandards
                + "\n11. Tiện nghi khác: " + otherAmenitiesDescription
                + "\n12. Diện tích hồ bơi: " + poolArea
                + "\n13. Số tầng: " + floors);
    }
}
