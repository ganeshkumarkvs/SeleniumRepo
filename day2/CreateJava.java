package week2.day2;


		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class CreateJava {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.findElement(By.id("username")).sendKeys("demosalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Ganesh Enterprises");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ganesh");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kollapudi");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gkollapudi.kumar@gmail.com");//Element not interactable error
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("5555555555");
				driver.findElement(By.name("submitButton")).click();
				driver.close();
				
				
			}

		}
