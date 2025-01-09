 

import java.util.*;

public class BinSearch {
    int arr[], n;

    BinSearch(int nn) {
        n = nn;
        arr = new int[n];
    }

    void fillarray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a no");
            arr[i] = sc.nextInt();
        }
    }

    void sort() {
        int i, j, t;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    int bin_search(int l, int u, int v) {
        int m;
        if (l > v)
            return (-1);
        else {
            m = (l + u) / 2;
            if (v > arr[m])
                return (bin_search(m + 1, u, v));
            else if (v < arr[m])
                return (bin_search(l, m - 1, v));
            else
                return (m);
        }
    }

    public static void main(String[] args) {
        BinSearch obj = new BinSearch(10);
        obj.fillarray();
        obj.sort();
        int r = obj.bin_search(0, 9, 35);
        if (r == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at " + r);
    }
}
