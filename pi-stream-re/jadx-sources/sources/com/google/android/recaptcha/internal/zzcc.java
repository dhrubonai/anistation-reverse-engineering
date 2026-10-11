package com.google.android.recaptcha.internal;

import a7.a;
import android.webkit.WebView;
import b7.h;
import h7.p;
import java.util.ArrayList;
import p7.y;
import r6.h0;
import w6.f;
import x6.m;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcc extends h implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzcd zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcc(String[] strArr, zzcd zzcdVar, String str, e eVar) {
        super(eVar);
        this.zza = strArr;
        this.zzb = zzcdVar;
        this.zzc = str;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzcc(this.zza, this.zzb, this.zzc, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.f156a;
        h0.V0(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzcd zzcdVar = this.zzb;
        String str2 = this.zzc;
        webView = zzcdVar.zza;
        webView.evaluateJavascript(str2 + "(" + m.r0(arrayList, ",", null, null, null, 62) + ")", null);
        return f.f11019a;
    }
}
