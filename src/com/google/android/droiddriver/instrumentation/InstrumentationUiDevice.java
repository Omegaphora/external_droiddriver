/*
 * Copyright (C) 2013 DroidDriver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.droiddriver.instrumentation;

import android.graphics.Bitmap;

import com.google.android.droiddriver.base.BaseUiDevice;

class InstrumentationUiDevice extends BaseUiDevice {
  private final InstrumentationContext context;

  InstrumentationUiDevice(InstrumentationContext context) {
    this.context = context;
  }

  @Override
  protected Bitmap takeScreenshot() {
    return context.getDriver().takeScreenshot();
  }

  @Override
  protected InstrumentationContext getContext() {
    return context;
  }
}