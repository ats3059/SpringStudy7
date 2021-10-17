package hello.login.test;

public class ExceptionTest {

    static class Error{

        void errorTest() throws Exception{
            try{
                
                throw new Exception("12341234");

            }catch (Exception e){
                System.out.println("abcdefg?");
                throw e;
            }
        }
    }



    public static void main(String[] args) {
        Error error = new Error();
        try{
            error.errorTest();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
