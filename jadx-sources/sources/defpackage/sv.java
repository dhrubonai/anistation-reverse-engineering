package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sv {
    public final zw a;
    public final String b;

    public sv(zw zwVar, String str) {
        this.a = zwVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sv) {
                sv svVar = (sv) obj;
                if (!this.a.equals(svVar.a) || !a34.i(this.b, svVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "AudioPreferenceResolution(track=" + this.a + ", fallbackMessage=" + this.b + ")";
    }
}
