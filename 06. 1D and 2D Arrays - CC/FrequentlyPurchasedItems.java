import java.util.Scanner;

/**
 * Williams is the owner of Sparsha Mobile Store in his City. Mobile phones are
 * an integral part of our life today, the reason why William chose to invest in
 * this industry. Undoubtedly he had a huge customer base visiting his shop
 * everyday. Since he is totally new to such a model of business, he closely
 * observed the trend of mobile phones that is been purchased by people
 * everyday. He knew that if he knows this, he could tell his dealers what is
 * more demanding in the market and make his deal based on it.
 * 
 * 
 * 
 * To accomplish this, given a list of model Ids of mobile phone items that were
 * purchased in the previous month, William wanted to know the model Id of the
 * frequently purchased item. If more than one mobile phone model was purchased
 * same number of times, then display the model Id that is the highest. Write a
 * program to help William.
 * 
 * 
 * Input Format : The first line of input consists of an integer 'n' that
 * corresponds to number of mobile phone items purchased in the previous month.
 * The next 'n' inputs consists of an integer that corresponds to model Id of
 * each mobile phone item.
 * 
 * Output Format : Output should print the model Id of the frequently purchased
 * mobile phone item. If more than one model id item is purchased same number of
 * time, display the greatest value of model id. If no model has been purchased
 * more than once, then print "There is no frequently purchased item". Please
 * refer sample input and output for formatting specifications.
 * 
 * Sample Input and Output 1: Enter the number of items 5 Enter the item id
 * details 1 2 3 1 2 Frequently purchased item is : 2
 * 
 * Sample Input and Output 2: Enter the number of items 5 Enter the item id
 * details 1 2 3 65 5 There is no frequently purchased item
 * 
 */

public class FrequentlyPurchasedItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items");
        int input = sc.nextInt();
        int arrId[] = new int[input];

        System.out.println("Enter the item id details");

        for (int i = 0; i < input; i++) {
            arrId[i] = sc.nextInt();
        }

        int duplicateArr[] = checkDuplicate(arrId);
        String result = "There is no frequently purchased item ";
        int lastVal = -0;

        if (duplicateArr.length > 0) {
            for (int i = 0; i < (duplicateArr.length - 1); i++) {
                if (i > 1) {
                    result = "Frequently purchased item is : " + arrId[duplicateArr[i] - 1];
                    if (arrId[duplicateArr[i] - 1] > lastVal) {
                        result = "Frequently purchased item is : " + arrId[duplicateArr[i] - 1];
                        lastVal = arrId[duplicateArr[i]];
                    }
                } else {
                    result = "Frequently purchased item is : " + arrId[duplicateArr[i] - 1];
                }
            }
        }
        System.out.println(result);
        sc.close();

    }

    public static int[] checkDuplicate(int arr[]) {
        int duplicate[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == (arr[j])) {
                    duplicate[count] = i + 1;
                    duplicate[count + 1] = j + 1;
                    count += 2;
                }
            }
        }
        return removeZeros(duplicate);
    }

    public static int[] removeZeros(int[] test) {
        int length = 0;
        for (int i = 0; i < test.length; i++) {
            if (test[i] != 0)
                length++;
        }
        int[] intResult = new int[length];
        for (int i = 0, j = 0; i < test.length; i++) {
            if (test[i] != 0) {
                intResult[j] = test[i];
                j++;
            }
        }
        return intResult;

    }
}