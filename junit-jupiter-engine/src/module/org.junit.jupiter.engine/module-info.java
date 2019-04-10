    
/*
 * Copyright 2015-2019 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

module org.junit.jupiter.engine {
	requires static java.scripting;
	requires transitive org.junit.jupiter.api;
	requires transitive org.junit.platform.engine;

	// exports org.junit.jupiter.engine; // Constants...

	provides org.junit.platform.engine.TestEngine
			with org.junit.jupiter.engine.JupiterTestEngine;
}
