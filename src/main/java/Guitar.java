public class Guitar implements Tune{
    private  Tune tune;



    public void play(){
        for (int plaing = 0; plaing < 6; plaing++){
            System.out.println(strings[plaing]);
        }
    }
}
