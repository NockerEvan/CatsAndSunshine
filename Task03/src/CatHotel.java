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

        }
    }

    private void takeACat(String catName) {
        cats.remove(catName);
    }

    private void printAllCats() {
        for (String s: cats) {
            System.out.print(s + ", ");
        }
    }

    private void printInstructions() {
        System.out.println("Welcome to our cat hotel 'Pet Paradise'!");
        System.out.println("Here our current guests:");
        printAllCats();
        System.out.println("You can:" + "\n" +
                "1 - Bring a new cat" + "\n" +
                "2 - Take a cat home (chose by number or by name)" + "\n" +
                "3 - Leave the hotel");
    }

    private void runHotel() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(reader.readLine());
                if ((choice > 0) && (choice < 3)) {
                    hotelLogic(choice);
                } else if (choice == 3) {
                    System.out.println("Have a nice day and return to our hotel shortly!");
                    break;
                }
            } catch (IOException e) {
                System.out.println("You must type in a number between 1 and 3 inclusive");;
            }
        }
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
            } catch (IOException e) {
                String catName = reader.readLine();
                takeACat(catName);
            }
        }
        reader.close();
    }
}
