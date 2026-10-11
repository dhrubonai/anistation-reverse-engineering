package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tq6 {
    public final byte[] a;
    public final byte[] b;
    public final int c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final Set h;
    public final String i;

    public tq6(byte[] bArr, byte[] bArr2, int i, long j, int i2, int i3, int i4, Set set, String str) {
        str.getClass();
        this.a = bArr;
        this.b = bArr2;
        this.c = i;
        this.d = j;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = set;
        this.i = str;
    }

    public final boolean a(String str, String str2) {
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (b06.C(str, HttpRequest.DEFAULT_SCHEME, true)) {
                Set<String> set = this.h;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    for (String str3 : set) {
                        if (!lowerCase.equals(str3)) {
                            if (b06.A(lowerCase, "." + str3, false)) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (tq6.class.equals(cls)) {
                obj.getClass();
                tq6 tq6Var = (tq6) obj;
                if (this.c != tq6Var.c || this.d != tq6Var.d || this.e != tq6Var.e || this.f != tq6Var.f || this.g != tq6Var.g || !Arrays.equals(this.a, tq6Var.a) || !Arrays.equals(this.b, tq6Var.b) || !this.h.equals(tq6Var.h) || !a34.i(this.i, tq6Var.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((Arrays.hashCode(this.b) + ((Arrays.hashCode(this.a) + ((((((qx1.d(this.c * 31, this.d, 31) + this.e) * 31) + this.f) * 31) + this.g) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = h11.o("ValidatedShiroPlaybackPlan(playlistKey=", Arrays.toString(this.a), ", segmentKey=", Arrays.toString(this.b), ", maxPlaylistBytes=");
        o.append(this.c);
        o.append(", maxSegmentBytes=");
        o.append(this.d);
        o.append(", pngHeaderBytes=");
        o.append(this.e);
        o.append(", webpHeaderBytes=");
        o.append(this.f);
        o.append(", clearSyncByte=");
        o.append(this.g);
        o.append(", allowedHostSuffixes=");
        o.append(this.h);
        return qx1.q(o, ", fallbackUrl=", this.i, ")");
    }
}
