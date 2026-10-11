package defpackage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ou0 {
    public final /* synthetic */ byte a = 0;
    public nw2 b;
    public l68 c;
    public xr1 d;
    public boolean e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r0v1, types: [ew2, jw2] */
    public ou0(rr1 rr1Var, rr1[] rr1VarArr) {
        ?? ew2Var = new ew2(4);
        ew2Var.c(rr1Var);
        ew2Var.f(rr1VarArr);
        o15 g = ew2Var.g();
        io3.m("The composition must contain at least one EditedMediaItemSequence.", !g.isEmpty());
        this.b = nw2.o(g);
        this.c = l68.S;
        this.d = xr1.c;
    }

    public ou0 a() {
        return new ou0(this.b, this.c, this.d, this.e, this.f);
    }

    public ou0 b() {
        ou0 ou0Var = new ou0();
        ou0Var.b = this.b;
        ou0Var.c = this.c;
        ou0Var.d = this.d;
        ou0Var.e = this.e;
        ou0Var.f = this.f;
        return ou0Var;
    }

    public void c(List list) {
        io3.m("The composition must contain at least one EditedMediaItemSequence.", !list.isEmpty());
        this.b = nw2.o(list);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                nw2 nw2Var = this.b;
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < nw2Var.size(); i++) {
                        jSONArray.put(((rr1) nw2Var.get(i)).b());
                    }
                    jSONObject.put("sequences", jSONArray);
                    jSONObject.put("effects", this.d.a());
                    jSONObject.put("transmuxAudio", false);
                    jSONObject.put("transmuxVideo", this.e);
                    jSONObject.put("hdrMode", 0);
                    jSONObject.put("retainHdrFromUltraHdrImage", this.f);
                } catch (JSONException e) {
                    kb0.P("Composition", "JSON conversion failed.", e);
                    jSONObject = new JSONObject();
                }
                return jSONObject.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ou0() {
    }

    public ou0(nw2 nw2Var, l68 l68Var, xr1 xr1Var, boolean z, boolean z2) {
        boolean z3 = true;
        Iterator it = nw2Var.iterator();
        if (it.hasNext()) {
            ((rr1) it.next()).getClass();
        } else {
            z3 = false;
        }
        io3.m("Composition must have at least one non-looping sequence.", z3);
        this.b = nw2.o(nw2Var);
        this.c = l68Var;
        this.d = xr1Var;
        this.e = z;
        this.f = z2;
    }
}
