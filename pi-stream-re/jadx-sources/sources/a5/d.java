package a5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final e5.a f98c = new e5.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f99a;

    /* renamed from: b, reason: collision with root package name */
    public final u f100b;

    public d(String str) {
        w7.b.o(str);
        this.f99a = str;
        this.f100b = new u(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5.a aVar = f98c;
        Status status = Status.f2358y;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f99a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f2356f;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f100b.setResult(status);
    }
}
