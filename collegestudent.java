public class collegestudent extends student {
    public int roll_no;

    public collegestudent(String address, int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }
    public void show_roll(){
        System.out.println("Roll no is "+roll_no);
    }

    public static void main(String[] args) {
        collegestudent cs=new collegestudent("123",10);
        cs.show_roll();
    }
}
