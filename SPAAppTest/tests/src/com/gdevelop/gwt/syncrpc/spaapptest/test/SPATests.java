/*
 * Copyright 2013 Blue Esoteric Web Development, LLC (http://www.blueesoteric.com/)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.gdevelop.gwt.syncrpc.spaapptest.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.gdevelop.gwt.syncrpc.spaapptest.test.gwttests.SPAGWTTests;

/**
 * @author Preethum
 * @since 0.5
 *
 */
public class SPATests extends TestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("SyncProxy Android App Tests");
		suite.addTest(SPAGWTTests.suite());
		suite.addTest(AndroidCustomServiceTests.suite());
		return suite;
	}

	public static int WAIT_TIME_SERVICE_INIT = 50;
	public static int WAIT_TIME_DEBUG = 300;
	public static int WAIT_TIME_SHORT = 2;
	public static int WAIT_TIME_MEDIUM = 20;
	public static int WAIT_TIME_LONG = 120;
}
