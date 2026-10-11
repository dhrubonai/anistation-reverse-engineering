package com.unity3d.ads.core.domain;

import android.graphics.Bitmap;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.WebViewScreenCapture$getBlackPixelPercentage$2", f = "WebViewScreenCapture.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebViewScreenCapture$getBlackPixelPercentage$2 extends t36 implements ic2 {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ int $threshold;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewScreenCapture$getBlackPixelPercentage$2(Bitmap bitmap, int i, vz0 vz0Var) {
        super(2, vz0Var);
        this.$bitmap = bitmap;
        this.$threshold = i;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new WebViewScreenCapture$getBlackPixelPercentage$2(this.$bitmap, this.$threshold, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((WebViewScreenCapture$getBlackPixelPercentage$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            int width = this.$bitmap.getWidth();
            int height = this.$bitmap.getHeight();
            if (width > 0 && height > 0) {
                int[] iArr = new int[width * height];
                this.$bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                return new Double(WebViewScreenCaptureKt.countBlackPixelRatio(iArr, this.$threshold));
            }
            return new Double(0.0d);
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
