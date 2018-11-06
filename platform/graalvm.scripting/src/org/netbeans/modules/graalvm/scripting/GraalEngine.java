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

import java.io.Reader;
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptException;

final class GraalEngine implements ScriptEngine {

    private final GraalEngineFactory factory;

    GraalEngine(GraalEngineFactory f) {
        this.factory = f;
    }

    @Override
    public Object eval(String arg0, ScriptContext arg1) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(Reader arg0, ScriptContext arg1) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(String arg0) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(Reader arg0) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(String arg0, Bindings arg1) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(Reader arg0, Bindings arg1) throws ScriptException {
        return null;
    }

    @Override
    public void put(String arg0, Object arg1) {
    }

    @Override
    public Object get(String arg0) {
        return null;
    }

    @Override
    public Bindings getBindings(int arg0) {
        return null;
    }

    @Override
    public void setBindings(Bindings arg0, int arg1) {
    }

    @Override
    public Bindings createBindings() {
        return null;
    }

    @Override
    public ScriptContext getContext() {
        return null;
    }

    @Override
    public void setContext(ScriptContext arg0) {
    }

    @Override
    public ScriptEngineFactory getFactory() {
        return null;
    }

}
