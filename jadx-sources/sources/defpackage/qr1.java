package defpackage;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qr1 {
    public final ar3 a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;
    public final xr1 f;
    public final l68 g;
    public final nw2 h;
    public long i;

    public qr1(pr1 pr1Var) {
        boolean z;
        boolean z2;
        boolean z3 = pr1Var.b;
        l68 l68Var = pr1Var.g;
        if (z3 && pr1Var.c) {
            z = false;
        } else {
            z = true;
        }
        io3.A("Audio and video cannot both be removed", z);
        if (d(pr1Var.a)) {
            if (pr1Var.d != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.n(z2);
            io3.n(!pr1Var.b);
            io3.n(pr1Var.f.a.isEmpty());
            io3.n(l68Var == l68.P);
        }
        l68Var.getClass();
        this.a = pr1Var.a;
        this.b = pr1Var.b;
        this.c = pr1Var.c;
        this.d = pr1Var.d;
        this.e = pr1Var.e;
        this.f = pr1Var.f;
        this.g = l68Var;
        this.h = pr1Var.h;
        this.i = -9223372036854775807L;
    }

    public static boolean d(ar3 ar3Var) {
        return Objects.equals(ar3Var.a, "androidx-media3-GapMediaItem");
    }

    public static JSONObject e(ar3 ar3Var) {
        String str;
        String valueOf;
        String uri;
        int lastIndexOf;
        JSONObject jSONObject = new JSONObject();
        vq3 vq3Var = ar3Var.b;
        qq3 qq3Var = ar3Var.e;
        if (vq3Var == null || (lastIndexOf = (uri = vq3Var.a.toString()).lastIndexOf(46)) <= 0 || lastIndexOf >= uri.length() - 1) {
            str = "UNSET";
        } else {
            str = uri.substring(lastIndexOf + 1);
        }
        jSONObject.put("extension", str);
        if (qq3Var.equals(pq3.i)) {
            jSONObject.put("clipping", "UNSET");
            return jSONObject;
        }
        long j = qq3Var.c;
        if (j == Long.MIN_VALUE) {
            valueOf = "END_OF_SOURCE";
        } else {
            valueOf = String.valueOf(j);
        }
        jSONObject.put("clippingStartMs", qq3Var.a);
        jSONObject.put("clippingEndMs", valueOf);
        return jSONObject;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pr1] */
    public final pr1 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }

    public final long b(long j) {
        long j2;
        boolean z = this.b;
        xr1 xr1Var = this.f;
        if (z) {
            j2 = -9223372036854775807L;
        } else {
            z62 listIterator = xr1Var.a.listIterator(0);
            j2 = j;
            while (listIterator.hasNext()) {
                j2 = ((zv) listIterator.next()).j(j2);
            }
        }
        if (this.c) {
            j = -9223372036854775807L;
        } else {
            z62 listIterator2 = xr1Var.b.listIterator(0);
            while (listIterator2.hasNext()) {
                ((wr1) listIterator2.next()).getClass();
            }
        }
        return Math.max(j2, j);
    }

    public final long c() {
        boolean z;
        long j = this.d;
        boolean z2 = false;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        long j2 = this.i;
        if (j2 == -9223372036854775807L) {
            qq3 qq3Var = this.a.e;
            boolean equals = qq3Var.equals(pq3.i);
            long j3 = qq3Var.b;
            long j4 = qq3Var.d;
            if (!equals) {
                io3.n(!qq3Var.f);
                if (j4 == Long.MIN_VALUE) {
                    j -= j3;
                } else {
                    if (j4 <= j) {
                        z2 = true;
                    }
                    io3.n(z2);
                    j = j4 - j3;
                }
            }
            this.i = j;
            long b = b(j);
            this.i = b;
            return b;
        }
        return j2;
    }

    public final JSONObject f() {
        Object obj;
        long j = this.d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mediaItem", e(this.a));
            jSONObject.put("effects", this.f.a());
            jSONObject.put("removeAudio", this.b);
            jSONObject.put("removeVideo", this.c);
            jSONObject.put("durationUs", j);
            if (j != -9223372036854775807L) {
                obj = Long.valueOf(c());
            } else {
                obj = "N/A";
            }
            jSONObject.put("presentationDuration", obj);
            return jSONObject;
        } catch (JSONException e) {
            kb0.P("EditedMediaItem", "JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return f().toString();
    }
}
