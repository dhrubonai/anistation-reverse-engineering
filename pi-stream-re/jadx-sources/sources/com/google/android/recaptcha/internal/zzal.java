package com.google.android.recaptcha.internal;

import a7.a;
import android.app.Application;
import android.os.Build;
import b7.h;
import h7.p;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import p7.y;
import r6.h0;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzal extends h implements p {
    final /* synthetic */ Application zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbd zzc;
    final /* synthetic */ zzbq zzd;
    final /* synthetic */ zzab zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(Application application, String str, zzbd zzbdVar, zzbq zzbqVar, zzab zzabVar, e eVar) {
        super(eVar);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbdVar;
        this.zzd = zzbqVar;
        this.zze = zzabVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f156a;
        h0.V0(obj);
        zzaf zzafVar = zzaf.zza;
        zzbd zzbdVar = this.zzc;
        Application application = this.zza;
        String zza = zzaf.zza(application);
        String packageName = application.getPackageName();
        String zzd = zzbdVar.zzd();
        zzq zzqVar = new zzq(application);
        int i10 = Build.VERSION.SDK_INT;
        String zza2 = zzqVar.zza("_GRECAPTCHA_KC");
        if (zza2 == null) {
            zza2 = "";
        }
        byte[] bytes = ("k=" + URLEncoder.encode(this.zzb, "UTF-8") + "&pk=" + URLEncoder.encode(packageName, "UTF-8") + "&mst=" + URLEncoder.encode(zza, "UTF-8") + "&msv=" + URLEncoder.encode("18.4.0", "UTF-8") + "&msi=" + URLEncoder.encode(zzd, "UTF-8") + "&mov=" + i10 + "&mkc=" + zza2).getBytes(Charset.forName("UTF-8"));
        return this.zzd.zza(this.zze.zzb(), bytes, this.zzc);
    }
}
