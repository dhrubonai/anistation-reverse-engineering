package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class np5 extends Thread {
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np5(op5 op5Var) {
        super("ExoPlayer:SimpleDecoder");
        this.y = op5Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((op5) obj).j());
                return;
            default:
                HashMap hashMap = (HashMap) obj;
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : hashMap.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 65);
                                sb.append("Received non-success response code ");
                                sb.append(responseCode);
                                sb.append(" from pinging URL: ");
                                sb.append(uri);
                                Log.w("HttpUrlPinger", sb.toString());
                            }
                            httpURLConnection.disconnect();
                            return;
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (IOException | RuntimeException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
                        sb2.append("Error while pinging URL: ");
                        sb2.append(uri);
                        sb2.append(". ");
                        sb2.append(message);
                        Log.w("HttpUrlPinger", sb2.toString(), e2);
                        return;
                    }
                } catch (IndexOutOfBoundsException e3) {
                    String message2 = e3.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
                    sb3.append("Error while parsing ping URL: ");
                    sb3.append(uri);
                    sb3.append(". ");
                    sb3.append(message2);
                    Log.w("HttpUrlPinger", sb3.toString(), e3);
                    return;
                }
        }
    }

    public np5(HashMap hashMap) {
        this.y = hashMap;
    }
}
