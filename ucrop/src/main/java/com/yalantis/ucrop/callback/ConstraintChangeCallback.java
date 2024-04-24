package com.yalantis.ucrop.callback;

import android.graphics.RectF;

public interface ConstraintChangeCallback {
    void onConstraintsChange(float[] matrix, float[] currentImageCorners, RectF cropRect, float currentScale);
}
