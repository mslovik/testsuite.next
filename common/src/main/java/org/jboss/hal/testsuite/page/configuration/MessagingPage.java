/*
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.hal.testsuite.page.configuration;

import org.jboss.hal.meta.token.NameTokens;
import org.jboss.hal.resources.Ids;
import org.jboss.hal.testsuite.fragment.FormFragment;
import org.jboss.hal.testsuite.fragment.TableFragment;
import org.jboss.hal.testsuite.page.BasePage;
import org.jboss.hal.testsuite.page.Place;
import org.openqa.selenium.support.FindBy;

import static org.jboss.hal.resources.Ids.TABLE;
import static org.jboss.hal.testsuite.Selectors.WRAPPER;

@Place(NameTokens.MESSAGING)
public class MessagingPage extends BasePage {

    @FindBy(id = Ids.MESSAGING_GLOBAL_SETTINGS + "-" + Ids.FORM) private FormFragment configurationForm;

    // ----------- stack
    @FindBy(id = Ids.JGROUPS_STACK_CONFIG + "-" + TABLE + WRAPPER) private TableFragment stackTable;
    @FindBy(id = Ids.JGROUPS_STACK_CONFIG + "-" + Ids.FORM) private FormFragment stackForm;

    public FormFragment getConfigurationForm() {
        return configurationForm;
    }


}