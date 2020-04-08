package BaiTap;

import java.util.Scanner;

public class b2_UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập số cần đọc: ");
        int n = scanner.nextInt();
        if (n < 20) {
            switch (n) {
                case 0: {
                    System.out.println("zero");
                    break;
                }
                case 1: {
                    System.out.println("one");
                    break;
                }
                case 2: {
                    System.out.println("two");
                    break;
                }
                case 3: {
                    System.out.println("three");
                    break;
                }
                case 4: {
                    System.out.println("four");
                    break;
                }
                case 5: {
                    System.out.println("five");
                    break;
                }
                case 6: {
                    System.out.println("six");
                    break;
                }
                case 7: {
                    System.out.println("seven");
                    break;
                }
                case 8: {
                    System.out.println("eight");
                    break;
                }
                case 9: {
                    System.out.println("nine");
                    break;
                }
                case 10: {
                    System.out.println("ten");
                    break;
                }
                case 11: {
                    System.out.println("eleven");
                    break;
                }
                case 12: {
                    System.out.println("twelve");
                    break;
                }
                case 13: {
                    System.out.println("thirteen");
                    break;
                }
                case 14: {
                    System.out.println("fourteen");
                    break;
                }
                case 15: {
                    System.out.println("fifteen");
                    break;
                }
                case 16: {
                    System.out.println("sixteen");
                    break;
                }
                case 17: {
                    System.out.println("seventeen");
                    break;
                }
                case 18: {
                    System.out.println("eighteen");
                    break;
                }
                case 19: {
                    System.out.println("nineteen");
                    break;
                }
                default:
                    break;
            }
        } else if (n >= 20 && n < 100) {
            int hangDonVi = n % 10;
            int hangChuc = n / 10;
            String result = "";
            switch (hangChuc) {
                case 2: {
                    result = "twenty";
                    break;
                }
                case 3: {
                    result = "thirty";
                    break;
                }
                case 4: {
                    result = "forty";
                    break;
                }
                case 5: {
                    result = "fifty";
                    break;
                }
                case 6: {
                    result = "sixty";
                    break;
                }
                case 7: {
                    result = "seventy";
                    break;
                }
                case 8: {
                    result = "eighty";
                    break;
                }
                case 9: {
                    result = "ninety";
                    break;
                }
                default:
                    break;
            }
            switch (hangDonVi) {
                case 1: {
                    result += " one";
                    break;
                }
                case 2: {
                    result += " two";
                    break;
                }
                case 3: {
                    result += " three";
                    break;
                }
                case 4: {
                    result += " four";
                    break;
                }
                case 5: {
                    result += " five";
                    break;
                }
                case 6: {
                    result += " six";
                    break;
                }
                case 7: {
                    result += " seven";
                    break;
                }
                case 8: {
                    result += " eight";
                    break;
                }
                case 9: {
                    result += " nine";
                    break;
                }
                default:
                    break;
            }
            System.out.printf(result);
        } else if (n >= 100 && n < 1000) {
            int hangDonVi = n % 10;
            int hangChuc = (n / 10) % 10;
            int hangTram = n / 100;
            String result = "";
            switch (hangTram) {
                case 1: {
                    result = "one hundred";
                    break;
                }
                case 2: {
                    result = "two hundred";
                    break;
                }
                case 3: {
                    result = "three hundred";
                    break;
                }
                case 4: {
                    result = "four hundred";
                    break;
                }
                case 5: {
                    result = "five hundred";
                    break;
                }
                case 6: {
                    result = "six hundred";
                    break;
                }
                case 7: {
                    result = "seven hundred";
                    break;
                }
                case 8: {
                    result = "eight hundred";
                    break;
                }
                case 9: {
                    result = "nine hundred";
                    break;
                }
                default:
                    break;
            }
            if (hangChuc == 1) {
                switch (hangDonVi) {
                    case 0: {
                        result += " and ten";
                        break;
                    }
                    case 1: {
                        result += " and eleven";
                        break;
                    }
                    case 2: {
                        result += " and twelve";
                        break;
                    }
                    case 3: {
                        result += " and thirteen";
                        break;
                    }
                    case 4: {
                        result += " and fourteen";
                        break;
                    }
                    case 5: {
                        result += " and fifteen";
                        break;
                    }
                    case 6: {
                        result += " and sixteen";
                        break;
                    }
                    case 7: {
                        result += " and seventeen";
                        break;
                    }
                    case 8: {
                        result += " and eighteen";
                        break;
                    }
                    case 9: {
                        result += " and nineteen";
                        break;
                    }
                    default:
                        break;
                }
                System.out.println(result);
            } else {
                switch (hangChuc) {
                    case 2: {
                        result += " and twenty";
                        break;
                    }
                    case 3: {
                        result += " and thirty";
                        break;
                    }
                    case 4: {
                        result += " and forty";
                        break;
                    }
                    case 5: {
                        result += " and fifty";
                        break;
                    }
                    case 6: {
                        result += " and sixty";
                        break;
                    }
                    case 7: {
                        result += " and seventy";
                        break;
                    }
                    case 8: {
                        result += " and eighty";
                        break;
                    }
                    case 9: {
                        result += " and ninety";
                        break;
                    }
                    default:
                        break;
                }
                if (hangChuc == 0 && hangDonVi != 0) {
                    result += " and";
                }
                switch (hangDonVi) {
                    case 1: {
                        result += " one";
                        break;
                    }
                    case 2: {
                        result += " two";
                        break;
                    }
                    case 3: {
                        result += " three";
                        break;
                    }
                    case 4: {
                        result += " four";
                        break;
                    }
                    case 5: {
                        result += " five";
                        break;
                    }
                    case 6: {
                        result += " six";
                        break;
                    }
                    case 7: {
                        result += " seven";
                        break;
                    }
                    case 8: {
                        result += " eight";
                        break;
                    }
                    case 9: {
                        result += " nine";
                        break;
                    }
                    default:
                        break;
                }
                System.out.printf(result);
            }
        } else {
            System.out.printf("out of ability");
        }
    }
}
