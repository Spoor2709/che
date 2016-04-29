/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.plugin.java.plain.server.projecttype;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.eclipse.che.api.project.server.type.ProjectTypeDef;

import static org.eclipse.che.ide.ext.java.shared.Constants.JAVA_ID;
import static org.eclipse.che.ide.ext.java.shared.Constants.OUTPUT_FOLDER;
import static org.eclipse.che.ide.ext.java.shared.Constants.SOURCE_FOLDER;
import static org.eclipse.che.plugin.java.plain.shared.PlainJavaProjectConstants.PLAIN_JAVA_PROJECT_ID;
import static org.eclipse.che.plugin.java.plain.shared.PlainJavaProjectConstants.PLAIN_JAVA_PROJECT_NAME;

/**
 * Project type for plain java projects.
 *
 * @author Valeriy Svydenko
 */
@Singleton
public class PlainJavaProjectType extends ProjectTypeDef {
    @Inject
    public PlainJavaProjectType(PlainJavaValueProviderFactory valueProviderFactory) {
        super(PLAIN_JAVA_PROJECT_ID, PLAIN_JAVA_PROJECT_NAME, true, false, true);

        setValueProviderFactory(SOURCE_FOLDER, valueProviderFactory);
        setValueProviderFactory(OUTPUT_FOLDER, valueProviderFactory);

        addParent(JAVA_ID);
    }
}
