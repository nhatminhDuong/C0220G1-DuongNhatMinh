package Controllers;

import Libs.*;
import Models.*;

import java.io.*;
import java.util.*;

public class MainController {
    private static Queue<Customer> customerQueueBookingTickets = new LinkedList<Customer>();

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number:\n"
                + "1. Add new Services\n"
                + "2. Show Services\n"
                + "3. Add a new Customer\n"
                + "4. Show Information of all Customers\n"
                + "5. Add a new Booking\n"
                + "6. Show Information of Employees\n"
                + "7. Book 4D Movie Tickets\n"
                + "8. Find an Employee\n"
                + "9. Exit");

        int chosenNumber = scanner.nextInt();
        switch (chosenNumber) {
            case 1: {
                addNewService();
                break;
            }
            case 2: {
                showServices();
                break;
            }
            case 3: {
                addNewCustomer();
                break;
            }
            case 4: {
                showInformationOfCustomers();
                break;
            }
            case 5: {
                addNewBooking();
                break;
            }
            case 6: {
                showInformationOfEmployees();
                break;
            }
            case 7: {
                book4DMovieTickets();
                break;
            }
            case 8: {
                findEmployee();
                break;
            }
            case 9: {
                break;
            }
            default: {
                System.out.println("Invalid number. Try again!");
                displayMainMenu();
            }
        }
    }

    private static void addNewService() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number:\n" +
                "1. Add a new Villa service\n" +
                "2. Add a new House service\n" +
                "3. Add a new Room service\n" +
                "4. Back to Main menu\n" +
                "5. Exit");

        int chosenNumber = scanner.nextInt();
        switch (chosenNumber) {
            case 1: {
                try {
                    ServiceCsvWriter.inputServiceData("Villa");
                    ServiceCsvWriter.saveServiceDataToFile();
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                try {
                    ServiceCsvWriter.inputServiceData("House");
                    ServiceCsvWriter.saveServiceDataToFile();
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                try {
                    ServiceCsvWriter.inputServiceData("Room");
                    ServiceCsvWriter.saveServiceDataToFile();
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                displayMainMenu();
                break;
            }
            case 5: {
                break;
            }
        }
    }

    private static void showServices() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number:\n" +
                "1. Show all Villas\n" +
                "2. Show all Houses\n" +
                "3. Show all Rooms\n" +
                "4. Show all Villa names not duplicate\n" +
                "5. Show all House names not duplicate\n" +
                "6. Show all Room names not duplicate\n" +
                "7. Back to Main menu\n" +
                "8. Exit");

        int chosenNumber = scanner.nextInt();
        switch (chosenNumber) {
            case 1: {
                try {
                    ServiceCsvReader.readAllRecords("Villa");
                    ServiceCsvReader.showAllVillas();
                    displayMainMenu();
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                try {
                    ServiceCsvReader.readAllRecords("House");
                    ServiceCsvReader.showAllHouses();
                    displayMainMenu();
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                try {
                    ServiceCsvReader.readAllRecords("Room");
                    ServiceCsvReader.showAllRooms();
                    displayMainMenu();
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                showAllVillaNotDuplicate();
                displayMainMenu();
                break;
            }
            case 5: {
                showAllHouseNotDuplicate();
                displayMainMenu();
                break;
            }
            case 6: {
                showAllRoomNotDuplicate();
                displayMainMenu();
                break;
            }
            case 7: {
                displayMainMenu();
                break;
            }
            case 8: {
                break;
            }
        }
    }

    private static void addNewCustomer() {
        CustomerCsvWriter.inputCustomerData();
        CustomerCsvWriter.saveCustomerDataToFile();
    }

    private static void showInformationOfCustomers() {
        CustomerCsvReader.readAllRecords();
        CustomerCsvReader.showAllCustomers();
        displayMainMenu();
    }

    private static void addNewBooking() {
        CustomerCsvReader.readAllRecords();
        CustomerCsvReader.bookService();
    }

    private static void showInformationOfEmployees() {
        EmployeeCsvReader.readAllRecords();
        EmployeeCsvReader.showAllEmployees();
        displayMainMenu();
    }

    private static void book4DMovieTickets() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number:\n"
                + "1. Book movie tickets\n"
                + "2. Show customer booking movie tickets\n"
                + "3. Exit");

        String chosenNumber = scanner.nextLine();
        switch (chosenNumber) {
            case "1": {
                addBooking4DMovieTickets();
                break;
            }
            case "2": {
                showBookingMovieTickets();
                break;
            }
            case "3": {
                break;
            }
            default: {
                System.out.println("Error! Back to Main menu");
                displayMainMenu();
            }
        }
    }

    private static void showBookingMovieTickets() {
        int i = 1;
        for (Customer customer : customerQueueBookingTickets) {
            System.out.println("No." + i);
            customer.showInfo();
            i++;
        }
        displayMainMenu();
    }

    private static void addBooking4DMovieTickets() {
        Scanner scanner = new Scanner(System.in);
        CustomerCsvReader.readAllRecords();
        CustomerCsvReader.showAllCustomers();
        System.out.println("Select a customer:");
        String chosenNumber = scanner.nextLine();
        int index = Integer.parseInt(chosenNumber) - 1;
        if (index < 0 || index >= CustomerCsvReader.customers.size()) {
            System.out.println("Out of list. Try again!");
            addBooking4DMovieTickets();
        } else {
            customerQueueBookingTickets.add(CustomerCsvReader.customers.get(index));
        }
        displayMainMenu();
    }

    private static void findEmployee() {
        Scanner scanner = new Scanner(System.in);
        Stack<Employee> stackEmployees = Resume.getAllEmployees();
        System.out.print("Enter key of employee to find: ");
        String key = scanner.nextLine();
        try {
            while (true) {
                boolean found = stackEmployees.peek().getId().equals(key);
                if (!found) {
                    stackEmployees.pop();
                } else {
                    System.out.println("Employee found with key " + key + ":");
                    System.out.println(stackEmployees.peek().toString());
                    break;
                }
            }
        } catch (EmptyStackException e) {
            System.out.println("Invalid key. Try again!");
            findEmployee();
        }
        displayMainMenu();
    }

    private static void showAllVillaNotDuplicate() {
        TreeSet<String> differentVillaNames = new TreeSet<String>();
        try {
            ServiceCsvReader.readAllRecords("Villa");
        } catch (PassingParameterException e) {
            e.printStackTrace();
        }

        for (Villa villa : ServiceCsvReader.villas) {
            differentVillaNames.add(villa.serviceName);
        }

        for (String villaName : differentVillaNames) {
            System.out.println(villaName);
        }
    }

    private static void showAllHouseNotDuplicate() {
        TreeSet<String> differentHouseNames = new TreeSet<String>();
        try {
            ServiceCsvReader.readAllRecords("House");
        } catch (PassingParameterException e) {
            e.printStackTrace();
        }

        for (House house : ServiceCsvReader.houses) {
            differentHouseNames.add(house.serviceName);
        }

        for (String houseName : differentHouseNames) {
            System.out.println(houseName);
        }
    }

    private static void showAllRoomNotDuplicate() {
        TreeSet<String> differentRoomNames = new TreeSet<String>();
        try {
            ServiceCsvReader.readAllRecords("Room");
        } catch (PassingParameterException e) {
            e.printStackTrace();
        }

        for (Room room : ServiceCsvReader.rooms) {
            differentRoomNames.add(room.serviceName);
        }

        for (String roomName : differentRoomNames) {
            System.out.println(roomName);
        }
    }

    private static class ServiceCsvWriter {
        private static String serviceType;
        private static String id;
        private static String serviceName;
        private static String usedSpace;
        private static String fee;
        private static String maxPeople;
        private static String rentType;
        private static String accompaniedServiceName;
        private static String unit;
        private static String unitPrice;
        private static String roomStandards;
        private static String otherAmenitiesDescription;
        private static String poolArea;
        private static String floors;
        private static String includedFreeServices;
        private static Scanner scanner = new Scanner(System.in);

        public static void inputServiceData(String service) throws PassingParameterException {
            if (!(service.equals("Villa") || service.equals("House") || service.equals("Room"))) {
                throw new PassingParameterException("Parameter \"service\" must be \"Villa\" or \"House\" or \"Room\".");
            } else {
                inputCommonServiceData(service);
                switch (service) {
                    case "Villa": {
                        boolean isValid = false;

                        do {
                            System.out.print("ID: ");
                            id = scanner.nextLine();
                            String idRegExp = "^SVVL-\\d{4}$";
                            boolean isMatched = id.matches(idRegExp);
                            if (!isMatched) {
                                System.out.println("Không hợp lệ! ID hợp lệ có dạng SVVL-XXXX với X là các số 0-9. Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        isValid = false;

                        do {
                            System.out.print("Tiêu chuẩn phòng: ");
                            roomStandards = scanner.nextLine();
                            String roomStandardsRegExp = "^[A-Z]([a-z]|[0-9]| )+$";
                            boolean isMatched = roomStandards.matches(roomStandardsRegExp);
                            if (!isMatched) {
                                System.out.println("Không hợp lệ! Viết hoa ký tự đầu, còn lại viết thường. Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        isValid = false;

                        do {
                            System.out.print("Tiện nghi khác: ");
                            otherAmenitiesDescription = scanner.nextLine();
                            String otherAmenitiesDescriptionRegExp = "^[A-Z]([a-z]|[0-9]| )+$";
                            boolean isMatched = otherAmenitiesDescription.matches(otherAmenitiesDescriptionRegExp);
                            if (!isMatched) {
                                System.out.println("Không hợp lệ! Viết hoa ký tự đầu, còn lại viết thường. Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        isValid = false;

                        do {
                            System.out.print("Diện tích hồ bơi: ");
                            poolArea = scanner.nextLine();
                            if (Double.parseDouble(poolArea) <= 30) {
                                System.out.println("Diện tích hồ bơi phải lớn hơn 30! Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        isValid = false;

                        do {
                            System.out.print("Số tầng: ");
                            floors = scanner.nextLine();
                            if (Integer.parseInt(floors) <= 0) {
                                System.out.println("Số tầng phải lớn hơn 0! Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        break;
                    }
                    case "House": {
                        boolean isValid = false;

                        do {
                            System.out.print("ID: ");
                            id = scanner.nextLine();
                            String idRegExp = "^SVHO-\\d{4}$";
                            boolean isMatched = id.matches(idRegExp);
                            if (!isMatched) {
                                System.out.println("Không hợp lệ! ID hợp lệ có dạng SVHO-XXXX với X là các số 0-9. Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        isValid = false;

                        do {
                            System.out.print("Tiêu chuẩn phòng: ");
                            roomStandards = scanner.nextLine();
                            String roomStandardsRegExp = "^[A-Z]([a-z]|[0-9]| )+$";
                            boolean isMatched = roomStandards.matches(roomStandardsRegExp);
                            if (!isMatched) {
                                System.out.println("Không hợp lệ! Viết hoa ký tự đầu, còn lại viết thường. Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        isValid = false;

                        do {
                            System.out.print("Tiện nghi khác: ");
                            otherAmenitiesDescription = scanner.nextLine();
                            String otherAmenitiesDescriptionRegExp = "^[A-Z]([a-z]|[0-9]| )+$";
                            boolean isMatched = otherAmenitiesDescription.matches(otherAmenitiesDescriptionRegExp);
                            if (!isMatched) {
                                System.out.println("Không hợp lệ! Viết hoa ký tự đầu, còn lại viết thường. Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        isValid = false;

                        do {
                            System.out.print("Số tầng: ");
                            floors = scanner.nextLine();
                            if (Integer.parseInt(floors) <= 0) {
                                System.out.println("Số tầng phải lớn hơn 0! Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        break;
                    }
                    case "Room": {
                        boolean isValid = false;

                        do {
                            System.out.print("ID: ");
                            id = scanner.nextLine();
                            String idRegExp = "^SVRO-\\d{4}$";
                            boolean isMatched = id.matches(idRegExp);
                            if (!isMatched) {
                                System.out.println("Không hợp lệ! ID hợp lệ có dạng SVRO-XXXX với X là các số 0-9. Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        isValid = false;

                        do {
                            System.out.print("Dịch vụ miễn phí đi kèm: ");
                            includedFreeServices = scanner.nextLine();
                            String includedFreeServicesRegExp = "^[A-Z]([a-z]|[0-9]| )+$";
                            boolean isMatched = includedFreeServices.matches(includedFreeServicesRegExp);
                            if (!isMatched) {
                                System.out.println("Không hợp lệ! Viết hoa ký tự đầu, còn lại viết thường. Mời nhập lại.");
                            } else {
                                isValid = true;
                            }
                        } while (!isValid);
                        break;
                    }
                }
            }
        }

        private static void inputCommonServiceData(String service) {
            boolean isValid = false;
            serviceType = service;

            System.out.print("Tên " + service + ": ");
            serviceName = scanner.nextLine();

            do {
                System.out.print("Diện tích sử dụng: ");
                usedSpace = scanner.nextLine();
                if (Double.parseDouble(usedSpace) <= 30) {
                    System.out.println("Diện tích sử dụng phải lớn hơn 30! Mời nhập lại.");
                } else {
                    isValid = true;
                }
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Chi phí thuê: ");
                fee = scanner.nextLine();
                if (Integer.parseInt(fee) <= 0) {
                    System.out.println("Chi phí thuê phải lớn hơn 0! Mời nhập lại.");
                } else {
                    isValid = true;
                }
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Số lượng người tối đa: ");
                maxPeople = scanner.nextLine();
                int temp = Integer.parseInt(maxPeople);
                if (temp <= 0 || temp >= 20) {
                    System.out.println("Số lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20! Mời nhập lại.");
                } else {
                    isValid = true;
                }
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Kiểu thuê: ");
                rentType = scanner.nextLine();
                String rentTypeRegExp = "^(Year|Month|Day|Hour)$";
                boolean isMatched = rentType.matches(rentTypeRegExp);
                if (!isMatched) {
                    System.out.println("Kiểu thuê phải là 1 trong các loại: Year/Month/Day/Hour. Mời nhập lại.");
                } else {
                    isValid = true;
                }
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Tên dịch vụ đi kèm: ");
                accompaniedServiceName = scanner.nextLine();
                String accompaniedServiceNameRegExp = "^(Massage|Karaoke|Food|Drink|Car)$";
                boolean isMatched = accompaniedServiceName.matches(accompaniedServiceNameRegExp);
                if (!isMatched) {
                    System.out.println("Dịch vụ đi kèm phải là 1 trong các loại: Massage/Karaoke/Food/Drink/Car. Mời nhập lại.");
                } else {
                    isValid = true;
                }
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Đơn vị của dịch vụ đi kèm: ");
                unit = scanner.nextLine();
                String unitRegExp = "^[A-Z]([a-z]|[0-9]| )+$";
                boolean isMatched = unit.matches(unitRegExp);
                if (!isMatched) {
                    System.out.println("Không hợp lệ! Viết hoa ký tự đầu, còn lại viết thường. Mời nhập lại.");
                } else {
                    isValid = true;
                }
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Đơn giá dịch vụ đi kèm: ");
                unitPrice = scanner.nextLine();
                if (Integer.parseInt(unitPrice) <= 0) {
                    System.out.println("Đơn giá phải lớn hơn 0! Mời nhập lại.");
                } else {
                    isValid = true;
                }
            } while (!isValid);
        }

        private static void saveServiceDataToFile() {
            String filePath = System.getProperty("user.dir") + "\\src\\Data\\" + serviceType + ".csv";

            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);

                printWriter.print(id + "," + serviceName + "," + usedSpace + "," + fee + "," + maxPeople + "," + rentType
                        + "," + accompaniedServiceName + "," + unit + "," + unitPrice + ",");

                switch (serviceName) {
                    case "Villa": {
                        printWriter.println(roomStandards + "," + otherAmenitiesDescription + "," + poolArea + "," + floors);
                        break;
                    }
                    case "House": {
                        printWriter.println(roomStandards + "," + otherAmenitiesDescription + "," + floors);
                        break;
                    }
                    case "Room": {
                        printWriter.println(includedFreeServices);
                        break;
                    }
                }

                printWriter.flush();
                printWriter.close();
                System.out.println("Successfully added!");
            } catch (Exception e) {
                System.out.println("Failed to save service data to file!");
            }
        }
    }

    public static class ServiceCsvReader {
        private static Scanner scanner;
        public static ArrayList<Villa> villas = new ArrayList<Villa>();
        public static ArrayList<House> houses = new ArrayList<House>();
        public static ArrayList<Room> rooms = new ArrayList<Room>();

        public static void readAllRecords(String service) throws PassingParameterException {
            if (!(service.equals("Villa") || service.equals("House") || service.equals("Room"))) {
                throw new PassingParameterException("Parameter \"service\" must be \"Villa\" or \"House\" or \"Room\".");
            } else {
                String filePath = System.getProperty("user.dir") + "\\src\\Data\\" + service + ".csv";
                try {
                    scanner = new Scanner(new File(filePath));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                scanner.useDelimiter("[,\n]");

                switch (service) {
                    case "Villa": {
                        villas = new ArrayList<Villa>();
                        while (scanner.hasNext()) {
                            String id = scanner.next();
                            String serviceName = scanner.next();
                            String usedSpace = scanner.next();
                            String fee = scanner.next();
                            String maxPeople = scanner.next();
                            String rentType = scanner.next();
                            String accompaniedServiceName = scanner.next();
                            String unit = scanner.next();
                            String unitPrice = scanner.next();
                            String roomStandards = scanner.next();
                            String otherAmenitiesDescription = scanner.next();
                            String poolArea = scanner.next();
                            String floors = scanner.next();
                            Villa temp = new Villa(id, serviceName, usedSpace, fee, maxPeople, rentType,
                                    accompaniedServiceName, unit, unitPrice,
                                    roomStandards, otherAmenitiesDescription, poolArea, floors);
                            villas.add(temp);
                        }
                    }
                    case "House": {
                        houses = new ArrayList<House>();
                        while (scanner.hasNext()) {
                            String id = scanner.next();
                            String serviceName = scanner.next();
                            String usedSpace = scanner.next();
                            String fee = scanner.next();
                            String maxPeople = scanner.next();
                            String rentType = scanner.next();
                            String accompaniedServiceName = scanner.next();
                            String unit = scanner.next();
                            String unitPrice = scanner.next();
                            String roomStandards = scanner.next();
                            String otherAmenitiesDescription = scanner.next();
                            String floors = scanner.next();
                            House temp = new House(id, serviceName, usedSpace, fee, maxPeople, rentType,
                                    accompaniedServiceName, unit, unitPrice,
                                    roomStandards, otherAmenitiesDescription, floors);
                            houses.add(temp);
                        }
                    }
                    case "Room": {
                        rooms = new ArrayList<Room>();
                        while (scanner.hasNext()) {
                            String id = scanner.next();
                            String serviceName = scanner.next();
                            String usedSpace = scanner.next();
                            String fee = scanner.next();
                            String maxPeople = scanner.next();
                            String rentType = scanner.next();
                            String accompaniedServiceName = scanner.next();
                            String unit = scanner.next();
                            String unitPrice = scanner.next();
                            String includedFreeServices = scanner.next();
                            Room temp = new Room(id, serviceName, usedSpace, fee, maxPeople, rentType,
                                    accompaniedServiceName, unit, unitPrice, includedFreeServices);
                            rooms.add(temp);
                        }
                    }
                }
            }
        }

        private static void showAllRooms() {
            for (int i = 0; i < rooms.size(); i++) {
                System.out.println("Item " + (i + 1) + ":");
                rooms.get(i).showInfo();
                System.out.println();
            }
        }

        private static void showAllHouses() {
            for (int i = 0; i < houses.size(); i++) {
                System.out.println("Item " + (i + 1) + ":");
                houses.get(i).showInfo();
                System.out.println();
            }
        }

        private static void showAllVillas() {
            for (int i = 0; i < villas.size(); i++) {
                System.out.println("Item " + (i + 1) + ":");
                villas.get(i).showInfo();
                System.out.println();
            }
        }
    }

    private static class CustomerCsvWriter {
        private static Customer newCustomer = new Customer();
        private static Scanner scanner = new Scanner(System.in);

        private static void inputCustomerData() {
            boolean isValid = false;

            do {
                System.out.print("Họ tên khách hàng: ");
                String tempFullName = scanner.nextLine();
                try {
                    String[] words = tempFullName.split(" ");
                    String wordRegExp = "^[A-Z][a-z]+$";
                    boolean isAccepted = true;
                    for (String word : words) {
                        if (!word.matches(wordRegExp)) {
                            isAccepted = false;
                            break;
                        }
                    }
                    if (!isAccepted) {
                        throw new NameException("Không hợp lệ! Tên khách hàng phải in hoa ký tự đầu tiên trong mỗi từ. Mời nhập lại.");
                    }
                } catch (NameException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                newCustomer.setFullName(tempFullName);
                isValid = true;
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Ngày sinh: ");
                String tempDateOfBirth = scanner.nextLine();
                try {
                    String dateOfBirthRegExp = "^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|200[0-2])$";
                    boolean isAccepted = tempDateOfBirth.matches(dateOfBirthRegExp);
                    if (!isAccepted) {
                        throw new BirthdayException("Không hợp lệ! Ngày sinh phải đúng định dạng dd/mm/yyyy và khách hàng phải trên 18 tuổi. Mời nhập lại.");
                    }
                } catch (BirthdayException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                newCustomer.setDateOfBirth(tempDateOfBirth);
                isValid = true;
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Giới tính: ");
                String tempGender = scanner.nextLine();
                try {
                    tempGender = tempGender.toLowerCase();
                    String genderRegExp = "^(male|female|unknown)$";
                    boolean isAccepted = tempGender.matches(genderRegExp);

                    if (!isAccepted) {
                        throw new GenderException("Không hợp lệ! Giới tính phải là Male/Female/Unknown. Mời nhập lại.");
                    }
                } catch (GenderException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                tempGender = tempGender.substring(0, 1).toUpperCase() + tempGender.substring(1);
                newCustomer.setGender(tempGender);
                isValid = true;
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Số CMND: ");
                String tempIdNumber = scanner.nextLine();
                try {
                    String idNumberRegExp = "^\\d{3} \\d{3} \\d{3}$";
                    boolean isAccepted = tempIdNumber.matches(idNumberRegExp);

                    if (!isAccepted) {
                        throw new GenderException("Không hợp lệ! Số CMND phải có 9 số theo định dạng XXX XXX XXX. Mời nhập lại.");
                    }
                } catch (GenderException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                newCustomer.setIdNumber(tempIdNumber);
                isValid = true;
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Số điện thoại: ");
                String tempPhoneNumber = scanner.nextLine();
                try {
                    String phoneNumberRegExp = "^\\d{10}$";
                    boolean isAccepted = tempPhoneNumber.matches(phoneNumberRegExp);
                    if (!isAccepted) {
                        throw new PhoneNumberException("Không hợp lệ! Số điện thoại phải có 10 số. Mời nhập lại.");
                    }
                } catch (PhoneNumberException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                newCustomer.setPhoneNumber(tempPhoneNumber);
                isValid = true;
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Email: ");
                String tempEmail = scanner.nextLine();
                try {
                    String emailRegExp = "^([0-9A-Za-z]+){3}@([0-9A-Za-z]+){3}(\\.[0-9A-Za-z]+){1,2}$";
                    boolean isAccepted = tempEmail.matches(emailRegExp);
                    if (!isAccepted) {
                        throw new EmailException("Không hợp lệ! Email phải theo định dạng abc@abc.abc");
                    }
                } catch (EmailException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                newCustomer.setEmail(tempEmail);
                isValid = true;
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Loại khách hàng: ");
                String tempTypeOfCustomer = scanner.nextLine();
                String typeOfCustomerRegExp = "^[A-Z]([a-z]|[0-9]| )+$";
                boolean isAccepted = tempTypeOfCustomer.matches(typeOfCustomerRegExp);
                if (!isAccepted) {
                    System.out.println("Không hợp lệ! Viết hoa ký tự đầu, còn lại viết thường. Mời nhập lại.");
                } else {
                    newCustomer.setTypeOfCustomer(tempTypeOfCustomer);
                    isValid = true;
                }
            } while (!isValid);
            isValid = false;

            do {
                System.out.print("Địa chỉ: ");
                String tempAddress = scanner.nextLine();
                String addressRegExp = "^[A-Z]([a-z]|[0-9]|-| )+$";
                boolean isAccepted = tempAddress.matches(addressRegExp);
                if (!isAccepted) {
                    System.out.println("Không hợp lệ! Viết hoa ký tự đầu, còn lại viết thường. Mời nhập lại.");
                } else {
                    newCustomer.setAddress(tempAddress);
                    isValid = true;
                }
            } while (!isValid);

        }

        private static void saveCustomerDataToFile() {
            String filePath = System.getProperty("user.dir") + "\\src\\Data\\Customer.csv";

            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);

                printWriter.println(newCustomer.getFullName() + ","
                        + newCustomer.getDateOfBirth() + ","
                        + newCustomer.getGender() + ","
                        + newCustomer.getIdNumber() + ","
                        + newCustomer.getPhoneNumber() + ","
                        + newCustomer.getEmail() + ","
                        + newCustomer.getTypeOfCustomer() + ","
                        + newCustomer.getAddress());

                printWriter.flush();
                printWriter.close();
                System.out.println("Successfully added!");
            } catch (Exception e) {
                System.out.println("Failed to save customer data to file!");
            }
        }
    }

    private static class CustomerCsvReader {
        private static Scanner scanner;
        private static ArrayList<Customer> customers = new ArrayList<Customer>();
        private static int chosenCustomerNumber;
        private static int displayServiceNumber;
        private static int chosenItemNumber;

        public static void readAllRecords() {
            customers = new ArrayList<Customer>();
            String filePath = System.getProperty("user.dir") + "\\src\\Data\\Customer.csv";
            try {
                scanner = new Scanner(new File(filePath));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            scanner.useDelimiter("[,\n]");

            while (scanner.hasNext()) {
                String fullName = scanner.next();
                String dateOfBirth = scanner.next();
                String gender = scanner.next();
                String idNumber = scanner.next();
                String phoneNumber = scanner.next();
                String email = scanner.next();
                String typeOfCustomer = scanner.next();
                String address = scanner.next();
                Customer temp = new Customer(fullName, dateOfBirth, gender, idNumber, phoneNumber, email, typeOfCustomer, address);
                customers.add(temp);

                customers.sort(new BirthYearComparator());
                customers.sort(new NameComparator());
            }
        }

        public static void showAllCustomers() {
            for (int i = 0; i < customers.size(); i++) {
                System.out.println("No." + (i + 1));
                customers.get(i).showInfo();
                System.out.println();
            }
        }

        public static void bookService() {
            chooseCustomerToBook();
            chooseServiceToDisplay();
            displayServiceItemsToBook(displayServiceNumber);
            chooseServiceItemToBook(displayServiceNumber);
            saveBookingDataToFile(chosenCustomerNumber, displayServiceNumber, chosenItemNumber);
        }

        public static void chooseCustomerToBook() {
            scanner = new Scanner(System.in);
            for (int i = 0; i < customers.size(); i++) {
                System.out.printf("%-1d%-20s%s", i + 1, ". " + customers.get(i).getFullName(), "CMND: " + customers.get(i).getIdNumber());
                System.out.println();
            }
            do {
                System.out.print("Choose a number: ");
                chosenCustomerNumber = scanner.nextInt();
                if (chosenCustomerNumber - 1 >= customers.size() || chosenCustomerNumber <= 0) {
                    System.out.println("Số vừa nhập không có trong danh sách. Mời nhập lại.");
                } else {
                    break;
                }
            } while (true);

        }

        public static void chooseServiceToDisplay() {
            System.out.println("1. Booking Villa\n"
                    + "2. Booking House\n"
                    + "3. Booking Room\n");
            do {
                System.out.print("Choose a number: ");
                displayServiceNumber = scanner.nextInt();
                if (displayServiceNumber > 3 || displayServiceNumber <= 0) {
                    System.out.println("Số vừa nhập không có trong danh sách. Mời nhập lại.");
                } else {
                    break;
                }
            } while (true);
        }

        public static void displayServiceItemsToBook(int displayServiceNumber) {
            switch (displayServiceNumber) {
                case 1: {
                    try {
                        ServiceCsvReader.readAllRecords("Villa");
                    } catch (PassingParameterException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 2: {
                    try {
                        ServiceCsvReader.readAllRecords("House");
                    } catch (PassingParameterException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 3: {
                    try {
                        ServiceCsvReader.readAllRecords("Room");
                    } catch (PassingParameterException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }

        public static void chooseServiceItemToBook(int displayServiceNumber) {
            scanner = new Scanner(System.in);
            switch (displayServiceNumber) {
                case 1: {
                    System.out.print("Enter an item number: ");
                    chosenItemNumber = scanner.nextInt();
                    int itemIndex = chosenItemNumber - 1;
                    if (itemIndex < 0 || itemIndex >= ServiceCsvReader.villas.size()) {
                        System.out.println("Số nhập vào không có trong danh sách. Mời nhập lại.");
                        chooseServiceItemToBook(displayServiceNumber);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter an item number: ");
                    chosenItemNumber = scanner.nextInt();
                    int itemIndex = chosenItemNumber - 1;
                    if (itemIndex < 0 || itemIndex >= ServiceCsvReader.houses.size()) {
                        System.out.println("Số nhập vào không có trong danh sách. Mời nhập lại.");
                        chooseServiceItemToBook(displayServiceNumber);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter an item number: ");
                    chosenItemNumber = scanner.nextInt();
                    int itemIndex = chosenItemNumber - 1;
                    if (itemIndex < 0 || itemIndex >= ServiceCsvReader.rooms.size()) {
                        System.out.println("Số nhập vào không có trong danh sách. Mời nhập lại.");
                        chooseServiceItemToBook(displayServiceNumber);
                    }
                    break;
                }
            }
        }

        public static void saveBookingDataToFile(int customerNumber, int displayServiceNumber, int itemNumber) {
            String filePath = System.getProperty("user.dir") + "\\src\\Data\\Booking.csv";

            int customerIndex = customerNumber - 1;
            int itemIndex = itemNumber - 1;
            String printContent = "";

            printContent = customers.get(customerIndex).getFullName() + ","
                    + customers.get(customerIndex).getDateOfBirth() + ","
                    + customers.get(customerIndex).getGender() + ","
                    + customers.get(customerIndex).getIdNumber() + ","
                    + customers.get(customerIndex).getPhoneNumber() + ","
                    + customers.get(customerIndex).getEmail() + ","
                    + customers.get(customerIndex).getTypeOfCustomer() + ","
                    + customers.get(customerIndex).getAddress() + ",";

            switch (displayServiceNumber) {
                case 1: {
                    Villa villa = ServiceCsvReader.villas.get(itemIndex);
                    printContent += villa.id + ","
                            + villa.serviceName + ","
                            + villa.usedSpace + ","
                            + villa.fee + ","
                            + villa.maxPeople + ","
                            + villa.rentType + ","
                            + villa.accompaniedService.name + ","
                            + villa.accompaniedService.unit + ","
                            + villa.accompaniedService.unitPrice + ","
                            + villa.roomStandards + ","
                            + villa.otherAmenitiesDescription + ","
                            + villa.poolArea + ","
                            + villa.floors;
                    break;
                }
                case 2: {
                    House house = ServiceCsvReader.houses.get(itemIndex);
                    printContent += house.id + ","
                            + house.serviceName + ","
                            + house.usedSpace + ","
                            + house.fee + ","
                            + house.maxPeople + ","
                            + house.rentType + ","
                            + house.accompaniedService.name + ","
                            + house.accompaniedService.unit + ","
                            + house.accompaniedService.unitPrice + ","
                            + house.roomStandards + ","
                            + house.otherAmenitiesDescription + ","
                            + house.floors;
                    break;
                }
                case 3: {
                    Room room = ServiceCsvReader.rooms.get(itemIndex);
                    printContent += room.id + ","
                            + room.serviceName + ","
                            + room.usedSpace + ","
                            + room.fee + ","
                            + room.maxPeople + ","
                            + room.rentType + ","
                            + room.accompaniedService.name + ","
                            + room.accompaniedService.unit + ","
                            + room.accompaniedService.unitPrice + ","
                            + room.includedFreeServices;
                    break;
                }
            }
            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                printContent = printContent.replaceFirst("\\r", "");
                printWriter.print(printContent);

                printWriter.flush();
                printWriter.close();
                System.out.println("Successfully added!");
            } catch (Exception e) {
                System.out.println("Failed to save customer data to file!");
            }
        }
    }

    public static class EmployeeCsvReader {
        private static Scanner scanner;
        private static Map<String, Employee> mapEmployees = new HashMap<>();
        public static ArrayList<Employee> listEmployees = new ArrayList<Employee>();

        public static void readAllRecords() {
            String filePath = System.getProperty("user.dir") + "\\src\\Data\\Employee.csv";
            try {
                scanner = new Scanner(new File(filePath));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            scanner.useDelimiter("[,\n]");

            mapEmployees = new HashMap<>();
            listEmployees = new ArrayList<Employee>();
            while (scanner.hasNext()) {
                String id = scanner.next();
                String fullName = scanner.next();
                String age = scanner.next();
                String address = scanner.next();
                Employee employee = new Employee(id, fullName, age, address);

                mapEmployees.put(employee.getId(), employee);
                listEmployees.add(employee);
            }
        }

        public static void showAllEmployees() {
            mapEmployees.forEach((key, value) -> {
                System.out.println("Key: " + key + "\t" + value.toString());
            });
        }
    }
}