/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.graalvm.scripting;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.netbeans.api.scripting.Scripting;

public final class GraalEnginesTest {
    @BeforeClass
    public static void skipIfNoPolyglotFound() {
        try {
            Class.forName("org.graalvm.polyglot.Engine").getMethod("create").invoke(null);
        } catch (ClassNotFoundException ex) {
            Assume.assumeNoException("Skip if no Engine is found", ex);
        } catch (ReflectiveOperationException ex) {
            Assume.assumeNoException("Error when initializing Engine", ex);
        }
    }

    @Test
    public void invokeEngineViaGeneratedScriptEngine() {
        ScriptEngineManager man = Scripting.createManager();
        ScriptEngine llvm = man.getEngineByName("llvm");
        assertNotNull("llvm engine found: " + man.getEngineFactories(), llvm);
        fail("factories: " + man.getEngineFactories());
    }
}
