package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sf7 extends am7 {
    public final /* synthetic */ byte o;
    public final /* synthetic */ s25 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf7(s25 s25Var, byte b) {
        super(s25Var, true);
        this.o = b;
        switch (b) {
            case 4:
                Objects.requireNonNull(s25Var);
                this.p = s25Var;
                super(s25Var, false);
                return;
            case 5:
            default:
                Objects.requireNonNull(s25Var);
                this.p = s25Var;
                return;
            case 6:
                Objects.requireNonNull(s25Var);
                this.p = s25Var;
                super(s25Var, false);
                return;
        }
    }

    @Override // defpackage.am7
    public final void i() {
        byte b = this.o;
        s25 s25Var = this.p;
        switch (b) {
            case 0:
                s25Var.c.a(j(), 0, -1L, -1, null);
                return;
            case 1:
                s25Var.c.a(j(), 0, -1L, 1, null);
                return;
            case 2:
                qk7 qk7Var = s25Var.c;
                wk7 j = j();
                qk7Var.getClass();
                JSONObject jSONObject = new JSONObject();
                long n = qk7Var.n();
                try {
                    jSONObject.put("requestId", n);
                    jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "QUEUE_GET_ITEM_IDS");
                    jSONObject.put("mediaSessionId", qk7Var.b());
                } catch (JSONException unused) {
                }
                qk7Var.m(n, jSONObject.toString());
                qk7Var.w.a(n, j);
                return;
            case 3:
                qk7 qk7Var2 = s25Var.c;
                wk7 j2 = j();
                qk7Var2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long n2 = qk7Var2.n();
                try {
                    jSONObject2.put("requestId", n2);
                    jSONObject2.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "PAUSE");
                    jSONObject2.put("mediaSessionId", qk7Var2.b());
                } catch (JSONException unused2) {
                }
                qk7Var2.m(n2, jSONObject2.toString());
                qk7Var2.k.a(n2, j2);
                return;
            case 4:
                qk7 qk7Var3 = s25Var.c;
                wk7 j3 = j();
                qk7Var3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long n3 = qk7Var3.n();
                try {
                    jSONObject3.put("requestId", n3);
                    jSONObject3.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "STOP");
                    jSONObject3.put("mediaSessionId", qk7Var3.b());
                } catch (JSONException unused3) {
                }
                qk7Var3.m(n3, jSONObject3.toString());
                qk7Var3.m.a(n3, j3);
                return;
            case 5:
                qk7 qk7Var4 = s25Var.c;
                wk7 j4 = j();
                qk7Var4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long n4 = qk7Var4.n();
                try {
                    jSONObject4.put("requestId", n4);
                    jSONObject4.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "PLAY");
                    jSONObject4.put("mediaSessionId", qk7Var4.b());
                } catch (JSONException unused4) {
                }
                qk7Var4.m(n4, jSONObject4.toString());
                qk7Var4.l.a(n4, j4);
                return;
            default:
                qk7 qk7Var5 = s25Var.c;
                wk7 j5 = j();
                qk7Var5.getClass();
                JSONObject jSONObject5 = new JSONObject();
                long n5 = qk7Var5.n();
                try {
                    jSONObject5.put("requestId", n5);
                    jSONObject5.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "GET_STATUS");
                    bx3 bx3Var = qk7Var5.f;
                    if (bx3Var != null) {
                        jSONObject5.put("mediaSessionId", bx3Var.y);
                    }
                } catch (JSONException unused5) {
                }
                qk7Var5.m(n5, jSONObject5.toString());
                qk7Var5.q.a(n5, j5);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sf7(s25 s25Var, byte b, boolean z) {
        super(s25Var, false);
        this.o = b;
        this.p = s25Var;
    }
}
