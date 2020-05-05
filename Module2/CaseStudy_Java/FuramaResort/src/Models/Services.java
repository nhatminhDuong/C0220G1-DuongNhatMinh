package Models;

public abstract class Services {
    public String id;
    public String serviceName;
    public String usedSpace;
    public String fee;
    public String maxPeople;
    public String rentType;
    public AccompaniedService accompaniedService;

    public Services(String id, String serviceName, String usedSpace, String fee, String maxPeople, String rentType,
                    String accompaniedServiceName, String unit, String unitPrice) {
        this.id = id;
        this.serviceName = serviceName;
        this.usedSpace = usedSpace;
        this.fee = fee;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.accompaniedService = new AccompaniedService(accompaniedServiceName, unit, unitPrice);
    }

     public class AccompaniedService {
        public String name;
        public String unit;
        public String unitPrice;

        public AccompaniedService(String name, String unit, String unitPrice) {
            this.name = name;
            this.unit = unit;
            this.unitPrice = unitPrice;
        }
    }

    abstract void showInfo();
}
