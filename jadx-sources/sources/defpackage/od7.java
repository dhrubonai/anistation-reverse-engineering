package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class od7 extends am7 {
    public final /* synthetic */ byte o;
    public final /* synthetic */ int[] p;
    public final /* synthetic */ s25 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od7(s25 s25Var, int[] iArr, byte b) {
        super(s25Var, false);
        this.o = b;
        switch (b) {
            case 1:
                this.p = iArr;
                Objects.requireNonNull(s25Var);
                this.q = s25Var;
                super(s25Var, true);
                return;
            default:
                this.p = iArr;
                Objects.requireNonNull(s25Var);
                this.q = s25Var;
                return;
        }
    }

    @Override // defpackage.am7
    public final void i() {
        byte b = this.o;
        int i = 0;
        int[] iArr = this.p;
        s25 s25Var = this.q;
        switch (b) {
            case 0:
                qk7 qk7Var = s25Var.c;
                wk7 j = j();
                qk7Var.getClass();
                if (iArr.length != 0) {
                    JSONObject jSONObject = new JSONObject();
                    long n = qk7Var.n();
                    try {
                        jSONObject.put("requestId", n);
                        jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "QUEUE_REMOVE");
                        jSONObject.put("mediaSessionId", qk7Var.b());
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < iArr.length; i2++) {
                            jSONArray.put(i2, iArr[i2]);
                        }
                        jSONObject.put("itemIds", jSONArray);
                        int i3 = qk7Var.i;
                        if (i3 != -1) {
                            i = 1;
                        }
                        if (i != 0) {
                            jSONObject.put("sequenceNumber", i3);
                        }
                    } catch (JSONException unused) {
                    }
                    qk7Var.m(n, jSONObject.toString());
                    qk7Var.u.a(n, new fk7(qk7Var, j));
                    return;
                }
                ze0.k("itemIdsToRemove must not be null or empty.");
                return;
            default:
                qk7 qk7Var2 = s25Var.c;
                wk7 j2 = j();
                qk7Var2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long n2 = qk7Var2.n();
                try {
                    jSONObject2.put("requestId", n2);
                    jSONObject2.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "QUEUE_GET_ITEMS");
                    jSONObject2.put("mediaSessionId", qk7Var2.b());
                    JSONArray jSONArray2 = new JSONArray();
                    int length = iArr.length;
                    while (i < length) {
                        jSONArray2.put(iArr[i]);
                        i++;
                    }
                    jSONObject2.put("itemIds", jSONArray2);
                } catch (JSONException unused2) {
                }
                qk7Var2.m(n2, jSONObject2.toString());
                qk7Var2.x.a(n2, j2);
                return;
        }
    }
}
