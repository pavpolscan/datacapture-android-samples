/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.scandit.datacapture.barcodecapturesettingssample.settings.barcodecapture.location.rectangular;

import com.scandit.datacapture.barcodecapturesettingssample.models.SettingsManager;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;

@SuppressWarnings("WeakerAccess")
public class LocationRectangularWidthMeasureUnitViewModel extends LocationRectangularViewModel {

    private final SettingsManager settingsManager = SettingsManager.getCurrentSettings();

    FloatWithUnit getCurrentWidth() {
        return settingsManager.getLocationSelectionRectangularWidth();
    }

    void updateWidthValue(float newValue) {
        settingsManager.setLocationSelectionRectangularWidth(
                new FloatWithUnit(newValue, getCurrentWidth().getUnit())
        );
        updateLocation();
    }

    void updateWidthMeasureUnit(MeasureUnit measureUnit) {
        settingsManager.setLocationSelectionRectangularWidth(
                new FloatWithUnit(getCurrentWidth().getValue(), measureUnit)
        );
        updateLocation();
    }
}
