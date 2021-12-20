public class Guitar implements Tuner {
    private  ReturnStrings returnStrings;

    public Guitar(ReturnStrings returnStrings){
        this.returnStrings = returnStrings;
    }

    public void play(){
        System.out.println(returnStrings.returnSting());;
    }
}
