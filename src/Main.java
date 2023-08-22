import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

        public class Main {
            public static void main(String[] args) {
                Passport passport1 = new Passport(LocalDate.of(2000,12,22), "London", "Male");
                Passport passport2 = new Passport(LocalDate.of(1999,9,12), "New York", "Female");

                Produkt product1 = new Produkt("banana", "description", 25, "54", 03_12_2023, "NoAlcoholic");
                Produkt product2 = new Produkt("apple", "red and juicy", 18, "32", 15_11_2023, "NoAlcoholic");
                Produkt product3 = new Produkt("orange", "vitamin C rich", 30, "32", 20_12_2022, "NoAlcoholic");
                Produkt alcohol1 = new Produkt("Whiskey", "Fine aged Scotch", 150, "43", 3_10_2025, "isAlcoholic");
                Produkt product4 = new Produkt("Pepsi", "Beverage", 9, "43", 6_7_1998, "isAlcoholic");
                Produkt[] products = {product1, product3};
                Produkt[] products2 = {product2};

                Bank bank1 = new Bank("Alex", 11111111, 2500);
                Bank bank2 = new Bank("Sarah", 22222222, 3500);

                Costumer costumer1 = new Costumer("Alex", passport1, products, bank1);
                Costumer costumer2 = new Costumer("Elina", passport2, products2, bank2);
                Costumer[] costumers = {costumer1, costumer2};

                Scanner scan = new Scanner(System.in);

                while (true) {
                    System.out.println("*|Выберите действие|*");
                    System.out.println("1. Действия с продуктами\n2. Действия с банком\n3. Действия с отдельным методом");
                    int c = scan.nextInt();

                    switch (c) {
                        case 1:
                            while (true) {
                                System.out.println();
                                System.out.println("Выбраны (Действия с продуктами)");
                                System.out.print("1. Удаление продукта по имени\n2. Добавление продукта\n3. Обновление имени\n4. Просмотр всех продуктов\n5. Назад\nВыберите действие с продуктами: ");
                                int x = scan.nextInt();
                                switch (x) {
                                    case 1:
                                        System.out.println();
                                        System.out.println("Выбрано действие (1)");
                                        costumer1.deleteProductByName("Alex", "banana");
                                        costumer2.deleteProductByName("Elina", "apple");
                                        break;
                                    case 2:
                                        System.out.println();
                                        System.out.println("Выбрано действие (2)");
                                        System.out.println(Arrays.toString(costumer1.addProduct(product1)));
                                        System.out.println(Arrays.toString(costumer2.addProduct(product2)));
                                        break;
                                    case 3:
                                        System.out.println();
                                        System.out.println("Выбрано действие (3)");
                                        System.out.println("Покупатель номер 1: ");
                                        System.out.println("Старое имя: " + costumer1.getName());
                                        costumer1.updateCostumerName("Alexander");
                                        System.out.println("Новое имя: " + costumer1.getName());
                                        System.out.println();
                                        System.out.println("Покупатель номер 2: ");
                                        System.out.println("Старое имя: " + costumer2.getName());
                                        costumer1.updateCostumerName("Elvira");
                                        System.out.println("Новое имя: " + costumer2.getName());
                                        break;
                                    case 4:
                                        System.out.println();
                                        System.out.println("Выбрано действие (4)");
                                        System.out.println("Покупатель номер 1: " + costumer1.checkProduct(products));
                                        System.out.println("Покупатель номер 2: " + costumer2.checkProduct(products2));
                                        break;
                                    case 5:
                                        System.out.println();
                                        System.out.println("Выбрано действие (5)");
                                        System.out.println("Выход из программы");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println();
                                        System.out.println("Некорректный выбор");
                                        break;
                                }
                            }
                        case 2:
                            while (true) {
                                System.out.println("Выбрана действие (банк)\n1. Оплатить продукты\n2. Взять кредит\nВыберите действие: ");
                                int f = scan.nextInt();
                                System.out.println();
                                switch (f) {
                                    case 1:
                                        System.out.println();
                                        System.out.println("Выбрано действие (1)");
                                        String paymentResult = bank1.payment("Alex", "11111111", 100);
                                        System.out.println(paymentResult);
                                        break;
                                    case 2:
                                        System.out.println();
                                        System.out.println("Выюрано действие (2)");
                                        String creditResult = bank1.credit("11111111", 500);
                                        System.out.println(creditResult);
                                        break;
                                    default:
                                        System.out.println();
                                        System.out.println("Выбрано действие (5)");
                                        System.out.println("Выход из программы");
                                        System.exit(0);
                                        break;
                                }
                            }
                        case 3:
                            Costumer[] costumers1 = getAllCostumerProducts(costumers, "Almaz");

                            System.out.println("Покупатель: " + costumer1.getName());
                            System.out.println("Продукты: " + Arrays.toString(costumer1.getProducts()));
                    }
                    break;
                }
            }
            public static Costumer[] getAllCostumerProducts(Costumer[] costumers, String targetName) {
                int count = 0;
                for (Costumer costumer : costumers) {
                    if (costumer.getName().equals(targetName)) {
                        count++;
                    }
                }

                if (count == 0) {
                    return null;
                }

                Costumer[] matchingCostumers = new Costumer[count];
                int index = 0;

                for (Costumer costumer : costumers) {
                    if (costumer.getName().equals(targetName)) {
                        matchingCostumers[index] = costumer;
                        index++;
                    }
                }

                return matchingCostumers;
            }
        }
















