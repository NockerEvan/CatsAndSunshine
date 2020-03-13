import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Есть приют, куда хозяева сдают котиков, когда уезжают из дома. Нужно:
 *
 * Вывести список имен всех котиков в приюте на начало сезона в количестве 10 котиков. Имена котиков не повторяются
 * Вася привел нового котика, ему предложили ввести имя котика и после этого котика запихнули в конец списка
 * Вывести обновленный список котиков
 * Маша забрала домой 1ого в списке котика
 * Оля забрала домой котика по имени Барсик, который болтался примерно в середине списка
 * Вывести список оставшихся в приюте котиков
 * Подсказка: списки, массивы, цикл for, ввод, вывод
 */

public class CatHotel {
    private ArrayList<String> cats;

    public CatHotel(ArrayList<String> cats) {
        this.cats = cats;
    }

    private void bringACat(String newCat) {
        cats.add(newCat);
    }

    private void takeACat(int index) {
        if (index < cats.size()) {
            cats.remove(index - 1);
        } else {
            System.out.println("There is no cat with this number." + "\n" +
                    "Please choose the number between 1 and " + cats.size());
        }
    }

    private void takeACat(String catName) {
        if (isPresent(catName)) {
            cats.remove(catName);
        } else {
            System.out.println("There is no such cat in the hotel.");
        }
    }

    private void printAllCats() {
        int size = cats.size();
        for (int i = 0; i < size; i++) {
            System.out.print((i+1) + "-" + cats.get(i) + " ");
        }
        System.out.println();
    }

    private boolean isPresent(String catName) {
        boolean isPresent = false;
        for (String s: cats) {
            if (s.toLowerCase().equals(catName.toLowerCase())) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    private void printInstructions() {
        System.out.println("Welcome to our cat hotel 'Pet Paradise'!");
        System.out.println("Here our current guests:");
        printAllCats();
        System.out.println("You can:" + "\n" +
                "1 - Bring a new cat" + "\n" +
                "2 - Take a cat home (chose by number or by name)" + "\n" +
                "3 - Leave the hotel");
        System.out.println("Type a number to choose an option");
    }

    private void hotelLogic(int choice) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (choice == 1) {
            System.out.println("Type a name and press Enter");
            String newCat = reader.readLine();
            bringACat(newCat);
        } else if (choice == 2) {
            try {
                int catNumber = Integer.parseInt(reader.readLine());
                takeACat(catNumber);
            } catch (NumberFormatException e) {
                String catName = reader.readLine();
                takeACat(catName);
            }
        }
        reader.close();
    }

    public void runHotel() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        printInstructions();
        while (true) {
            try {
                choice = Integer.parseInt(reader.readLine());
                if ((choice > 0) && (choice < 3)) {
                    hotelLogic(choice);
                    System.out.println("New cat hotel list:");
                    printAllCats();
                    break;
                } else if (choice == 3) {
                    System.out.println("Have a nice day and return to our hotel shortly!");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("You must type in a number between 1 and 3 inclusive");
            }
        }
    }
}
