package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import com.unity3d.ads.core.data.datasource.CurrentActivityDataSource;
import defpackage.n11;
import defpackage.q71;
import defpackage.tl7;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidViewCapturer {
    private final CurrentActivityDataSource currentActivityDataSource;
    private final n11 mainDispatcher;
    private final int sdkInt;

    public /* synthetic */ AndroidViewCapturer(n11 n11Var, CurrentActivityDataSource currentActivityDataSource, int i, int i2, q71 q71Var) {
        this(n11Var, (i2 & 2) != 0 ? null : currentActivityDataSource, (i2 & 4) != 0 ? Build.VERSION.SDK_INT : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity activity(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public final Object invoke(View view, vz0 vz0Var) {
        return tl7.V(this.mainDispatcher, new AndroidViewCapturer$invoke$2(this, view, null), vz0Var);
    }

    public AndroidViewCapturer(n11 n11Var, CurrentActivityDataSource currentActivityDataSource, int i) {
        n11Var.getClass();
        this.mainDispatcher = n11Var;
        this.currentActivityDataSource = currentActivityDataSource;
        this.sdkInt = i;
    }
}
