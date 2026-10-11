package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pe7 extends am7 {
    public final /* synthetic */ byte o = 0;
    public final /* synthetic */ int p;
    public final /* synthetic */ s25 q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe7(s25 s25Var, ur3[] ur3VarArr, int i) {
        super(s25Var, false);
        this.r = ur3VarArr;
        this.p = i;
        Objects.requireNonNull(s25Var);
        this.q = s25Var;
    }

    @Override // defpackage.am7
    public final void i() {
        byte b = this.o;
        boolean z = false;
        int i = this.p;
        Object obj = this.r;
        s25 s25Var = this.q;
        switch (b) {
            case 0:
                qk7 qk7Var = s25Var.c;
                wk7 j = j();
                int[] iArr = (int[]) obj;
                qk7Var.getClass();
                if (iArr.length != 0) {
                    JSONObject jSONObject = new JSONObject();
                    long n = qk7Var.n();
                    try {
                        jSONObject.put("requestId", n);
                        jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "QUEUE_REORDER");
                        jSONObject.put("mediaSessionId", qk7Var.b());
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < iArr.length; i2++) {
                            jSONArray.put(i2, iArr[i2]);
                        }
                        jSONObject.put("itemIds", jSONArray);
                        if (i != 0) {
                            jSONObject.put("insertBefore", i);
                        }
                        int i3 = qk7Var.i;
                        if (i3 != -1) {
                            z = true;
                        }
                        if (z) {
                            jSONObject.put("sequenceNumber", i3);
                        }
                    } catch (JSONException unused) {
                    }
                    qk7Var.m(n, jSONObject.toString());
                    qk7Var.v.a(n, new fk7(qk7Var, j));
                    return;
                }
                ze0.k("itemIdsToReorder must not be null or empty.");
                return;
            default:
                qk7 qk7Var2 = s25Var.c;
                wk7 j2 = j();
                ur3[] ur3VarArr = (ur3[]) obj;
                qk7Var2.getClass();
                if (ur3VarArr.length != 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    long n2 = qk7Var2.n();
                    try {
                        jSONObject2.put("requestId", n2);
                        jSONObject2.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "QUEUE_INSERT");
                        jSONObject2.put("mediaSessionId", qk7Var2.b());
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i4 = 0; i4 < ur3VarArr.length; i4++) {
                            jSONArray2.put(i4, ur3VarArr[i4].d());
                        }
                        jSONObject2.put("items", jSONArray2);
                        if (i != 0) {
                            jSONObject2.put("insertBefore", i);
                        }
                        int i5 = qk7Var2.i;
                        if (i5 != -1) {
                            z = true;
                        }
                        if (z) {
                            jSONObject2.put("sequenceNumber", i5);
                        }
                    } catch (JSONException unused2) {
                    }
                    qk7Var2.m(n2, jSONObject2.toString());
                    qk7Var2.s.a(n2, new fk7(qk7Var2, j2));
                    return;
                }
                ze0.k("itemsToInsert must not be null or empty.");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe7(s25 s25Var, int[] iArr, int i) {
        super(s25Var, false);
        this.r = iArr;
        this.p = i;
        Objects.requireNonNull(s25Var);
        this.q = s25Var;
    }
}
