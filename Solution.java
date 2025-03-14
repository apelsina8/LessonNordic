public class Solution {
    public int maximumWealth(int[][] accounts) { //принимаем массивы счетов
        int maxWealth = 0;
        int currentWealth = 0;

        for (int i = 0; i < accounts.length; i++) { //проход по счетам
            for (int j = 0; j < accounts[i].length; j++) { //проход по счету
                currentWealth += accounts[i][j]; //суммируем счет в текущее богатсво
            }
            if (currentWealth > maxWealth) { //если текущее богатство больше максбогатства
                maxWealth = currentWealth; //то приравнять текущее богатство к максбогатству
            }
            currentWealth = 0; //обнулить текущее богатство для подсчета следующего счета
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 4, 1}
        };

        int maxWealth = solution.maximumWealth(accounts);
        System.out.println("Максимальное богатство: " + maxWealth);
    }
}
