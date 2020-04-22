package Models;

public abstract class Services {
    String id;
    String serviceName;
    String usedSpace;
    String fee;
    String maxPeople;
    String rentType;

    public Services(String id, String serviceName, String usedSpace, String fee, String maxPeople, String rentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.usedSpace = usedSpace;
        this.fee = fee;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    abstract void showInfo();
}
