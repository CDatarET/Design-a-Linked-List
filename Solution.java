class MyLinkedList {
    public ArrayList<Integer> list = new ArrayList<Integer>();

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index >= list.size()){
            return(-1);
        }
        else{
            return(list.get(index));
        }
    }
    
    public void addAtHead(int val) {
        list.add(0,val);
    }
    
    public void addAtTail(int val) {
        list.add(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > list.size()){
            //do nothing
        }
        else{
            list.add(index, val);
        }
    }
    
    public void deleteAtIndex(int index) {
        if(!(index >= list.size())){
            list.remove(index);
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
