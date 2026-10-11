package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.unity3d.ads.core.data.datasource.CurrentActivityDataSource;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pg0;
import defpackage.pn6;
import defpackage.qg0;
import defpackage.qx1;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.wc7;
import defpackage.y45;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidViewCapturer$invoke$2", f = "AndroidViewCapturer.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidViewCapturer$invoke$2 extends t36 implements ic2 {
    final /* synthetic */ View $view;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AndroidViewCapturer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewCapturer$invoke$2(AndroidViewCapturer androidViewCapturer, View view, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidViewCapturer;
        this.$view = view;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidViewCapturer$invoke$2(this.this$0, this.$view, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidViewCapturer$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        CurrentActivityDataSource currentActivityDataSource;
        Activity activity;
        Window window;
        Activity activity2;
        Activity currentActivity;
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 == 1) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        i = this.this$0.sdkInt;
        if (i < 26) {
            i2 = this.this$0.sdkInt;
            throw new IllegalStateException(("Screen capture requires API 26+ (got " + i2 + ')').toString());
        }
        int width = this.$view.getWidth();
        int height = this.$view.getHeight();
        if (width > 0 && height > 0) {
            currentActivityDataSource = this.this$0.currentActivityDataSource;
            if (currentActivityDataSource == null || (currentActivity = currentActivityDataSource.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null) {
                activity = this.this$0.activity(this.$view);
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                if (window == null) {
                    AndroidViewCapturer androidViewCapturer = this.this$0;
                    View rootView = this.$view.getRootView();
                    rootView.getClass();
                    activity2 = androidViewCapturer.activity(rootView);
                    if (activity2 != null) {
                        window = activity2.getWindow();
                    } else {
                        window = null;
                    }
                    if (window == null) {
                        Activity activity3 = ClientProperties.getActivity();
                        if (activity3 != null) {
                            window = activity3.getWindow();
                        } else {
                            window = null;
                        }
                        if (window == null) {
                            ze0.m("No window available to capture the ad view");
                            return null;
                        }
                    }
                }
            }
            int[] iArr = new int[2];
            this.$view.getLocationInWindow(iArr);
            int i4 = iArr[0];
            int i5 = iArr[1];
            Rect rect = new Rect(i4, i5, i4 + width, i5 + height);
            final Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.L$0 = window;
            this.L$1 = rect;
            this.L$2 = createBitmap;
            this.label = 1;
            final qg0 qg0Var = new qg0(1, wc7.z(this));
            qg0Var.t();
            PixelCopy.request(window, rect, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.unity3d.ads.core.domain.AndroidViewCapturer$invoke$2$2$1
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i6) {
                    pg0 pg0Var = pg0.this;
                    if (i6 == 0) {
                        pg0Var.resumeWith(createBitmap);
                    } else {
                        pg0Var.resumeWith(new y45(new IllegalStateException(qx1.h(i6, "PixelCopy failed with result "))));
                    }
                }
            }, new Handler(Looper.getMainLooper()));
            Object r = qg0Var.r();
            w11 w11Var = w11.x;
            if (r == w11Var) {
                return w11Var;
            }
            return r;
        }
        throw new IllegalStateException(("Target view not laid out yet (" + width + 'x' + height + ')').toString());
    }
}
