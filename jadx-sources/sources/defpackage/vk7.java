package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vk7 extends am7 {
    public final /* synthetic */ byte o;
    public final /* synthetic */ double p;
    public final /* synthetic */ s25 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk7(s25 s25Var, double d, byte b) {
        super(s25Var, false);
        this.o = b;
        switch (b) {
            case 1:
                this.p = d;
                Objects.requireNonNull(s25Var);
                this.q = s25Var;
                super(s25Var, false);
                return;
            default:
                this.p = d;
                Objects.requireNonNull(s25Var);
                this.q = s25Var;
                return;
        }
    }

    @Override // defpackage.am7
    public final void i() {
        byte b = this.o;
        double d = this.p;
        s25 s25Var = this.q;
        switch (b) {
            case 0:
                qk7 qk7Var = s25Var.c;
                wk7 j = j();
                qk7Var.getClass();
                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                    JSONObject jSONObject = new JSONObject();
                    long n = qk7Var.n();
                    try {
                        jSONObject.put("requestId", n);
                        jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "SET_VOLUME");
                        jSONObject.put("mediaSessionId", qk7Var.b());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("level", d);
                        jSONObject.put("volume", jSONObject2);
                    } catch (JSONException unused) {
                    }
                    qk7Var.m(n, jSONObject.toString());
                    qk7Var.o.a(n, j);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 17);
                sb.append("Volume cannot be ");
                sb.append(d);
                throw new IllegalArgumentException(sb.toString());
            default:
                qk7 qk7Var2 = s25Var.c;
                wk7 j2 = j();
                if (qk7Var2.f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long n2 = qk7Var2.n();
                    try {
                        jSONObject3.put("requestId", n2);
                        jSONObject3.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d);
                        a34.y(qk7Var2.f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", qk7Var2.f.y);
                    } catch (JSONException unused2) {
                    }
                    qk7Var2.m(n2, jSONObject3.toString());
                    qk7Var2.z.a(n2, j2);
                    return;
                }
                throw new Exception();
        }
    }
}
