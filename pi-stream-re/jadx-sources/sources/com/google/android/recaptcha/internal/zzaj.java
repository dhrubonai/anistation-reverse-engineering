package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import b7.h;
import h7.p;
import p7.y;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaj extends h implements p {
    Object zza;
    int zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ zzab zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzbq zzf;
    final /* synthetic */ zzbd zzg;
    final /* synthetic */ zzbg zzh;
    final /* synthetic */ long zzi;
    final /* synthetic */ zzt zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(Application application, zzab zzabVar, String str, zzbq zzbqVar, zzbd zzbdVar, zzt zztVar, WebView webView, zzbg zzbgVar, long j4, e eVar) {
        super(eVar);
        this.zzc = application;
        this.zzd = zzabVar;
        this.zze = str;
        this.zzf = zzbqVar;
        this.zzg = zzbdVar;
        this.zzj = zztVar;
        this.zzh = zzbgVar;
        this.zzi = j4;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzaj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzj, null, this.zzh, this.zzi, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r6 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r2 != r1) goto L11;
     */
    @Override // b7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
