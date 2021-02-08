import java.util.Arrays;

public class HanksSet {

    int[] hanksSet = new int[5];
    int index = 0;

    public int size() {
        return index;
    }

    public void add(int i) {
        if (hanksSet.length == index) {
//            int[] temp = new int[index*2];
//            System.arraycopy(hanksSet, 0,temp, 0,index);
            hanksSet = Arrays.copyOf(hanksSet, index*2);
//            hanksSet = temp;
        }

        for (int element : hanksSet) {
            if (element == i) {
                return;
            }
        }
        hanksSet[index] = i;
        index++;
    }

    //10, 20, 30, 40
    //10, 40, 30
    public void delete(int element) {
        for (int i = 0 ; i < size() ; i++) {
            if (hanksSet[i] == element) {
                hanksSet[i] = hanksSet[index];
                index--;
                return;
            }
        }
    }
}
