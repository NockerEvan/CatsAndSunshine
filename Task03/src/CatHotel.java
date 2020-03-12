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

    public void bringACat(String newCat) {
        cats.add(newCat);
    }

    public void takeACat(int index) {
        cats.remove(index);
    }

    public void takeACat(String catName) {
        cats.remove(catName);
    }

    public void printAllCats() {
        for (String s: cats) {
            System.out.print(s + ", ");
        }
    }
}
