/*
 * Sonar F# Plugin :: Core
 * Copyright (C) 2015 Jorge Costa and SonarSource
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
package org.sonar.plugins.fsharp.fxcop;

public class FxCopConfiguration {

  private final String languageKey;
  private final String repositoryKey;

  public FxCopConfiguration(String languageKey, String repositoryKey) {
    this.languageKey = languageKey;
    this.repositoryKey = repositoryKey;
  }

  public String languageKey() {
    return languageKey;
  }

  public String repositoryKey() {
    return repositoryKey;
  } 
}
