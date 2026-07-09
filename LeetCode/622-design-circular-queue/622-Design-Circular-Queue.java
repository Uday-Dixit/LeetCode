class MyCircularQueue {
    int[] arr;
    int size;
    int front = -1;
    int rear = -1;
    public MyCircularQueue(int k) {
        arr = new int[k];
        this.size=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false; 
        }
        if(isEmpty()){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear%size]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        if(rear==front){
            rear = front = -1;
            return true;
        }

        front=(front+1)%size;
        return true;
    }
    
    public int Front() {
        return isEmpty()?-1:arr[front];
    }
    
    public int Rear() {
        return isEmpty()?-1:arr[rear];
    }
    
    public boolean isEmpty() {
        return front==-1 && rear==-1;
    }
    
    public boolean isFull() {
        return (rear+1)%size == front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */