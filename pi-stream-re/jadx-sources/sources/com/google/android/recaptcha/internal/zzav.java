package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import com.google.android.recaptcha.RecaptchaAction;
import h7.p;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import p7.y;
import r6.h0;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzav extends h implements p {
    final /* synthetic */ zzbd zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ zzog zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(zzbd zzbdVar, zzaw zzawVar, RecaptchaAction recaptchaAction, zzog zzogVar, e eVar) {
        super(eVar);
        this.zza = zzbdVar;
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = zzogVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzav(this.zza, this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzav) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        zzbg zzbgVar;
        zzoe zzoeVar;
        zzoe zzoeVar2;
        zzp zzpVar;
        zzbg zzbgVar2;
        zzab zzabVar;
        zzbg zzbgVar3;
        a aVar = a.f156a;
        h0.V0(obj);
        zzbb zza = this.zza.zza(zzne.FETCH_TOKEN);
        zzbgVar = this.zzb.zzi;
        zzbgVar.zze.put(zza, new zzbf(zza, zzbgVar.zza, new zzac()));
        zzob zzf = zzoc.zzf();
        zzaw zzawVar = this.zzb;
        zzf.zzr(zzawVar.zzg());
        zzf.zzd(this.zzc.getAction());
        zzoeVar = zzawVar.zzg;
        zzf.zzq(zzoeVar.zzI());
        zzoeVar2 = zzawVar.zzg;
        zzf.zzp(zzoeVar2.zzH());
        zzog zzogVar = this.zzd;
        zzf.zzt(zzogVar.zzH());
        zzf.zze(zzogVar.zzj());
        zzf.zzs(zzogVar.zzI());
        zzoc zzocVar = (zzoc) zzf.zzj();
        try {
            zzabVar = this.zzb.zzf;
            URLConnection openConnection = new URL(zzabVar.zzd()).openConnection();
            h0.r(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            try {
                httpURLConnection.connect();
                zzoi zzf2 = zzoj.zzf();
                zzf2.zzd(zzocVar.zzi());
                zzf2.zzq(zzocVar.zzk());
                zzf2.zzt(zzocVar.zzI());
                zzf2.zzp(zzocVar.zzH());
                zzf2.zzr(zzocVar.zzJ());
                zzf2.zzs(zzocVar.zzK());
                zzf2.zze(zzocVar.zzj());
                httpURLConnection.getOutputStream().write(((zzoj) zzf2.zzj()).zzd());
                if (httpURLConnection.getResponseCode() == 200) {
                    try {
                        zzol zzg = zzol.zzg(httpURLConnection.getInputStream());
                        zzbgVar3 = this.zzb.zzi;
                        zzbgVar3.zza(zza);
                        return zzg;
                    } catch (Exception unused) {
                        throw new zzp(zzn.zzc, zzl.zzR, null);
                    }
                }
                throw zzbr.zza(httpURLConnection.getResponseCode());
            } catch (Exception e10) {
                if (e10 instanceof zzp) {
                    throw ((zzp) e10);
                }
                throw new zzp(zzn.zze, zzl.zzQ, null);
            }
        } catch (Exception e11) {
            if (e11 instanceof zzp) {
                zzpVar = (zzp) e11;
            } else {
                zzpVar = new zzp(zzn.zzc, zzl.zzam, null);
            }
            zzbgVar2 = this.zzb.zzi;
            zzbgVar2.zzb(zza, zzpVar, null);
            throw zzpVar;
        }
    }
}
