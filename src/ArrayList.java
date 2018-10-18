public class ArrayList {


        private int size;
        private int[] arr;

        public ArrayList() {
            size = 0;
            arr = new int[1];

        }

        public void add(int value){
            makeRoom();
            arr[size] = value;
            size++;
        }

        private void makeRoom() {
            if(size == arr.length){
                int[] temp = new int[size*2];
                for (int i = 0; i < size; i++) {
                    temp[i] = arr[i];
                }
                arr = temp;
            }
        }

        public void add(int value, int index){
            makeRoom();
            size++;
            SplitAndMovefarward(index);
            arr[index]=value;



        }
        public void remove(int index){
                if(index<=size&&index>=0) {
                    this.arr[index] = 0;
                    splitAndMoveBack(index);
                }
                size--;

            }

        public int get(int index){
            if(index<=size-1) {
                return this.arr[index];
            }
            return -1;
        }
        public void set(int value, int index){
            this.arr[index]=value;
        }
        public int size(){
            return size;
        }
        public int indexOf(int value){
            for (int i=0;i<size-1;i++){
                if (arr[i]==value){
                    return i;
                }
            }
            return -1;
        }
        public void clear(){

            size=0;
            arr = new int[1];
        }
        public int[] toArray(){
            int temp[]= new int[size];
            for(int i=0;i<size;i++){
                temp[i]=arr[i];
            }
            return temp;
        }
        private void splitAndMoveBack(int moveFromIndex){
            int temp;
            for (int i=moveFromIndex;i<size-1;i++){
                temp=arr[i+1];
                arr[i+1]=this.arr[i];
                arr[i]=temp;
            }
        }
        private void SplitAndMovefarward(int moveFromIndex){
            int temp;
            for (int i=size-1;i>moveFromIndex;i--){
                temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        public void printArray(){
            for (int i=0;i<size;i++){
                System.out.print(arr[i]+",");
            }
            System.out.println();
        }
    }

