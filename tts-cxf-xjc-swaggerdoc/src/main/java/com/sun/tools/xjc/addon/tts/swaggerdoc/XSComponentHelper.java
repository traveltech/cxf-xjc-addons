/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.sun.tools.xjc.addon.tts.swaggerdoc;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BindInfo;
import com.sun.xml.xsom.XSAnnotation;
import com.sun.xml.xsom.XSComponent;

public final class XSComponentHelper {

    private XSComponentHelper() {
        // no constructor for utility class
    }

    public static String getDocumentation(XSComponent schemaComponent) {
        if (schemaComponent == null) {
            return null;
        }
        XSAnnotation xsAnnotation = schemaComponent.getAnnotation();
        if (xsAnnotation == null) {
            return null;
        }
        BindInfo annotation = (BindInfo) xsAnnotation.getAnnotation();
        if (annotation == null) {
            return null;
        }
        return annotation.getDocumentation();
    }

}
