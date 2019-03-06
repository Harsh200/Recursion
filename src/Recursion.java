public class Recursion {
//void countDown(int number){
static void countDown(int number){
    if(number <=0){

    }
    System.out.println(number);
    --number;
    countDown(number);

}

    public static void main(String[] args) {
    // Recursion recursion=new Recursion();
        countDown(4);

    }
}
