package com.devopsJC.maven;
import org.slf4j.*;

public class exampleAction {
        final Logger logger =
            LoggerFactory.getLogger(exampleAction.class);
        public boolean execute() {
            logger.info( "Example action executed" );
            return true;
         }
    }

