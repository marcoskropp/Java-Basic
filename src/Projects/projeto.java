package Projects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class projeto {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date y1 = sdf1.parse("30/09/2018");
		Date y2 = sdf2.parse("30/09/2018 17:57:00");
		Date y3 = Date.from(Instant.parse("2018-09-30T18:09:07Z"));

		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);

		System.out.println("y1: " + y1 + "\ny2: " + y2 + "\ny3: " + y3 + "\nx1: " + x1 + "\nx2: " + x2 + "\nx3: " + x3
				+ "\nx4: " + x4);
		System.out.println("---------------------------------");
		System.out.println("y1: " + sdf2.format(y1) + "\ny2: " + sdf2.format(y2) + "\ny3: " + sdf2.format(y3) + "\nx1: "
				+ sdf2.format(x1) + "\nx2: " + sdf2.format(x2) + "\nx3: " + sdf2.format(x3) + "\nx4: "
				+ sdf2.format(x4));
		System.out.println("---------------------------------");
		System.out.println("y1: " + sdf3.format(y1) + "\ny2: " + sdf3.format(y2) + "\ny3: " + sdf3.format(y3) + "\nx1: "
				+ sdf3.format(x1) + "\nx2: " + sdf3.format(x2) + "\nx3: " + sdf3.format(x3) + "\nx4: "
				+ sdf3.format(x4));
	}

}
