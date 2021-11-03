import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

public class FactoryMain {

	public static void main(String[] args) {
		
		OperatingSystemFactory ofs = new OperatingSystemFactory();
		OS obj = ofs.getInstance("");
		obj.spec();

	}

}
