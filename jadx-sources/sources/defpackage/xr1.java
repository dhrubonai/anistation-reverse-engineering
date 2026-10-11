package defpackage;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xr1 {
    public static final xr1 c;
    public final nw2 a;
    public final nw2 b;

    static {
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        c = new xr1(o15Var, o15Var);
    }

    public xr1(List list, List list2) {
        this.a = nw2.o(list);
        this.b = nw2.o(list2);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        nw2 nw2Var = this.a;
        boolean isEmpty = nw2Var.isEmpty();
        nw2 nw2Var2 = this.b;
        if (isEmpty && nw2Var2.isEmpty()) {
            return jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < nw2Var.size(); i++) {
            jSONArray.put(((zv) nw2Var.get(i)).getClass().getSimpleName());
        }
        try {
            jSONObject.put("audio", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < nw2Var2.size(); i2++) {
                jSONArray2.put(((wr1) nw2Var2.get(i2)).getClass().getSimpleName());
            }
            jSONObject.put("video", jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            kb0.P("Effects", "JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return a().toString();
    }
}
