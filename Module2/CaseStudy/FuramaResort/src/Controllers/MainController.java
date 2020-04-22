package Controllers;

import Models.House;
import Models.Room;
import Models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number:\n"
                + "1. Add new Services\n"
                + "2. Show Services\n"
                + "3. Add a new Customer\n"
                + "4. Show Information of Customer\n"
                + "5. Add a new Booking\n"
                + "6. Show Information of Employee\n"
                + "7. Book 4D Movie Tickets\n"
                + "8. Find an Employee\n"
                + "9. Exit");

        int chosenNumber = scanner.nextInt();
        switch (chosenNumber) {
            case 1: {
                addNewServices();
                break;
            }
            case 2: {
                showServices();
                break;
            }
            case 3: {

            }
            case 4: {

            }
            case 5: {

            }
            case 6: {

            }
            case 7: {

            }
            case 8: {

            }
            case 9: {
                break;
            }
        }
    }

    private static void addNewServices() {
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
                    CsvWriter.inputData("Villa");
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                try {
                    CsvWriter.inputData("House");
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                try {
                    CsvWriter.inputData("Room");
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
                "1. Show all Villa\n" +
                "2. Show all House\n" +
                "3. Show all Room\n" +
                "4. Show all Name Villa not duplicate\n" +
                "5. Show all Name House not duplicate\n" +
                "6. Show all Name Room not duplicate\n" +
                "7. Back to Main menu\n" +
                "8. Exit");

        int chosenNumber = scanner.nextInt();
        switch (chosenNumber) {
            case 1: {
                try {
                    CsvReader.readAllRecords("Villa");
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                try {
                    CsvReader.readAllRecords("House");
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                try {
                    CsvReader.readAllRecords("Room");
                } catch (PassingParameterException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {

            }
            case 5: {

            }
            case 6: {

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

    private static class CsvWriter {
        private static String id;
        private static String serviceName;
        private static String usedSpace;
        private static String fee;
        private static String maxPeople;
        private static String rentType;
        private static String roomStandards;
        private static String otherAmenitiesDescription;
        private static String poolArea;
        private static String floors;
        private static String includedFreeServices;
        private static Scanner scanner = new Scanner(System.in);

        public static void inputData(String service) throws PassingParameterException {
            if (!(service.equals("Villa") || service.equals("House") || service.equals("Room"))) {
                throw new PassingParameterException("Parameter \"service\" must be \"Villa\" or \"House\" or \"Room\".");
            } else {
                inputCommonData(service);
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

                        System.out.print("Dịch vụ miễn phí đi kèm: ");
                        includedFreeServices = scanner.nextLine();
                        break;
                    }
                }
                saveDataToFile();
            }
        }

        private static void inputCommonData(String service) {
            boolean isValid = false;

            serviceName = service;

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
                    System.out.println("Kiểu thuê phải thuộc một trong các loại sau: Year/Month/Day/Hour. Mời nhập lại.");
                } else {
                    isValid = true;
                }
            } while (!isValid);
        }

        public static void saveDataToFile() {
            String filePath = System.getProperty("user.dir") + "\\src\\Data\\" + serviceName + ".csv";

            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);

                printWriter.print(id + "," + serviceName + "," + usedSpace + "," + fee + "," + maxPeople + "," + rentType + ",");

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
                System.out.println("Failed to save data to file!");
            }
        }
    }

    private static class CsvReader {
        private static Scanner scanner;

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
                        ArrayList<Villa> villas = new ArrayList<Villa>();
                        while (scanner.hasNext()) {
                            String id = scanner.next();
                            String serviceName = scanner.next();
                            String usedSpace = scanner.next();
                            String fee = scanner.next();
                            String maxPeople = scanner.next();
                            String rentType = scanner.next();
                            String roomStandards = scanner.next();
                            String otherAmenitiesDescription = scanner.next();
                            String poolArea = scanner.next();
                            String floors = scanner.next();
                            Villa temp = new Villa(id, serviceName, usedSpace, fee, maxPeople, rentType,
                                    roomStandards, otherAmenitiesDescription, poolArea, floors);
                            villas.add(temp);
                        }
                        for (Villa villa : villas) {
                            villa.showInfo();
                            System.out.println();
                        }
                    }
                    case "House": {
                        ArrayList<House> houses = new ArrayList<House>();
                        while (scanner.hasNext()) {
                            String id = scanner.next();
                            String serviceName = scanner.next();
                            String usedSpace = scanner.next();
                            String fee = scanner.next();
                            String maxPeople = scanner.next();
                            String rentType = scanner.next();
                            String roomStandards = scanner.next();
                            String otherAmenitiesDescription = scanner.next();
                            String floors = scanner.next();
                            House temp = new House(id, serviceName, usedSpace, fee, maxPeople, rentType,
                                    roomStandards, otherAmenitiesDescription, floors);
                            houses.add(temp);
                        }
                        for (House house : houses) {
                            house.showInfo();
                            System.out.println();
                        }
                    }
                    case "Room": {
                        ArrayList<Room> rooms = new ArrayList<Room>();
                        while (scanner.hasNext()) {
                            String id = scanner.next();
                            String serviceName = scanner.next();
                            String usedSpace = scanner.next();
                            String fee = scanner.next();
                            String maxPeople = scanner.next();
                            String rentType = scanner.next();
                            String includedFreeServices = scanner.next();
                            Room temp = new Room(id, serviceName, usedSpace, fee, maxPeople, rentType, includedFreeServices);
                            rooms.add(temp);
                        }
                        for (Room room : rooms) {
                            room.showInfo();
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}