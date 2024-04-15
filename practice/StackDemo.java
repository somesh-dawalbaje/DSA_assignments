class StackDemo{
    int top;
    int size;
    int arr[];

    StackDemo(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("full");
            return;
        }

        arr[++top]=x;
    }

    public boolean isFull(){
        return (top==size-1);
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
        }

        return arr[top--];
    }

    public int peek()throws Exception{
        if(isEmpty()){
           throw new Exception("stack is empty");
        }

        return arr[top];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)throws Exception {
        StackDemo st=new StackDemo(4);
        st.push(45);
        st.push(88);
        st.push(52);
        st.display();
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}