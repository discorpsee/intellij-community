/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.jetbrains.plugins.groovy.dsl.psi;

import com.intellij.psi.*;
import org.jetbrains.annotations.Nullable;

/**
 * @author ilyas
 */
public class PsiMethodCategory implements PsiEnhancerCategory {

  @Nullable
  public static PsiClass getClassType(PsiField field) {
    final PsiType type = field.getType();
    return PsiCategoryUtil.getClassType(type, field);
  }

  public static boolean hasAnnotation(PsiMember member, String fqn) {
    final PsiModifierList list = member.getModifierList();
    if (list == null) return false;
    for (PsiAnnotation annotation : list.getAnnotations()) {
      if (fqn.equals(annotation.getQualifiedName())) return true;
    }
    return false;
  }

}
