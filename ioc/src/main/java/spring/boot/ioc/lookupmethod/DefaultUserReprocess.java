package spring.boot.ioc.lookupmethod;

/**
 * Created by pankaj on 10/26/2017.
 */
public class DefaultUserReprocess extends UserReProcess{

    @Override
    public boolean inMyJohndeere(User user) {
        System.out.println("DefaultUserReprocess.inMyJohndeere");
        return false;
    }
}
