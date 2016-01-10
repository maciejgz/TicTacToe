package pl.mg.ttt.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by m on 2016-01-10.
 */

/**
 * Klasa wymagana do inicjalizacji ustawień security w przypadku niezawierania konfiguracji w web.xml. bez tego konfiguracja aplikacyjna nie działa
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
}
