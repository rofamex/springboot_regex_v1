package com.rofamex.regex.route;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MainRoute {
	private static final Logger LOG = LoggerFactory.getLogger(MainRoute.class);

	String email;
	Boolean isValidEmail;

	public MainRoute() {
		emailRegex();
	}

	private void emailRegex() {
		LOG.info("-------------------------- LOG START LOG ---------------------------");

		email = "^WWW.EVA874.COM@GMAIL.COM";
		LOG.info("email {}, is a valid email? = {}", email, isValidEmail(email));

		email = "robson.lee5@apoioprodesp.sp.gov.br";
		LOG.info("email {}, is a valid email? = {}", email, isValidEmail(email));

		email = "suelen4@x-cell.com.br";
		LOG.info("email {}, is a valid email? = {}", email, isValidEmail(email));

		email = "LUCIELEALVES13@GMAIL.COM";
		LOG.info("email {}, is a valid email? = {}", email, isValidEmail(email));

		email = "roberto.f.silva5@itau-unibanco.com.br";
		LOG.info("email {}, is a valid email? = {}", email, isValidEmail(email));

		email = "ADM.ULTRAPACK5@GMAIL.COM";
		LOG.info("email {}, is a valid email? = {}", email, isValidEmail(email));

		email = "WWW.EVA874.COM@GMAIL.COM";
		LOG.info("email {}, is a valid email? = {}", email, isValidEmail(email));

		LOG.info("-------------------------- LOG FINISH LOG --------------------------");
	}

	private boolean isValidEmail(String email) {
		email = email.toUpperCase().trim();
		Pattern pattern = Pattern.compile("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b");
		Matcher matcher = pattern.matcher(email.toUpperCase());
		return matcher.matches();
	}

}
