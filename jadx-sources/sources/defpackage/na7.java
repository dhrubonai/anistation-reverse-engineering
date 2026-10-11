package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class na7 extends fa7 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na7(l33 l33Var, HashSet hashSet, JSONObject jSONObject, long j, byte b) {
        super(l33Var);
        this.f = b;
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // defpackage.fa7
    /* renamed from: a */
    public final void onPostExecute(String str) {
        ia7 ia7Var;
        byte b = this.f;
        long j = this.e;
        HashSet hashSet = this.c;
        switch (b) {
            case 0:
                ia7 ia7Var2 = ia7.c;
                if (ia7Var2 != null) {
                    for (ba7 ba7Var : Collections.unmodifiableCollection(ia7Var2.a)) {
                        if (hashSet.contains(ba7Var.h)) {
                            k6 k6Var = ba7Var.e;
                            if (j >= k6Var.e && k6Var.d != 3) {
                                k6Var.d = 3;
                                l68.T.a(k6Var.e(), "setNativeViewHierarchy", str, k6Var.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                return;
            default:
                if (!TextUtils.isEmpty(str) && (ia7Var = ia7.c) != null) {
                    for (ba7 ba7Var2 : Collections.unmodifiableCollection(ia7Var.a)) {
                        if (hashSet.contains(ba7Var2.h)) {
                            k6 k6Var2 = ba7Var2.e;
                            if (j >= k6Var2.e) {
                                k6Var2.d = 2;
                                l68.T.a(k6Var2.e(), "setNativeViewHierarchy", str, k6Var2.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                return;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        byte b = this.f;
        JSONObject jSONObject = this.d;
        switch (b) {
            case 0:
                return jSONObject.toString();
            default:
                l33 l33Var = this.b;
                if (ha7.e(jSONObject, (JSONObject) l33Var.y)) {
                    return null;
                }
                l33Var.y = jSONObject;
                return jSONObject.toString();
        }
    }

    @Override // defpackage.fa7, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                onPostExecute((String) obj);
                return;
            default:
                onPostExecute((String) obj);
                return;
        }
    }
}
