package defpackage;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ek7 extends am7 {
    public final /* synthetic */ byte o;
    public final /* synthetic */ s25 p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ek7(s25 s25Var, Object obj, byte b) {
        super(s25Var, false);
        this.o = b;
        this.q = obj;
        this.p = s25Var;
    }

    @Override // defpackage.am7
    public final void i() {
        byte b = this.o;
        int i = 0;
        Object obj = this.q;
        s25 s25Var = this.p;
        switch (b) {
            case 0:
                qk7 qk7Var = s25Var.c;
                wk7 j = j();
                gr3 gr3Var = (gr3) obj;
                qk7Var.getClass();
                MediaInfo mediaInfo = gr3Var.x;
                tr3 tr3Var = gr3Var.y;
                if (mediaInfo == null && tr3Var == null) {
                    ze0.k("MediaInfo and MediaQueueData should not be both null");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = gr3Var.x;
                    if (mediaInfo2 != null) {
                        jSONObject.put("media", mediaInfo2.f());
                    }
                    if (tr3Var != null) {
                        jSONObject.put("queueData", tr3Var.c());
                    }
                    jSONObject.putOpt("autoplay", gr3Var.z);
                    long j2 = gr3Var.A;
                    if (j2 != -1) {
                        Pattern pattern = qi0.a;
                        jSONObject.put("currentTime", j2 / 1000.0d);
                    }
                    jSONObject.put("playbackRate", gr3Var.B);
                    jSONObject.putOpt("credentials", gr3Var.F);
                    jSONObject.putOpt("credentialsType", gr3Var.G);
                    jSONObject.putOpt("atvCredentials", gr3Var.H);
                    jSONObject.putOpt("atvCredentialsType", gr3Var.I);
                    long[] jArr = gr3Var.C;
                    if (jArr != null) {
                        JSONArray jSONArray = new JSONArray();
                        while (i < jArr.length) {
                            jSONArray.put(i, jArr[i]);
                            i++;
                        }
                        jSONObject.put("activeTrackIds", jSONArray);
                    }
                    jSONObject.putOpt("customData", gr3Var.E);
                    jSONObject.put("requestId", gr3Var.J);
                } catch (JSONException e) {
                    zk3 zk3Var = gr3.K;
                    Log.e(zk3Var.a, zk3Var.c("Error transforming MediaLoadRequestData into JSONObject", e));
                    jSONObject = new JSONObject();
                }
                long n = qk7Var.n();
                try {
                    jSONObject.put("requestId", n);
                    jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "LOAD");
                } catch (JSONException unused) {
                }
                qk7Var.m(n, jSONObject.toString());
                qk7Var.j.a(n, j);
                return;
            case 1:
                qk7 qk7Var2 = s25Var.c;
                wk7 j3 = j();
                qk7Var2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long n2 = qk7Var2.n();
                long j4 = ((xs3) obj).a;
                try {
                    jSONObject2.put("requestId", n2);
                    jSONObject2.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "SEEK");
                    jSONObject2.put("mediaSessionId", qk7Var2.b());
                    Pattern pattern2 = qi0.a;
                    jSONObject2.put("currentTime", j4 / 1000.0d);
                } catch (JSONException unused2) {
                }
                qk7Var2.m(n2, jSONObject2.toString());
                qk7Var2.g = Long.valueOf(j4);
                qk7Var2.n.a(n2, new y23(qk7Var2, j3));
                return;
            default:
                qk7 qk7Var3 = s25Var.c;
                wk7 j5 = j();
                long[] jArr2 = (long[]) obj;
                qk7Var3.getClass();
                if (jArr2 != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long n3 = qk7Var3.n();
                    try {
                        jSONObject3.put("requestId", n3);
                        jSONObject3.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "EDIT_TRACKS_INFO");
                        jSONObject3.put("mediaSessionId", qk7Var3.b());
                        JSONArray jSONArray2 = new JSONArray();
                        while (i < jArr2.length) {
                            jSONArray2.put(i, jArr2[i]);
                            i++;
                        }
                        jSONObject3.put("activeTrackIds", jSONArray2);
                    } catch (JSONException unused3) {
                    }
                    qk7Var3.m(n3, jSONObject3.toString());
                    qk7Var3.r.a(n3, j5);
                    return;
                }
                ze0.k("trackIds cannot be null");
                return;
        }
    }
}
