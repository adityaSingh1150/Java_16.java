public class userdefinedException
{
    public void validate(int age) throws invalidAgeException
    {
        if(age<18){
            throw new invalidAgeException("NOT ELIGIBLE TO VOTE AGE LESS THAN 18");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
