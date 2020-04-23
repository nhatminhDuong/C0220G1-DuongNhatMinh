package Models;

public class House extends Services {
    public String roomStandards;
    public String otherAmenitiesDescription;
    public String floors;

    public House(String id, String serviceName, String usedSpace, String fee, String maxPeople, String rentType,
                 String accompaniedServiceName, String unit, String unitPrice,
                 String roomStandards, String otherAmenitiesDescription, String floors) {
        super(id, serviceName, usedSpace, fee, maxPeople, rentType, accompaniedServiceName, unit, unitPrice);
        this.roomStandards = roomStandards;
        this.otherAmenitiesDescription = otherAmenitiesDescription;
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
                + "\n7.  Tên dịch vụ đi kèm: " + accompaniedService.name
                + "\n8.  Đơn vị của dịch vụ đi kèm: " + accompaniedService.unit
                + "\n9.  Đơn giá dịch vụ đi kèm: " + accompaniedService.unitPrice
                + "\n10. Tiêu chuẩn phòng: " + roomStandards
                + "\n11. Tiện nghi khác: " + otherAmenitiesDescription
                + "\n12. Số tầng: " + floors);
    }
}
