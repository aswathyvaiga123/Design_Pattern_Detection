

public class ClassLoaderTest extends Assert {
	public ClassLoaderTest() {
	}
	public void verify() {
		verifyApplicationClassLoadedByTestLoader();
		verifySystemClassNotLoadedByTestLoader();
	}
	
	
}