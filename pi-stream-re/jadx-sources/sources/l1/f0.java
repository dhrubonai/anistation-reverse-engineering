package l1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Trace;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f0 {
    public static /* bridge */ /* synthetic */ Drawable b(EditText editText) {
        return editText.getTextCursorDrawable();
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(int i10, int i11, int i12) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, i12);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ Uri g() {
        return MediaStore.Downloads.EXTERNAL_CONTENT_URI;
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ void u(ViewGroup viewGroup, boolean z9) {
        viewGroup.suppressLayout(z9);
    }

    public static /* bridge */ /* synthetic */ void v(CoordinatorLayout coordinatorLayout, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray) {
        coordinatorLayout.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, R.attr.coordinatorLayoutStyle, 0);
    }

    public static /* bridge */ /* synthetic */ boolean w() {
        return Trace.isEnabled();
    }
}
