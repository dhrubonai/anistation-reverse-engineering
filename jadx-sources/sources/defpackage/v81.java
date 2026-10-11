package defpackage;

import android.util.Base64OutputStream;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class v81 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w81 b;

    public /* synthetic */ v81(w81 w81Var, byte b) {
        this.a = b;
        this.b = w81Var;
    }

    private final Object a() {
        String byteArrayOutputStream;
        w81 w81Var = this.b;
        synchronized (w81Var) {
            try {
                sk2 sk2Var = (sk2) w81Var.a.get();
                ArrayList a = sk2Var.a();
                synchronized (sk2Var) {
                    byte b = 4;
                }
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < a.size(); i++) {
                    zx zxVar = (zx) a.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", zxVar.a);
                    jSONObject.put("dates", new JSONArray((Collection) zxVar.b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        switch (this.a) {
            case 0:
                return a();
            default:
                w81 w81Var = this.b;
                synchronized (w81Var) {
                    sk2 sk2Var = (sk2) w81Var.a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    sb1 sb1Var = (sb1) w81Var.c.get();
                    af2 af2Var = sb1Var.b;
                    synchronized (((HashSet) af2Var.y)) {
                        unmodifiableSet = Collections.unmodifiableSet((HashSet) af2Var.y);
                    }
                    boolean isEmpty = unmodifiableSet.isEmpty();
                    String str = sb1Var.a;
                    if (!isEmpty) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(' ');
                        synchronized (((HashSet) af2Var.y)) {
                            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) af2Var.y);
                        }
                        sb.append(sb1.a(unmodifiableSet2));
                        str = sb.toString();
                    }
                    synchronized (sk2Var) {
                        String str2 = str;
                        vz0 vz0Var = null;
                    }
                }
                return null;
        }
    }
}
