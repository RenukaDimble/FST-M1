package activities;

public class Activity8 {

    public static void main(String[] args)
    {
        Activity8.exceptionTest("Will print to console");
        Activity8.exceptionTest(null);
    }
    static void exceptionTest(String a)
    {
        try{
            if(a==null)
                throw new CustomExcepytion("string is null");
        }
        catch(CustomExcepytion c)
        {
            System.out.println("inside catch block" + c);;
        }
        finally {
            System.out.println("message is" + a);;
        }

    }
}

class CustomExcepytion extends Exception
{
    private String message=null;
    CustomExcepytion(String message)
    {
        this.message=message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}

