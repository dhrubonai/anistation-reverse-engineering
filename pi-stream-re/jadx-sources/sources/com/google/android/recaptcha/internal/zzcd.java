package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import p7.y;
import r6.h0;

/* loaded from: classes.dex */
public final class zzcd {
    private final WebView zza;
    private final y zzb;

    public zzcd(WebView webView, y yVar) {
        this.zza = webView;
        this.zzb = yVar;
    }

    public final void zzb(String str, String... strArr) {
        h0.k0(this.zzb, new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
