public class Recursion {
void countDown(int number){
    System.out.println(number);
    --number;
    countDown(number);

}

    public static void main(String[] args) {
     Recursion recursion=new Recursion();

    }
}
