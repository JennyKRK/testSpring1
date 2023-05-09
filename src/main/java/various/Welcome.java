package various;

public class Welcome {
    private IGreetMe iGreetMe;
    public Welcome(){};
    public IGreetMe getiGreetMe() {
        return iGreetMe;
    }
    public void setiGreetMe(IGreetMe iGreetMe) {
        this.iGreetMe = iGreetMe;
    }

    public void run(){
        iGreetMe.GreetMe();
    }
}
