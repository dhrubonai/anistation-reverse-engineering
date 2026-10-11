package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import r6.h0;

/* loaded from: classes.dex */
public final class zzbq {
    private final zzh zza;
    private final zzbg zzb;

    public zzbq(zzh zzhVar, zzbg zzbgVar) {
        this.zza = zzhVar;
        this.zzb = zzbgVar;
    }

    public final zzoe zza(String str, byte[] bArr, zzbd zzbdVar) {
        zzbb zza = zzbdVar.zza(zzne.VALIDATE_INPUT);
        zzbg.zzc(this.zzb, zza, null, 2, null);
        try {
            URLConnection openConnection = new URL(str).openConnection();
            h0.r(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
            try {
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(bArr);
                if (httpURLConnection.getResponseCode() == 200) {
                    try {
                        zzoe zzi = zzoe.zzi(httpURLConnection.getInputStream());
                        this.zzb.zza(zza);
                        return zzi;
                    } catch (Exception unused) {
                        throw new zzp(zzn.zzc, zzl.zzR, null);
                    }
                }
                if (httpURLConnection.getResponseCode() == 400) {
                    zzoz zzg = zzoz.zzg(httpURLConnection.getErrorStream());
                    zzo zzoVar = zzp.zza;
                    throw zzo.zza(zzg.zzi());
                }
                throw zzbr.zza(httpURLConnection.getResponseCode());
            } catch (Exception e10) {
                if (e10 instanceof zzp) {
                    throw ((zzp) e10);
                }
                throw new zzp(zzn.zze, zzl.zzQ, null);
            }
        } catch (zzp e11) {
            this.zzb.zzb(zza, e11, null);
            throw e11.zzc();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: Exception -> 0x013a, TRY_LEAVE, TryCatch #3 {Exception -> 0x013a, blocks: (B:3:0x0003, B:5:0x0015, B:11:0x004d, B:13:0x0058, B:19:0x0084, B:34:0x00cf, B:35:0x00d4, B:39:0x00ea, B:22:0x0103, B:23:0x0113, B:42:0x00f9, B:43:0x0102, B:45:0x0114, B:46:0x011d, B:47:0x011e, B:48:0x0127, B:50:0x0129, B:51:0x012e, B:52:0x012f, B:55:0x003c, B:56:0x002e, B:7:0x0020, B:9:0x0028, B:37:0x00da), top: B:2:0x0003, inners: #1, #2, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzb(com.google.android.recaptcha.internal.zzoe r12, com.google.android.recaptcha.internal.zzbd r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbq.zzb(com.google.android.recaptcha.internal.zzoe, com.google.android.recaptcha.internal.zzbd):java.lang.String");
    }
}
