/*
 * Copyright 2015-2019 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

module org.junit.vintage.engine {
	requires transitive org.junit.platform.engine;
	requires transitive junit; // 4

	provides org.junit.platform.engine.TestEngine
			with org.junit.vintage.engine.VintageTestEngine;
}