/*
 * Sonar F# Plugin :: Core
 * Copyright (C) 2015 Jose Chillan, Alexandre Victoor and SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.fsharp;

import org.sonar.plugins.fsharp.FSharpPlugin;
import org.sonar.plugins.fsharp.FSharpCommonRulesDecorator;
import org.junit.Test;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.resources.ProjectFileSystem;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class FSharpCommonRulesDecoratorTest {

  @Test
  public void test_declaration() throws Exception {
    FSharpCommonRulesDecorator decorator = new FSharpCommonRulesDecorator(mock(ProjectFileSystem.class), mock(RulesProfile.class));
    assertThat(decorator.language()).isEqualTo(FSharpPlugin.LANGUAGE_KEY);
  }

}
