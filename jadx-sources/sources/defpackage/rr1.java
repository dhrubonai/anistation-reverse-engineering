package defpackage;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rr1 {
    public static final zw2 e = zw2.p(1, 2);
    public final o15 a;
    public final zw2 b;
    public final boolean c;
    public final boolean d;

    public rr1(rt3 rt3Var) {
        o15 g = ((jw2) rt3Var.y).g();
        this.a = g;
        boolean z = true;
        io3.m("The sequence must contain at least one EditedMediaItem.", !g.isEmpty());
        zw2 zw2Var = (zw2) rt3Var.z;
        if (zw2Var.contains(-2)) {
            if (qr1.d(((qr1) g.get(0)).a) && !zw2Var.contains(1) && !zw2Var.contains(2)) {
                z = false;
            }
            io3.m("If the first item in the sequence is a Gap, then forceAudioTrack or forceVideoTrack flag must be set", z);
        }
        this.b = zw2Var;
        this.c = zw2Var.contains(1);
        this.d = zw2Var.contains(2);
    }

    public final boolean a() {
        int i = 0;
        while (true) {
            o15 o15Var = this.a;
            if (i >= o15Var.A) {
                return false;
            }
            if (qr1.d(((qr1) o15Var.get(i)).a)) {
                return true;
            }
            i++;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                o15 o15Var = this.a;
                if (i < o15Var.A) {
                    jSONArray.put(((qr1) o15Var.get(i)).f());
                    i++;
                } else {
                    jSONObject.put("mediaItems", jSONArray);
                    jSONObject.put("trackTypes", new JSONArray((Collection) this.b));
                    jSONObject.put("isLooping", false);
                    return jSONObject;
                }
            }
        } catch (JSONException e2) {
            kb0.P("EditedSequence", "JSON conversion failed.", e2);
            return new JSONObject();
        }
    }

    public final String toString() {
        return b().toString();
    }
}
