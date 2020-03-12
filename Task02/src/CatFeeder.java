import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Нужно вывести юзеру три вида корма для котиков и предложить выбрать один.
 * Юзер вводит выбранный корм и мы выводим реакцию котика на этот корм.
 * Задачка на ввод-вывод. Дополнительная сложность: если котику корм понравился,
 * он требует еще и надо дать возможность юзеру снова покормить котика.
 * Если покормить больше 2х раз, то котик лопнет.
 *
 * Подсказка: цикл while, ввод-вывод, условные операторы
 */

public class CatFeeder {
    private int foodIndex = 0;
    private int favouriteFoodIndex;
    private String[] food;
    private String chosenFood;
    private boolean isCatAlive = true;
    private boolean isPresent = false;

    private void chooseFavouriteFood() {
        this.favouriteFoodIndex = (int) (Math.random() * food.length);
    }

    private void printFoodMenu() {
        System.out.println("These are available food types:");
        for (String s: food) {
            System.out.println("- " + s);
        }
        System.out.println("Please select one to feed the cat");
    }

    private void isChosenFoodAvailable() throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        chosenFood = reader.readLine().toLowerCase();

        for(String s:food) {
            if(chosenFood.equals(s.toLowerCase())){
                isPresent=true;
                break;
            }
        }
    }

    private void printFoodReaction() throws IOException {
        isChosenFoodAvailable();
        if (isPresent) {
            if (chosenFood.equals(food[favouriteFoodIndex].toLowerCase())) {
                System.out.println("Myao! That was very tasty!");
                feedTheCat();
            } else {
                System.out.println("Frrr! I want something else!");
            }
        } else {
            System.out.println("There is no such food available");
        }
    }

    private void feedTheCat() {
        if (foodIndex < 2) {
            foodIndex++;
        } else {
            System.out.println("Kaboom! Tha cat has exploded." + "\n" + "Do not feed you cat so much next time.");
            isCatAlive = false;
        }
    }

    public void runCatFeeder() throws IOException {
        printFoodMenu();
        while (isCatAlive) {
            printFoodReaction();
        }
    }

    public CatFeeder(String[] food) {
        this.food = food;
        chooseFavouriteFood();
    }
}