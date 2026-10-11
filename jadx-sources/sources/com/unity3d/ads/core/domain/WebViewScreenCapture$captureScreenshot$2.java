package com.unity3d.ads.core.domain;

import android.graphics.Bitmap;
import defpackage.ic2;
import defpackage.io3;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.WebViewScreenCapture$captureScreenshot$2", f = "WebViewScreenCapture.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebViewScreenCapture$captureScreenshot$2 extends t36 implements ic2 {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ String $id;
    final /* synthetic */ boolean $isPng;
    final /* synthetic */ int $quality;
    final /* synthetic */ double $samplingRate;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WebViewScreenCapture this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewScreenCapture$captureScreenshot$2(double d, Bitmap bitmap, boolean z, int i, WebViewScreenCapture webViewScreenCapture, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.$samplingRate = d;
        this.$bitmap = bitmap;
        this.$isPng = z;
        this.$quality = i;
        this.this$0 = webViewScreenCapture;
        this.$id = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        WebViewScreenCapture$captureScreenshot$2 webViewScreenCapture$captureScreenshot$2 = new WebViewScreenCapture$captureScreenshot$2(this.$samplingRate, this.$bitmap, this.$isPng, this.$quality, this.this$0, this.$id, vz0Var);
        webViewScreenCapture$captureScreenshot$2.L$0 = obj;
        return webViewScreenCapture$captureScreenshot$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((WebViewScreenCapture$captureScreenshot$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Bitmap createScaledBitmap;
        AndroidScreenshotUploader androidScreenshotUploader;
        String str;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                double d = this.$samplingRate;
                Bitmap bitmap = this.$bitmap;
                boolean z = this.$isPng;
                int i2 = this.$quality;
                WebViewScreenCapture webViewScreenCapture = this.this$0;
                String str2 = this.$id;
                if (d >= 1.0d) {
                    createScaledBitmap = bitmap;
                } else {
                    int g0 = io3.g0(bitmap.getWidth() * d);
                    if (g0 < 1) {
                        g0 = 1;
                    }
                    int g02 = io3.g0(bitmap.getHeight() * d);
                    if (g02 < 1) {
                        g02 = 1;
                    }
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, g0, g02, true);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (z) {
                    createScaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                } else {
                    createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                }
                if (createScaledBitmap != bitmap) {
                    createScaledBitmap.recycle();
                }
                androidScreenshotUploader = webViewScreenCapture.uploader;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                if (z) {
                    str = "image/png";
                } else {
                    str = "image/jpeg";
                }
                this.label = 1;
                Object invoke = androidScreenshotUploader.invoke(str2, byteArray, str, this);
                w11 w11Var = w11.x;
                if (invoke == w11Var) {
                    return w11Var;
                }
            }
        } catch (Throwable unused) {
        }
        return pn6.a;
    }
}
