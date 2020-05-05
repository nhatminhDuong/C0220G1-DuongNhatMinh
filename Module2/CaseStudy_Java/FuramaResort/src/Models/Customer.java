package Models;

public class Customer {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services providedService;

    public Customer() {
    }

    public Customer(String fullName, String dateOfBirth, String gender, String idNumber, String phoneNumber,
                    String email, String typeOfCustomer, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String fullName, String dateOfBirth, String gender, String idNumber, String phoneNumber,
                    String email, String typeOfCustomer, String address, Services providedService) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.providedService = providedService;
    }

    public void showInfo() {
        String info = "1.  Họ tên: " + fullName
                + "\n2.  Ngày sinh: " + dateOfBirth
                + "\n3.  Giới tính: " + gender
                + "\n4.  Số CMND: " + idNumber
                + "\n5.  Số điện thoại: " + phoneNumber
                + "\n6.  Email: " + email
                + "\n7.  Loại khách hàng: " + typeOfCustomer
                + "\n8.  Địa chỉ: " + address;
        info += (providedService != null) ? ("\n9.  Dịch vụ sử dụng: " + providedService) : ("\n9.  Dịch vụ sử dụng: Chưa cập nhật");
        System.out.println(info);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getProvidedService() {
        return providedService;
    }

    public void setProvidedService(Services providedService) {
        this.providedService = providedService;
    }
}
