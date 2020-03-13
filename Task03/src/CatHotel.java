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
        cats.remove(index);
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
                "2 - Take a cat home (chose by number in a row)" + "\n" +
                "3 - Take a cat home (chose by name)" + "\n" +
                "4 - Leave the hotel");
    }
}
