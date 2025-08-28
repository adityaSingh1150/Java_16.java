
public class myexception {
    public static void main(String[] args){
        userdefinedException udf=new userdefinedException();
        try{
            udf.validate(12);
            udf.validate(19);
        }catch(invalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
