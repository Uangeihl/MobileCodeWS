
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class PhoneClient {

    public static void main(String[] args) {

        MobileCodeWS mc = new MobileCodeWS();

        MobileCodeWSSoap mcss = mc.getMobileCodeWSSoap();

        System.out.println(mcss.getMobileCodeInfo("15552597890", null));
    }
}
