import java.util.ArrayList;

/**
 * Создадим список из 10 котиков, причем в списке есть два Барсика и три Мурки.
 *
 * Если пользователь вводит "мяу", то к имени каждого котика прибавляется его индекс в списке,
 * начиная с 0 и слово "мяу" и выводит измененных котиков в одну строку через запятую
 * Если пользователь вводит "смирно", котики сортируются в списке и выводятся по алфавиту
 * Если пользователь вводит имя котика, то все котики с этим именем выводятся и в конце
 * пишется количество таких котиков. Причем регистр имени котика не важен, то есть "мурка" и
 * "Мурка" ищет, выводит и считает всех мурок и Мурок в списке
 */

public class CatList {
    private ArrayList<String> catList;

    private int countCatsWithName(String name) {
        int count = 0;
        return count;
    }

    private void printCats(ArrayList<String> catList) {
    }

    private void sortCats() {
    }

    public void catsMeow() {
    }

    public void catsAttention() {
    }

    public void catsWithName() {
    }

    public CatList(ArrayList<String> catList) {
        this.catList = catList;
    }
}
