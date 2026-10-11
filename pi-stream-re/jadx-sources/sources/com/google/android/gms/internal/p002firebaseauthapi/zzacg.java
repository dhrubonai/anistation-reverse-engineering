package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzao;
import e5.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import r.f;
import w7.b;

/* loaded from: classes.dex */
public final class zzacg extends AsyncTask<Void, Void, zzacj> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaci> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final FirebaseApp zzg;

    public zzacg(String str, String str2, Intent intent, FirebaseApp firebaseApp, zzaci zzaciVar) {
        b.o(str);
        this.zzb = str;
        b.s(firebaseApp);
        this.zzg = firebaseApp;
        b.o(str2);
        b.s(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        b.o(stringExtra);
        Uri.Builder buildUpon = Uri.parse(zzaciVar.zza(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        b.s(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaciVar);
        this.zze = zzaciVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzacj doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzaci zzaciVar = this.zzd.get();
            HttpURLConnection zza2 = zzaciVar.zza(url);
            zza2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzacv(zzaciVar.zza(), this.zzg, zzact.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.c(String.format("Error getting project config. Failed with %s %s", zza3, Integer.valueOf(responseCode)), new Object[0]);
                return zzacj.zzb(zza3);
            }
            zzafh zzafhVar = new zzafh();
            zzafhVar.zza(new String(zza(zza2.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                if (!zzafhVar.zza().contains(this.zzf)) {
                    return zzacj.zzb("UNAUTHORIZED_DOMAIN");
                }
                return zzacj.zza(this.zzf);
            }
            for (String str : zzafhVar.zza()) {
                if (zza(str)) {
                    return zzacj.zza(str);
                }
            }
            return null;
        } catch (zzaah e10) {
            zza.c(f.d("ConversionException encountered: ", e10.getMessage()), new Object[0]);
            return null;
        } catch (IOException e11) {
            zza.c(f.d("IOException occurred: ", e11.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e12) {
            zza.c(f.d("Null pointer encountered: ", e12.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzacj zzacjVar) {
        onPostExecute((zzacj) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            return errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : (String) zzaco.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e10) {
            zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e10)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzacj zzacjVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzaci zzaciVar = this.zzd.get();
        if (zzacjVar != null) {
            str = zzacjVar.zza();
            str2 = zzacjVar.zzb();
        } else {
            str = null;
            str2 = null;
        }
        if (zzaciVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str) && (builder = this.zze) != null) {
            builder.authority(str);
            zzaciVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).zzc());
        } else {
            zzaciVar.zza(this.zzb, zzao.zza(str2));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e10) {
            zza.c("Error parsing URL for auth domain check: " + str + ". " + e10.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }
}
