import java.util.NoSuchElementException;

public class PriorityQueue {
    Person[] heap;
    int heapSize;
    int maxSize;

    public PriorityQueue(int capacity) {
        heapSize = 0;
        this.maxSize = capacity + 1;
        heap = new Person[maxSize];
    }

    public void enQueue(Person key) {
        if (heapSize == maxSize) {
            throw new NoSuchElementException("Overflow Exception");
        }
        heapSize += 1;
        heap[heapSize] = key;

        shiftUp(heapSize);
    }

    public Person deQueue() {
        if (heapSize == 0) {
            throw new NoSuchElementException("Underflow Exception");
        }
        Person max = heap[1];
        heap[1] = heap[heapSize];
        heapSize -= 1;
        shiftDown(1);
        return max;
    }

    private void shiftUp(int i) {
        while (i > 1 && heap[parent(i)].compareTo(heap[i]) < 0) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    private void shiftDown(int i) {
        while (i <= heapSize) {
            Person max = heap[i];
            int max_id = i;

            if (left(i) <= heapSize && max.compareTo(heap[left(i)]) < 0) {
                max = heap[left(i)];
                max_id = left(i);
            }
            if (right(i) <= heapSize && max.compareTo(heap[right(i)]) < 0) {
                max = heap[right(i)];
                max_id = right(i);
            }
            if (max_id != i) {
                swap(max_id, i);
                i = max_id;
            } else
                break;
        }
    }

    private int parent(int i) {
        return i / 2;
    }

    private int left(int i) {
        return 2 * i;
    }

    private int right(int i) {
        return 2 * i + 1;
    }

    private void swap(int i, int j) {
        Person temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void buildHeapFast(Person[] a) {
        this.heap = new Person[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            this.heap[i + 1] = a[i];
        }

        this.heapSize = a.length;

        for (int i = this.heapSize / 2; i >= 1; i--) {
            shiftDown(i);
        }
    }
}