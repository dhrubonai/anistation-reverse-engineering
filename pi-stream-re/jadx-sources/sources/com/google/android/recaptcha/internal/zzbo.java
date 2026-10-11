package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import com.bumptech.glide.c;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import r6.h0;

/* loaded from: classes.dex */
public final class zzbo implements zzbn {
    private final String zza;

    public zzbo(String str) {
        this.zza = str;
    }

    private static final void zzb(byte[] bArr) {
        for (zznf zznfVar : zzni.zzk(bArr).zzH()) {
            if (c.M("INIT_TOTAL", "EXECUTE_TOTAL").contains(zznfVar.zzj().name()) && zznfVar.zzT()) {
                zznfVar.zzJ();
                zznfVar.zzK();
                zznfVar.zzj().name();
                zznfVar.zzg().zzk();
                zznfVar.zzg().zzf();
                zznfVar.zzU();
            } else {
                zznfVar.zzJ();
                zznfVar.zzK();
                zznfVar.zzj().name();
                zznfVar.zzU();
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbn
    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection openConnection = new URL(this.zza).openConnection();
                h0.r(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) openConnection;
            } else if (URLUtil.isHttpsUrl(this.zza)) {
                URLConnection openConnection2 = new URL(this.zza).openConnection();
                h0.r(openConnection2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) openConnection2;
            } else {
                throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            if (httpURLConnection.getResponseCode() != 200) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            e10.getMessage();
            return false;
        }
    }
}
