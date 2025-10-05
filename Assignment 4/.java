public class Main {
    public static void main(String[] args) throws Exception {
    
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,93,17,10,2,87,267,3176,3,82};
       //Duplicate Detection
       boolean[] visited = new boolean[myArray.length]; //track numbers that have been counted
        for (int i = 0; i < myArray.length; i++){
            if (visited[i]){
                continue;
            }
            int count = 1; // least once
        for (int j = i + 1; j < myArray.length; j++){ // "J = i +1" ensures we are not comparing the same element
            if (myArray[i] == myArray[j]){
                count++;
                visited[j] = true; // Already counted
            }
        }
        if (count > 1){
            System.out.println(myArray[i] + " occurs " + count + " times.");
        }

        //I learned how to manually count occurrences in an array using nested loops. It showed me how to track visited elements

    



       }
    }
}

