import java.util.Arrays;

public class Array {
    
    public static int countPositiveGrades(int[] grades) {
        int count = 0;
        for (int grade : grades) {
            if (grade >= 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static int maxValue(int[] grades) {
        int max = Integer.MIN_VALUE;
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public static int maxValue(int[] grades, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || secondIndex < 0 || firstIndex >= grades.length || secondIndex >= grades.length || secondIndex < firstIndex) {
            return -666;
        }

        int max = Integer.MIN_VALUE;
        for (int i = firstIndex; i <= secondIndex; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public static int minGrade(int[] grades) {
        int min = Integer.MAX_VALUE;
        for (int grade : grades) {
            if (grade < min && grade > 0) {
                min = grade;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }

    public static int minValue(int[] grades) {
        int min = Integer.MAX_VALUE;
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public static int minValue(int[] grades, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || secondIndex < 0 || firstIndex >= grades.length || secondIndex >= grades.length || secondIndex < firstIndex) {
            return -666;
        }

        int min = grades[firstIndex];
        for (int i = firstIndex; i <= secondIndex; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static int sum(int[] arr, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || secondIndex < 0 || firstIndex >= arr.length || secondIndex >= arr.length || secondIndex < firstIndex) {
            return -666;
        }

        int sum = 0;
        for (int i = firstIndex; i <= secondIndex; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {
        double sum = sum(arr);
        return sum / arr.length;
    }

    public static double average(int[] arr, int first, int second) {
        if (first < 0 || second < 0 || first > arr.length - 1 || second > arr.length - 1) {
            return -666.0;
        }

        int[] subArray = Arrays.copyOfRange(arr, first, second + 1);
        double sum = sum(subArray);
        return sum / subArray.length;
    }

    public static int indexOfFirstMaxValue(int[] arr) {
        int max = maxValue(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfFirstMaxValue(int[] arr, int first, int second) {
        if (first < 0 || second < 0 || first > arr.length - 1 || second >= arr.length - 1) {
            return -1;
        }

        int[] subArray = Arrays.copyOfRange(arr, first, second + 1);
        int max = maxValue(subArray);
        for (int i = first; i <= second; i++) {
            if (arr[i] == max) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfFirstMinValue(int[] arr) {
        int min = minValue(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                return i;
            }
        }
        return -1;
    }

    public static int numberOfBelowAverageElements(int[] arr) {
        double average = average(arr);
        int count = 0;
        for (int value : arr) {
            if (value < average) {
                count++;
            }
        }
        return count;
    }

    public static int numberOfBelowAverageElements(int[] arr, int first, int last) {
        if (first < 0 || last < 0 || first > arr.length - 1 || last >= arr.length) {
            return -666;
        }

        int[] subArray = Arrays.copyOfRange(arr, first, last + 1);
        double average = average(subArray);
        int count = 0;
        for (int value : subArray) {
            if (value < average) {
                count++;
            }
        }
        return count;
    }

    public static int numberOfAboveAverageElements(int[] arr) {
        double average = average(arr);
        int count = 0;
        for (int value : arr) {
            if (value > average) {
                count++;
            }
        }
        return count;
    }

    public static void rotateElements(int[] arr) {
        int temp = arr[arr.length - 1];
        System.arraycopy(arr, 0, arr, 1, arr.length - 1);
        arr[0] = temp;
    }

    public static void rotateElements(int[] arr, int rotationCount) {
        int[] tempArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int newPosition = (i + rotationCount) % arr.length;
            tempArray[newPosition] = arr[i];
        }
        System.arraycopy(tempArray, 0, arr, 0, arr.length);
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
    }
}
